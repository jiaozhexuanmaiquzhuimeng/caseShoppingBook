<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">

}
.c {
	color: #D6D6D6;
	font-size: 12px;
}
.鍚� {
	font-weight: bold;
}
.c2 {
}
.c1 {
	font-weight: bold;
	font-size: 22px;
}
.椁� {
	font-size: 16px;
}
.c3 {
	color: #F00;
}
.img{
	padding-right:15px;}
#绔嬪嵆缁戝畾 {
	font-size: 16px;
	background-color: #F03;
	color: #FFF;
}
.q {
	font-size: 12px;
	color: #C60;
}
.q1 {
	font-size: 14px;
}
.q1 {
	font-size: 14px;
}
.q2 {
	font-size: 14px;
	color: #999;
}
</style>
	<title></title>
</head>
<body>
<p class="z2">
<nav id="nav">
<h3 ng-if="pageTitleVisible"><span ng-bind="pageTitle">瀹夊叏涓績</span></h3>
<hr>
<div class="img"></div>
<table width="850" height="511" border="0">
  <tr>
    <td width="66" height="63" align="center" valign="middle"><img src="../images/dingdan/FOMAVTSLTP1D9QYB~BDPL8I.png" width="43" height="39"></td>
    <td width="140" align="center" valign="middle">瀹夊叏绛夌骇锛�</td>
    <td width="246" class="q">&nbsp;<img src="../images/dingdan/SH{GL67HTV0$KLMSGA)K{32.png" width="211" height="33">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
    <td width="291" class="q">&nbsp; 寤鸿浣犲惎鍔ㄥ叏閮ㄥ畨鍏ㄨ缃紝浠ヤ繚闅滆处鎴峰強璧勯噾瀹夊叏锛�</td>
    <td width="85">&nbsp;</td>
  </tr>
  <tr>
    <td height="86" align="center" valign="middle"><img src="../images/dingdan/FOMAVTSLTP1D9QYB~BDPL8I.png" width="43" height="39"><br></td>
    <td align="center" valign="middle"><span ng-class="item.status || 'security-type-name-weak'" ng-bind="item.name">鐧诲綍瀵嗙爜锛�</span></td>
    <td colspan="2" class="q1">浜掕仈缃戝瓨鍦ㄨ鐩楅闄╋紝寤鸿鎮ㄥ畾鏈熸洿鏀瑰瘑鐮佷互淇濇姢瀹夊叏銆�</td>
    <td><a target="" ng-href="/profile/security/changepassword" ng-class="item.status ? 'btn-link' : 'btn-stress'" ng-bind="item.text.link" href="#">鏇存敼瀵嗙爜</a></td>
  </tr>
  <tr>
    <td height="111" align="center" valign="middle"><img src="../images/dingdan/FOMAVTSLTP1D9QYB~BDPL8I.png" alt="" width="43" height="39"><br></td>
    <td align="center" valign="middle"><span ng-class="item.status || 'security-type-name-weak'" ng-bind="item.name">鎵嬫満楠岃瘉锛�</span></td>
    <td colspan="2">宸茬粦瀹氭墜鏈� 178*********</td>
    <td><a href="#">鏇存崲鎵嬫満</a></td>
  </tr>
  <tr>
    <td height="106" align="center" valign="middle"><img src="../images/dingdan/PGB85IHOPEW3X_T@N()NJOY.png" width="49" height="49"><br></td>
    <td align="center" valign="middle"><span ng-class="item.status || 'security-type-name-weak'" ng-bind="item.name">閭婵�娲伙細</span></td>
    <td colspan="2"><p class="q1" ng-bind="item.text.text">鎮ㄨ繕娌℃湁缁戝畾閭</p>
    <p class="q1" ng-if="item.text.textMore" ng-bind-html="item.text.textMore | toTrusted"><span class="q2">楠岃瘉鍚庡彲鐢ㄦ埛蹇�熸壘鍥炲瘑鐮侊紝鎺ュ彈璐︽埛鎻愰啋閭欢銆�</span></p></td>
    <td><form name="form1" method="post" action="">
      <input type="submit" name="绔嬪嵆缁戝畾" id="绔嬪嵆缁戝畾" value="绔嬪嵆缁戝畾">
    </form></td>
  </tr>
  <tr>
    <td height="133" align="center" valign="middle"><img src="../images/dingdan/FOMAVTSLTP1D9QYB~BDPL8I.png" alt="" width="43" height="39"></td>
    <td align="center" valign="middle">鏀粯棰濆害锛�</td>
    <td colspan="2"><p class="q1" ng-bind="item.text.text">宸茶瀹氭敮浠橀 50 鍏�</p>
    <p class="q1" ng-if="item.text.textMore" ng-bind-html="item.text.textMore | toTrusted"><span class="q2">濡傛灉褰撴棩鍦ㄧ嚎璁㈤閲戦瓒呭嚭鏀粯棰濆害锛屾墜鏈洪獙璇佸悗鎵嶅彲浠ヤ粯娆俱��</span></p></td>
    <td><a href="#">鏇存敼棰濆害</a></td>
  </tr>
</table>
</body>
</html>