<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:useBean id="cal" scope="page" class="com.ch4.Calculator"></jsp:useBean>
<jsp:setProperty property="*" name="cal"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>结果页面</title>
  </head>
  
  <body>
    <%
    	cal.calculate();
    	out.println("运算结果: "+cal.getResult());
    %>
  </body>
</html>
