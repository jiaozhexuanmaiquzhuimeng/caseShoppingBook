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
	font-size: 24px;
}
.椁� {
	font-size: 16px;
}
.c3 {
	color: #F00;
}
.img{
	padding-right:15px;}
.c4 {
	font-size: 22px;
}
.a{
	background-color:#E1E1E1;
	width:800px;
	height:100px;}
.a table tr td {
	font-size: 14px;
}
.鍚� {
	color: #F00;
}
.a2 {
	font-size: 22px;
	color: #F00;
}
#鎻愮幇 {
	font-size: 22px;
	color: #FFF;
	background-color: #06F;
}
.b1 {
	text-align: center;
}
.n1 {
	text-align: center;
}
.n2{
	width:850px;
	height:30px;
	background-color:#CCC;
	font-size: 18;
	text-align: center;
}
.n3{
	width: 25%;
	text-align: center;}
.n2 table {
	color: #0CF;
}
.n2 table {
	color: #000;
}
.m {
	font-size: 16px;
}
.m {
	font-size: 14px;
	color: #000;
}
.n2 table {
	font-size: 16px;
}
.c {
	font-size: 14px;
}
.n2 table {
	font-size: 14px;
}
</style>
	<title>顺带捎</title>
</head>
<body>
<p class="z2">
<nav id="nav">
<h3 class="c4" ng-if="pageTitleVisible">璐︽埛浣欓</h3>
<hr>
<div class="a">
  <table width="556" border="0">
    <tr>
      <td colspan="3">&nbsp;</td>
    </tr>
    <tr>
      <td width="139" height="35">褰撳墠璐︽埛浣欓锛�</td>
      <td width="45"><span class="a2">0</span> 鍏�      </td>
      <td width="358"><form name="form1" method="post" action="">
        <input type="submit" name="鎻愮幇" id="鎻愮幇" value="鎻愮幇">
      </form></td>
    </tr>
    <tr>
      <td height="30" colspan="3">&nbsp;</td>
    </tr>
  </table>
</div>
<br/>
<table width="802" border="0">
  <tr>
    <td width="106" align="center" valign="middle"><span class="m">璐︽埛璧勪骇鏄庣粏</span></td>
    <td width="60" align="center" valign="middle">&nbsp;</td>
    <td width="60" align="center" valign="middle">&nbsp;</td>
    <td width="80" align="center" valign="middle">&nbsp;</td>
    <td width="143" align="center" valign="middle">&nbsp;</td>
    <td width="109" align="center" valign="middle">&nbsp;</td>
    <td width="87" align="center" valign="middle">&nbsp;</td>
    <td width="105" align="center" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="center" valign="middle"><span class="m">鍒嗙被</span></td>
    <td align="center" valign="middle"><span class="m"><a href="javascript:" ng-repeat="item in data" ng-class="{'active': item.val === selected}" ng-bind="item.key" ng-click="choose(item)">鍏ㄩ儴</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="javascript:" ng-repeat="item in data" ng-class="{'active': item.val === selected}" ng-bind="item.key" ng-click="choose(item)">鍏呭��</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="javascript:" ng-repeat="item in data" ng-class="{'active': item.val === selected}" ng-bind="item.key" ng-click="choose(item)">浣欓娑堣垂</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="javascript:" ng-repeat="item in data" ng-class="{'active': item.val === selected}" ng-bind="item.key" ng-click="choose(item)">绗笁鏂规敮浠樻秷璐�</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="javascript:" ng-repeat="item in data" ng-class="{'active': item.val === selected}" ng-bind="item.key" ng-click="choose(item)">鏀粯澶辫触閫�娆�</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="javascript:" ng-repeat="item in data" ng-class="{'active': item.val === selected}" ng-bind="item.key" ng-click="choose(item)">璁㈠崟閫�娆�</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="javascript:" ng-repeat="item in data" ng-class="{'active': item.val === selected}" ng-bind="item.key" ng-click="choose(item)">鎻愮幇</a></span></td>
  </tr>
  <tr>
    <td align="center" valign="middle"><span class="m">鏃堕棿</span></td>
    <td align="center" valign="middle"><span class="m"><a href="#">浠婂ぉ</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="#">杩�7澶�</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="#">杩�15澶�</a></span></td>
    <td align="center" valign="middle"><span class="m"><a href="#">杩�1涓湀</a></span></td>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
  </tr>
</table>
<div class="n2">
  <table width="850" border="0" >
    <tr>
      <td width="210" height="31" align="center" valign="middle">鍒涘缓鏃堕棿</td>
      <td width="210" align="center" valign="middle">浜ゆ槗绫诲瀷	</td>
      <td width="210" align="center" valign="middle">閲戦鍙樻洿</td>
      <td width="220" align="center" valign="middle">浣欓</td>
    </tr>
  </table>
  <p><span class="z2"><img src="../images/dingdan/yue.png" width="850" height="309"></span></p>
</div>
</body>
</html>