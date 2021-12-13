<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Student Detail Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Student</h3>
	
		<form:form action="saveStudent" modelAttribute="student" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="studentId" />
					
			<table>
				<tbody>
					<tr>
						<td><label>Name:</label></td>
						<td><form:input path="studentName" /></td>
					</tr>
					
					<tr>
						<td><label>Hobby:</label></td>
						<td><form:input path="studentDetail.hobby" /></td>
					</tr>
					
					<tr>
						<td><label>Punch Line:</label></td>
						<td><form:input path="studentDetail.punchline" /></td>
					</tr>
				
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/student/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










