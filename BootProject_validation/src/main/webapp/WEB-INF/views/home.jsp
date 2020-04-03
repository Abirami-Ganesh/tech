<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.err
{
color:red;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="processform" modelAttribute="register" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><f:input path="username" /></td>
				<td><f:errors path="username" class="err" /></td>
				
			</tr>
			<tr>

				<td>Password</td>
				<td><f:password path="password" /></td>
				<td><f:errors path="password" class="err" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><f:input path="email" /></td>
				<td><f:errors path="email" class="err" /></td>

			</tr>

			<tr>
				<td>Gender</td>
				<td>Male <f:radiobutton path="gender" value="male" />Female <f:radiobutton
						path="gender" value="female" /></td>
				<td><f:errors path="gender" class="err" /></td>


			</tr>
			<tr>
				<td>Age</td>
				<td><f:input path="age" /></td>
				<td><f:errors path="age" class="err" /></td>
			</tr>


			<tr>
				<td>Address</td>
				<td><f:textarea path="address" /></td>
				<td><f:errors path="address" class="err" /></td>

			</tr>

			<tr>
				<td>DOB</td>
				<td><f:input path="dob" /></td>
				<td><f:errors path="dob" class="err" /></td>
			</tr>

			<tr>
				<td>Location</td>
				<td><f:select path="location">
						<f:option value="">--Select--</f:option>
						<f:option value="Chennai">Chennai</f:option>
						<f:option value="Coimbatore">Coimbatore</f:option>


					</f:select></td>
				<td><f:errors path="location" class="err" /></td>
			</tr>
			<tr>
			<td>Language</td>
			<td><f:checkbox path="language" value="Tamil"/>TAMIL
			<f:checkbox path="language" value="English"/>ENGLISH
			</td>
			<td><f:errors path="language" cssClass="err"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Clear"></td>

			</tr>

		</table>



	</f:form>




</body>
</html>