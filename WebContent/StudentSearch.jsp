<%-- The following two tags allow the use of the JSP and JSTL tags in this source text --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
	<link rel="stylesheet" type="text/css" href="css/WebAppExamples.css">
</head>
<body>
	<h1>Java Web Programming Exercise 8</h1>
	
	
	<div>
	    <h3>Search Student</h3>
	    
		
		<form action="studentListService" method="GET">
			<input type="submit" value="Show student" />
			<label>Student ID: </label>
			<input type="text" name="txtId" />
		</form>
		
		<br/><br/>

		<%-- If this JSP page is requested with a parameter called 'movieList' 
		     and the list is not empty, then show the data in an HTML table.
		 --%>
			<c:out value="${ student}" />
		
		<%-- If the list is empty, then show an appropriate message --%>
		<c:if test="${ studentList != null && studentList.size() == 0 }">
			No student found for the given id: <c:out value="${ txtId }" />
		</c:if>
	</div>

</body>
</html>