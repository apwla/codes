<%--
??վ: <a href="http://www.crazyit.org">????Java????</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2016, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>????ǰ?ĵ?¼ҳ??</title>
</head>
<body>
	<h3>????ǰ?ĵ?¼ҳ??</h3>
	<span style="color:red">${requestScope.tip}</span>
	<s:form action="login">
		<s:textfield name="user" label="?û???"/>
		<s:textfield name="pass" label="????"/>
		<s:submit value="??¼"/>
	</s:form>
</body>
</html>
