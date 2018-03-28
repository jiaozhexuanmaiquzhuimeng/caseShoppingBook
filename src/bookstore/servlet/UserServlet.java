package bookstore.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bookstore.domain.Person;
import bookstore.service.UserService;

/**
 * @author Guozhen_Zhao
 * 创建时间：2018年3月17日  下午2:22:45
 * 备注：
 */
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodName = request.getParameter("method");

		try {
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
			//获取私有成员变量
			method.setAccessible(true);
			method.invoke(this, request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}

	//用户登陆页面
	public void loginPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/js/xueshengshaodai/index-dl.jsp").forward(request, response);
	}

	UserService userService = new UserService();

	//点击登陆链接到首页
	public void indexPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("已进入");

		HttpSession session = request.getSession();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String ident = request.getParameter("ident");
		session.setAttribute("username", username);

		Person person = new Person();
		person.setUserName(username);
		person.setPassWord(password);
		Long i = userService.login(person);
		System.out.println(i);

		if (i == 1) {
			if ("buyer".equals(ident)) {
				request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
				return;
			} else if ("seller".equals(ident)) {
				request.getRequestDispatcher("/WEB-INF/js/maijia/mjxieyi001.jsp").forward(request, response);
			}
		} else {
			System.out.println("跳转失败。。。");
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
	}

	//点击注册，进入注册页面
	public void registerPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/js/xueshengshaodai/zhucebiao.jsp").forward(request, response);
	}

	//点击注册链接到首页
	public void index2Page(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String againpassword = request.getParameter("againpassword");
		String string = request.getParameter("ident");
		System.out.println(string);
		String message = "";
		if (username.equals("")) {
			message = "用户名不能为空";
		} else if (password.equals("")) {
			message = "密码不能为空";
		} else if (!(password.equals(againpassword))) {
			message = "两次密码不一致";
		} else {
			Person person = new Person();

			person.setUserName(username);
			person.setPassWord(password);
			Long info = userService.selectCountByUserName(username);
			System.out.println(info);
			if (info == 1) {
				message = "账户已存在，注册失败";
			} else if (info == 0) {
				userService.register(person);
			}
		}
		request.setAttribute("message", message);
		if ("".equals(message)) {
			request.getRequestDispatcher("/WEB-INF/js/xueshengshaodai/index-dI.jsp").forward(request, response);
			return;
		}
		request.getRequestDispatcher("/WEB-INF/js/xueshengshaodai/zhucebiao.jsp").forward(request, response);
	}

	//同意协议
	public void agreePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/js/maijia/index-maijia-first.jsp").forward(request, response);
	}

	//完善信息
	public void sellerInfoPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/js/maijia/index-maijia-first002.jsp").forward(request, response);
	}

	//完善信息
	public void sellerInfoOnePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = (String) request.getSession().getAttribute("username");
		
		//把上传的文件存放到项目下的upload文件夹里面，而上面的代码是获取upload在项目下的路径。
		String savePath = this.getServletContext().getRealPath("upload");
		System.out.println(savePath);
		File file = new File(savePath);

		List<String> paths = new ArrayList<>();
		if (!file.exists() && !file.isDirectory()) {
			file.mkdir();	//创建指定路径名称对应的目录
		}
		
		//创建FileItem对象的工厂
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// ServletFileUpload 负责处理上传的文件数据，并将表单中每个输入项封装成一个FileItem 对象中
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		if (!ServletFileUpload.isMultipartContent(request)) {
			return;
		}

		List<FileItem> list = null;
		try {
			list = upload.parseRequest(request);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String> values = new ArrayList<>();
		
		for (FileItem item : list) {
			if (item.isFormField()) {
				String name = item.getFieldName();
				//解决普通输入项的数据的中文乱码问题
				String value = item.getString("UTF-8");
				
				values.add(value);
			} else {
				String filename = item.getName();
				System.out.println(filename);
				if (filename == null || filename.trim().equals("")) {
					continue;
				}
				
				filename = filename.substring(filename.lastIndexOf("\\")+1);
				//获取item中的上传文件的输入流
				InputStream in = item.getInputStream();
				//创建一个文件输出流
				FileOutputStream out = new FileOutputStream(savePath + "\\" + filename);
				paths.add(filename);
				//创建一个缓冲区
				byte buffer[] = new byte[1024];
				//判断输入流中的数据是否已经读完的标识
				int len = 0;
				//循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
				while((len=in.read(buffer))>0){
				//使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "\\" + filename)当中
				out.write(buffer, 0, len);
				}
				
				
			}
		}

		String storeName = values.get(1);
		String name = values.get(2);
		String idCard = values.get(3);
		String address = values.get(4);
		String phone = values.get(5);
		String money = values.get(6);
		String Licence = values.get(7);
		String imgName = paths.get(0);
		String LicenceImg = paths.get(1);
		System.out.println(storeName);

		String message = "";

		if (storeName.equals("")) {
			message = "店名不能为空";
		} else if (name.equals("")) {
			message = "姓名不能为空";
		} else if (idCard.equals("")) {
			message = "请输入您的身份证号";
		} else if (address.equals("")) {
			message = "请输入您的地址";
		} else if (phone.equals("")) {
			message = "请输入您的手机号";
		} else if (Licence.equals("")) {
			message = "请输入您的食品流通许可证号";
		} else {
			Person person = new Person();

			person.setUserName(username);
			person.setStoreName(storeName);
			person.setName(name);
			person.setIdCard(idCard);
			person.setAddress(address);
			person.setPhone(phone);
			person.setLicence(Licence);
			person.setMoney(money);
			
			person.setImgAdress(imgName);
			person.setLicenceAdress(LicenceImg);

			Long info = userService.selectCountByStoreName(storeName);
			if (info == 1) {
				message = "店名重复, 请重新输入";
			} else if (info == 0) {
				userService.update(person);
			}
		}
		request.setAttribute("message", message);

		if (message.equals("")) {
			System.out.println("已修改。。。。。");
			request.setAttribute("imgName", imgName);
			request.getRequestDispatcher("/WEB-INF/js/maijia/index-maijia002.jsp").forward(request, response);
			return;
		}

		request.getRequestDispatcher("/WEB-INF/js/maijia/index-maijia-first002.jsp").forward(request, response);
	}

	//根据用户名将已有的属性显示到form表单中
	public void sellerInfoTwoPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = (String) request.getSession().getAttribute("username");
		Person person = userService.selectUserByUserName(username);

		request.setAttribute("person", person);
		request.getRequestDispatcher("/WEB-INF/js/maijia/index-maijia-first002.jsp").forward(request, response);

	}

}