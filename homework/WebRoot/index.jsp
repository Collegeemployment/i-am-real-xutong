<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>计算器页面首页</title>
	<meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <style type="text/css">
  body,td,th {
	font-size: 18px;
}
  </style>
  </head>
  
  <body>
  <table align="center" width="40%">
  <tr>
  		<td style="color: red;">
  			<s:fielderror>
			
  			</s:fielderror>
  		</td>
  </tr>
  </table>
  <form name="form1" method="post" action="reg.action?action=Reg">
    	<p>&nbsp;</p>
    	<p>&nbsp;</p>
   	<p>&nbsp;</p>
   	<table width="342" border="1" align="center">
  <tr>
    <td colspan="2" align="center" bgcolor="#00FFFF">计算器</td>
    </tr>
  <tr>
    <td width="106" align="center">第一个参数</td>
    <td width="205"><label for="textfield"></label>
      <input type="text" name="value1" id="value1"></td>
  </tr>
  <tr>
    <td align="center">运算符</td>
    <td><input type="radio" name="operatorNum" id="operatorNum" value="1">+
      <label for="radio"></label>
      <input type="radio" name="operatorNum" id="operatorNum" value="2">-
      <label for="radio2"></label>
      <input type="radio" name="operatorNum" id="operatorNum" value="3">*
      <label for="radio3"></label>
      <input type="radio" name="operatorNum" id="operatorNum" value="4">/
      <label for="radio4"></label></td>
  </tr>
  <tr>
    <td align="center">第二个参数</td>
    <td><label for="textfield3"></label>
      <input type="text" name="value2" id="value2"></td>
  </tr>
  <tr>
    <td height="41" colspan="2" align="center"><input type="submit" name="button" id="button" value="提交">
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" name="button2" id="button2" value="重置"></td>
    </tr>
</table>
  </form>
  </body>
</html>
