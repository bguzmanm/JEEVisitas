<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		Cookie miCookie = request.getCookies()[1];
	
		HttpSession sesion = request.getSession();
		
		out.println("<h1> Hola " + miCookie.getValue() + " " + sesion.getAttribute("apellido") + "</h1>");
	
	%>

</body>
</html>