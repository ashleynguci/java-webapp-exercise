<%-- The following two tags allow the use of the JSP and JSTL tags in this source text --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Movie List</title>
	<link rel="stylesheet" type="text/css" href="css/WebAppExamples.css">
</head>
<body>
	<h1>Java Web Programming Examples</h1>
	<h2>JSP/JSTL + Servlet + DAO</h2>
	
	<div>
	    <h3>List of Movies</h3>
	    
		<form action="movieListService" method="GET">
			<input type="submit" value="Show movies" />
			<label>Filter movies by year: </label>
			<input type="text" name="txtYear" />
		</form>
		
		<br/><br/>

		<%-- If this JSP page is requested with a parameter called 'movieList' 
		     and the list is not empty, then show the data in an HTML table.
		 --%>
		<c:if test="${ movieList != null && movieList.size() > 0 }">
			<table>
				<thead>
					<tr>
						<th>Movie id</th><th>Movie name</th><th>Director</th><th>Year</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ movieList }" var="movieObject">
						<tr>
							<td><c:out value="${ movieObject.id}" /></td>
							<td><c:out value="${ movieObject.name }" /></td>
							<td><c:out value="${ movieObject.director }" /></td>
							<td><c:out value="${ movieObject.year }" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		
		<%-- If the list is empty, then show an appropriate message --%>
		<c:if test="${ movieList != null && movieList.size() == 0 }">
			No movies found for the given year: <c:out value="${ txtYear }" />
		</c:if>
	</div>

</body>
</html>