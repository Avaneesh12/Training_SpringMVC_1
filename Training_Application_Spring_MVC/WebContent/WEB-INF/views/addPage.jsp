<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter Trainee Details</h2>
	<form action="returnTrainee" method="post">
		<table>
			<tr>
				<td>Trainee ID :</td>
				<td><input type="text" placeholder="Enter ID"/> </td>
				<td><form:errors path="traineeID" cssClass="error" /></td>
				
			</tr>
			<tr>
				<td>Trainee Name :</td>
				<td><input type="text" placeholder="Enter Name"/> </td>
				<td><form:errors path="traineeName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Trainee Location :</td>
				<td><input type="radio" />Chennai 
				<input type="radio" />Pune 
				<input type="radio" />Bangalore 
				<input type="radio" />Mumbai </td>
				<td><form:errors path="traineeLocation" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Trainee Domain :</td>
				<td><select>
					<option>AI</option>
					<option>ML</option>
					<option>Python</option>
				</select>
				
				</td>
				<td><form:errors path="traineeDomain" cssClass="error" /></td>
			</tr>
			<tr>
			<td></td>
			<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	
	
	
	
	
	</form>
</body>
</html>