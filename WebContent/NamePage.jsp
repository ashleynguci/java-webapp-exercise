<%-- 1. The following tag allows the use of the JSP tags in this file: --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%-- 2. The following tag allows the use of the JSTL core tags in this file: --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Greeting Form with JSP/JSTL</title>
	<link rel="stylesheet" type="text/css" href="css/WebAppExamples.css">
</head>
<body>
	<h1>Java Web Programming Exercise 6</h1>

	<h2>JSP/JSTL + Servlet</h2>

	<h6>Show your name below</h6>	
	<p>
		<%-- Here we display the greeting using a JSTL tag --%>
		<c:out value="Ashley Nguyen " />
	</p>
	

</body>
</html>