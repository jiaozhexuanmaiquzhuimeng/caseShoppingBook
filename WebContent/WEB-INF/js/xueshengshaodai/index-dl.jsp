<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录 - 通行证 - 顺带捎</title>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 100px;
	background-image: url(ima/bj007.png);
	font-family: "幼圆";
}
.a001 {
}
.b001 {
	font-size: 45px;
	font-weight: bold;
	font-family: "幼圆";
}
a:link {
	text-decoration: none;
	color: #000;
}
a:visited {
	text-decoration: none;
	color: #000;
}
a:hover {
	text-decoration: none;
	color: #0FF;
}
a:active {
	text-decoration: none;
	color: #F93;
	font-family: "幼圆";
}
.a002 {
	color: #666;
	font-family: "幼圆";
}
.a001 {
	font-family: "幼圆";
}
.q {	height:1400px;
	width:1024px;
	background:#09F;
	margin:auto;
}
.zi {	color:#FFF;
	font-size:16px;
	font-family:"MS Serif", "New York", serif;
	font-weight:bolder;
}
</style>
<script type="text/javascript">
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
</script>
</head>

<body onload="MM_preloadImages('ima/an002.png','ima/tengxun.png','ima/weixin.png','ima/weibo.png')">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="50" bgcolor="#09F"><span class="q">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="zi"><a href="../shouye.html">顺带捎&nbsp;</a> 丨&nbsp; 通行证</span></span></td>
  </tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="50">&nbsp;</td>
  </tr>
</table>
<table width="375" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="550" align="center" valign="middle" background="ima/白色003.png"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
              <td align="center" class="a001"><p><span class="b001">顺带捎</span></p>
                <p>登录顺带捎，方便你我他！</p></td>
            </tr>
        </table>
          <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
              <td><form id="form1" name="form1" method="post" action="">
                <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="8%" rowspan="5">&nbsp;</td>
                    <td height="25" colspan="2" align="center" valign="middle" class="a001"><label for="textfield"></label>
                      <img src="ima/yh001.png" width="16" height="16" />
                      <input type="text" name="textfield" id="textfield" /></td>
                    <td width="9%" rowspan="5">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25" colspan="2" align="center" valign="middle" class="a001"><img src="ima/mm001.png" width="16" height="16" />
                      <input type="password" name="textfield2" id="textfield2" /></td>
                    </tr>
                  <tr>
                    <td colspan="2" align="center" class="a001"><p><br />
                    </p></td>
                    </tr>
                  <tr>
                    <td height="15" colspan="2" align="center"><a href="../shouye.html"><img src="ima/an001.png" width="336" height="42" id="Image1" onmouseover="MM_swapImage('Image1','','ima/an002.png',1)" onmouseout="MM_swapImgRestore()" /></a></td>
                    </tr>
                  <tr>
                    <td width="41%" height="15" align="center"><p>
                      <label>
                        <input type="checkbox" name="CheckboxGroup1" value="automatic " id="CheckboxGroup1_0" />
                        下次自动登录</label>
                      <br />
                    </p></td>
                    <td width="42%" height="15" align="center"><a href="#" class="a001">忘记密码</a>丨<a href="#" class="a001">注册</a></td>
                  </tr>
                </table>
              </form></td>
            </tr>
</table>
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="35">&nbsp;</td>
            </tr>
          </table>
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="30" align="center" class="a002">第三方账号登录</td>
            </tr>
            <tr>
              <td height="20" align="center">&nbsp;</td>
            </tr>
          </table>
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td align="center"><a href="#"><img src="ima/tengxun1.png" width="42" height="42" id="Image2" onmouseover="MM_swapImage('Image2','','ima/tengxun.png',1)" onmouseout="MM_swapImgRestore()" /></a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#"><img src="ima/weixin1.png" width="42" height="42" id="Image3" onmouseover="MM_swapImage('Image3','','ima/weixin.png',1)" onmouseout="MM_swapImgRestore()" /></a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#"><img src="ima/weibo1.png" width="42" height="42" id="Image4" onmouseover="MM_swapImage('Image4','','ima/weibo.png',1)" onmouseout="MM_swapImgRestore()" /></a></td>
            </tr>
          </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
