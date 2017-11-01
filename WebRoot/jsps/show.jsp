<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'show.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div>
    <table border="1px solid black">
    	<tr>
    		<td>编号</td>
    		<td>名字</td>
    		<td>性别</td>
    		<td>修改</td>
    		<td>删除</td>
    	</tr>
    	<c:forEach items="${list }" var="pre">
    	<tr>
    		<td>${pre.id }</td>
    		<td>${pre.name }</td>
    		<td>${pre.pender}</td>
    		<td><a href="<c:url value='/jsps/modify.jsp?id=${pre.id }'/>">修改</a></td>
    		<td><a href="<c:url value='/servlet/PreServlet?method=deletePre&id=${pre.id }'/>">删除</a></td>
    	</tr>
    	</c:forEach>
    </table>
    <a href="<c:url value='/jsps/add.jsp'/>">增加</a>
    </div>
  </body>
</html>
