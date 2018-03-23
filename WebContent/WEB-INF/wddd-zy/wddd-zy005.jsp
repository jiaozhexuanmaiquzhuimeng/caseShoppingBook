<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单 - 顺带捎</title>
<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="../css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="../css/form.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Dancing+Script:400,700' rel='stylesheet' type='text/css'>
<script src="../js/jquery.easydropdown.js"></script>
<script src="../js/responsiveslides.min.js"></script>
<script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
</script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
body,td,th {
	font-family: "Open Sans", sans-serif;
}
a:link {
	color: #000;
	text-decoration: none;
}
a:visited {
	text-decoration: none;
	color: #000;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
	color: #000;
}
</style>
</head>
<body>
    <!-- header-section-starts -->
	<div class="header">
		<div class="top-header">
			<div class="container">
				<div class="logo">
				  <p><a href="../index.html"><img src="../images/shundaishao.png" width="49" height="18"></a></p>
				</div>
				<div class="login-section">
					<ul>
						<li><a href="../xueshengshaodai/index-dl.html">登录</a>  </li> |
						<li><a href="../xueshengshaodai/zhucebiao.html">注册</a> &nbsp;</li>
					</ul>
			  </div>
				<!-- start search-->
<div class="search-box">
					    <div id="sb-search" class="sb-search">
							<form>
								<input class="sb-search-input" placeholder="请输入..." type="search" name="search" id="search">
								<input class="sb-search-submit" type="submit" value="">
								<span class="sb-icon-search"> </span>
							</form>
						</div>
  </div>
					<!-- search-scripts -->
					<script src="../js/classie.js"></script>
					<script src="../js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
					<!-- //search-scripts -->
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="bottom-header">
			<div class="container">
				<div class="logo">
			    <a href="../index.html">
					<h1>WELCOME</h1></a>
		    </div>
				<div class="header_bottom_right">
				<!-- start h_menu4 -->
					<div class="h_menu4">
					<a class="toggleMenu" href="">=</a>
					<ul class="nav">
						<li class="active"><a href="../index.html">首页</a></li>
						<li><a href="../products.html" >订餐</a>
							
						</li>
						<li><a href="../wddd.html"> 我的订单</a>
						
						</li>
						<li><a href="../xueshengshaodai/index-dl-zysdy.html">捎带员登录</a>
							
		    </li>
					    <li><a href="../contact.html">联系我们</a></li>
						</ul>
						<script type="text/javascript" src="../js/nav.js"></script>
				</div>
				<!-- end h_menu4 -->
				  <div class="clearfix"></div>
				</div>
			</div>
		</div>
</div>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	
	<div class="dreamcrub">
	<div class="container">
			   	 <ul class="breadcrumbs">
				 
                    <li class="home">
                       <a href="../index.html" title="Go to Home Page"><img src="../images/home.png" alt=""/></a>&nbsp;
                       <span>&gt;</span>
                    </li>
                    <li>我的订单</a>
                </li>
		   	    </ul>
                <ul class="previous">
               	  <li><a href="../index.html">返回首页</a></li>
                </ul>
                <div class="clearfix"></div>
			   </div>
			   </div>
			   <div class="container">
	   <div class="ft-ball">
	     <div class="rsidebar span_1_of_left">
	       <section  class="sky-form">
	         <div class="product_right">
	           <h3 class="m_2"><a href="../wddd.html">个人中心</a></h3>
	         </div>
	         <h4>我的订单</h4>
	         <div class="row row1 scroll-pane">
	           <div class="col col-4">
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox" checked="">
	               <a href="wddd-zy001.html">近三个月订单</a></label>
               </div>
	           <div class="col col-4">
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox">
	               <a href="wddd-zy002.html">待评价订单</a></label>
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox">
	               <a href="wddd-zy003.html">退单记录</a></label>
	           </div>
             </div>
	         <h4>我的资产</h4>
	         <div class="row row1 scroll-pane">
	           <div class="col col-4">
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox" checked="">
	               <a href="wddd-zy004.html">我的红包</a></label>
               </div>
	           <div class="col col-4">
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox">
	               <a href="wddd-zy005.html">账户余额</a></label>
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox">
	               <a href="wddd-zy006.html">我的金币</a></label>
	           </div>
             </div>
           </section>
	       <section  class="sky-form">
	         <h4>我的资料</h4>
	         <div class="row row1 scroll-pane">
	           <div class="col col-4">
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox" checked="">
	               <a href="wddd-zy007.html">个人资料</a></label>
               </div>
	           <div class="col col-4">
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox">
	               <a href="wddd-zy008.html">地址管理</a>
	             </label>
	             <label class="checkbox">
	               <input type="checkbox" name="checkbox">
	               <a href="wddd-zy009.html">修改密码</a></label>
	             
	           </div>
             </div>
           </section>
	       <section  class="sky-form">
	         <h4><a href="wddd-zy010.html">我的收藏</a></h4>
	       </section>
	     </div>
<div class="cont span_2_of_3">
  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="grzl001">
    <tr>
      <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="center">268.88</td>
            </tr>
        </table>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="center">当前余额（元）</td>
            </tr>
        </table></td>
    </tr>
  </table>
</div>
			  <div class="clearfix"></div>
		   </div>
</div>
<div class="shipping">
				<div class="container">
					<div class="shipping-section-grid">
					  <div class="clearfix"></div>
					</div>
				</div>
			</div>
	<!-- content-section-ends -->
	<!-- footer-section-starts -->
	<div class="footer">
	  <div class="container">
	    <div class="col-md-3 shop">
	      <h3>用户帮助</h3>
	      <ul>
	        <li><a href="#">我的客服</a></li>
          </ul>
        </div>
	    <div class="col-md-3 shop">
	      <h3>商务合作</h3>
	      <ul>
	        <li><a href="#">我要开店</a></li>
	        <li><a href="#">市场合作</a></li>
	        <li><a href="#">开放平台</a></li>
          </ul>
        </div>
	    <div class="col-md-3 shop">
	      <h3>关于我们</h3>
	      <ul>
	        <li><a href="#">顺带捎介绍</a></li>
	        <li><a href="#">加入我们</a></li>
	        <li><a href="#">联系我们</a></li>
	        <li><a href="#">规则中心</a></li>
          </ul>
        </div>
	    <div class="col-md-3 shop">
	      <h3>关注我们</h3>
	      <ul>
	        <li></li>
          </ul>
        </div>
	    <div class="clearfix"></div>
	    <div class="copy-rights">
	      <p>Shundaishao &copy;</p>
        </div>
      </div>
</div>
	<!-- footer-section-ends -->

</body>
</html>