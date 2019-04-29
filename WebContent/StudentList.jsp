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
	    <h3>List of Students</h3>
	    
		
		<br/><br/>

		<%-- If this JSP page is requested with a parameter called 'movieList' 
		     and the list is not empty, then show the data in an HTML table.
		 --%>
				
			<table>
				<thead>
					<tr>
						<th>Student ID</th><th>Last Name</th><th>First Name</th><th>Street</th><th>Post Office</th><th>Post code</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${ studentList }" var="studentObject">
						<tr>
						
							<td><c:out value="${ studentObject.id}" /></td>
							<td><c:out value="${ studentObject.lastname }" /></td>
							<td><c:out value="${ studentObject.firstname }" /></td>
							<td><c:out value="${ studentObject.street }" /></td>
							<td><c:out value="${ studentObject.postcode }" /></td>
							<td><c:out value="${ studentObject.postoffice }" /></td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
	
		
		<%-- If the list is empty, then show an appropriate message --%>
		<c:if test="${ studentList != null && studentList.size() == 0 }">
			No student found for the given id: <c:out value="${ txtId }" />
		</c:if>
	</div>

</body>
</html>