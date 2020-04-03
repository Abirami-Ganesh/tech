<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="register" method="POST" modelAttribute="register">
		<table align="center">
			<tr>
				<td><form:label path="userName">UserName:</form:label></td>
				<td><form:input type="text" name="userName" path="userName" id="userName" /></td>
				<td><form:errors path="userName"></form:errors>
			</tr>
			<tr>
				<td><form:label path="contactNumber">Contact Number</form:label></td>
				<td><form:input type="text" name="contactNumber"
						path="contactNumber" id="contactNumber" /></td>
				<td><form:errors path="contactNumber"></form:errors>
			</tr>
			<tr>
				<td><form:label path="emailId">Email Id</form:label></td>
				<td><form:input type="text" name="emailId" path="emailId"
						id="emailId" /></td>
				<td><form:errors path="emailId"></form:errors>
				<tr>
				<td><input type="submit" name="submit" id="submit" value="Register"></td>
				<td><input type="reset" name="clear" value="Cancel" id="clear" /></td>
			</tr>
			</tr></table>
			</form:form>
	
</body>
</html>