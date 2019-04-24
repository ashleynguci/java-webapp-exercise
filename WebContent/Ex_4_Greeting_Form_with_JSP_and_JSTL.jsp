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
	<h1>Java Web Programming Examples</h1>

	<h2>JSP/JSTL + Servlet</h2>


	<form action="greetingService" method="POST">
		<p><label>First name: </label><input type="text" name="txtFirstName" /></p>
		<p><label>Last name: </label><input type="text" name="txtLastName" /></p>
		<p><input type="submit" value="Greet me!" /></p>
	</form>
		
		
	<p>
		<%-- Here we display the greeting using a JSTL tag --%>
		<c:out value="${ greetingString }" />
	</p>
	
	<p>
		<%-- Here is an example of using the JSTL if tag. No 'else' is available. --%>
		<c:if test="${ greetingString.length() >= 20 }">
 			<c:out value="Your name is quite long."/>
		</c:if>
		<c:if test="${ greetingString.length() < 20 }">
 			<c:out value="Your name is not very long."/>
		</c:if>
	</p>

</body>
</html>