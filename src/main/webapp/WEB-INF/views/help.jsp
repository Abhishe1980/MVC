<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Help Page</title>
</head>
<body>
	<%
	/* String name = (String) request.getAttribute("name");
	Integer rollnumber = (Integer) request.getAttribute("rollnumber");
	LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	 */
	%>


	<h1>
		My name is
		<%-- 	<%=name%></h1> --%>
		${name}
		<h1>This is help page</h1>
		<h1>
			My Rollnumber
			<%-- <%=rollnumber%> --%>
			${rollnumber }
		</h1>
		<h1>
			Date And Time ${time }
			<%-- <%=time.toString() %> --%>
		</h1>
		<hr>


		<c:forEach var="item" items="${marks}">
			<h1>${item}</h1>
		</c:forEach>
</body>
</html>