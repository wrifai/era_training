<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Manager</title>
		
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
	<style>
		a {color: #000;}
		a:hover {color: #f00;}
		span:hover {color: #f00;}
	</style>
</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	<div class="container">
	<br>
		<h1>
			Add Student  
		</h1>
		<div class="row">
		
			<form action="<spring:url value="/student/add"/>" method="post" class="col-md-8 col-md-offset-2">
			
				<div class="form-group">
					<label for="student-firstname">First Name</label>
					<input type="text" id="firstname" 
							class="form-control" name="firstname"/>
				</div>
				
				<div class="form-group">
					<label for="student-lastname">Last Name</label>
					<input type="text" id="lastname" 
							class="form-control" name="lastname"/>
				</div>

				<div class="form-group">
					<label for="student-uid">UID</label>
					<input type="text" id="u_id" 
							class="form-control" name="u_id"/>
				</div>
				
				<div class="form-group">
					<label for="student-phone">Phone</label>
					<input type="text" id="phone" 
							class="form-control" name="phone"/>
				</div>
							
				<div class="form-group">
					<label for="student-ssn">SSN</label>
					<input id="ssn" type="text" 
							class="form-control" name="ssn"/>
				</div>
			
				<div class="form-group">
					<label for="student-address">Address</label>
					<input id="address" type="text"
						class="form-control" name="address"/>
				</div>
			
				<div class="form-group">
					<label for="student-city">City</label>
					<input id="city" type="text"
						class="form-control" name="city"/>
				</div>
			
				<div class="form-group">
					<label for="student-state">State (two letters)</label>
					<input id="state" type="text"
						class="form-control" name="state"/>
				</div>
				
				<div class="form-group">
					<label for="student-zip">Zip</label>
					<input id="zip" type="text"
						class="form-control" name="zip"/>
				</div>
			
				<div>
					<button type="submit" class="btn btn-default">Submit</button>
					<br><br>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
