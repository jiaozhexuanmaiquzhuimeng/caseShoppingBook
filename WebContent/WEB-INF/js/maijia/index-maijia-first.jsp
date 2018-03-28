<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>卖家 - 顺带捎</title>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	background-image: url(../xueshengshaodai/ima/%E6%8D%8E%E5%B8%A6%E5%91%98/bjs001.png);
	margin-bottom: 100px;
}
.q {height:1400px;
	width:1024px;
	background:#09F;
	margin:auto;
}
.zi {color:#FFF;
	font-size:16px;
	font-family:"MS Serif", "New York", serif;
	font-weight:bolder;
}
.a001 {
	font-family: "微软雅黑";
	font-weight: bold;
	font-size: 16.4px;
}
.a002 {
	color: #666;
	font-family: "微软雅黑";
	font-size: 12px;
}
.a003 {
	font-family: "幼圆";
}
.a003 {
	font-family: "微软雅黑";
}
.a004 {
	color: #999;
	font-family: "微软雅黑";
	font-size: 14px;
}
.a005 {
	color: #000;
	font-family: "微软雅黑";
}
.youyuan {
	font-family: "幼圆";
}
.juli {
	font-size: 12px;
}
.dizhi {
	font-family: "华文细黑";
	font-size: 14px;
}
a:link {
	color: #000;
	text-decoration: none;
}
a:hover {
	color: #09F;
	text-decoration: none;
}
a:visited {
	text-decoration: none;
	color: #000;
}
a:active {
	text-decoration: none;
	color: #FF3;
}
.dengdai {color: #F36;
	font-family: "华文细黑";
	font-size: 14px;
}
.shangban001 {
	color: #0F0;
	font-family: "幼圆";
}
.wanshan {	background-image: url(ima/wanshan001.png);
	background-repeat: no-repeat;
	height: 40px;
	width: 164px;
}
</style>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="68" height="50" bgcolor="#09F">&nbsp;</td>
    <td width="49" bgcolor="#09F"><span class="zi" ><a href="../shouye.html" ><img src="ima/shundaishao.png" width="49" height="18" /></a></span></td>
    <td width="870" bgcolor="#09F"><span class="zi"> 丨&nbsp; 通行证</span></td>
    <td width="55" align="center" valign="middle" bgcolor="#09F"><a href="#"><img src="ima/shaodaiyuan/tx001.png" width="49" height="49" /></a></td>
    <td width="55" align="center" valign="middle" bgcolor="#09F"><a href="<%= request.getContextPath() %>"><span class="zi"> 注销</span></a></td>
  </tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30">&nbsp;</td>
  </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0" id="11651561">
  <tr>
    <td><table width="1121" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td width="210" align="center" valign="top"><table width="210" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="210" height="256" align="center" background="ima2/捎带员/资料白色001.png"><table width="210" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="210" height="120" align="center" >&nbsp;<a href="#"><img src="ima/shaodaiyuan/tx001.png" width="80" height="80" /></a></td>
              </tr>
              <tr>
                <td height="30" align="center"  class="a001"><span class="youyuan">${sessionScope.username }</span></td>
              </tr>
              <tr>
                <td height="30" align="center"  class="a002">德州 | 卖家</td>
              </tr>
              <tr>
                <td height="76" align="center" ><form id="form2" name="form1" method="post" action="userServlet?method=sellerInfoTwoPage">
                  <input name="button3" type="submit" class="wanshan" id="button3" />
                </form></td>
              </tr>
            </table></td>
          </tr>
        </table>
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="210" height="5" align="center">&nbsp;</td>
            </tr>
        </table></td>
        <td width="15">&nbsp;</td>
        <td valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="21" height="67" background="../xueshengshaodai/ima/捎带员/资料白色003.png">&nbsp;</td>
            <td width="253" background="../xueshengshaodai/ima/捎带员/资料白色003.png"><span class="a003">欢迎&nbsp;</span><span class="youyuan">${sessionScope.username }</span></td>
            <td width="107" background="../xueshengshaodai/ima/捎带员/资料白色003.png"><span class="a003">身份</span>：<span class="youyuan">卖家</span></td>
            <td width="515" background="../xueshengshaodai/ima/捎带员/资料白色003.png" class="a003">当前状态：<span class="dengdai">信息不完整</span></td>
          </tr>
        </table>
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="10">&nbsp;</td>
            </tr>
          </table>
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="700" valign="top" background="../xueshengshaodai/ima/捎带员"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td align="center"><p>&nbsp;</p>
                        <p>&nbsp;</p>
                        <p>&nbsp;</p>
                        <p>温馨提示：您的信息目前还不完整，完善信息后即可开店。</p></td>
                    </tr>
                  </table></td>
                </tr>
              </table></td>
            </tr>
          </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
