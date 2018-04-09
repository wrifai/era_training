<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Course Manager</title>
		
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
			Register for Course  
		</h1>
		<div class="row">
		
			<form action="<spring:url value="/course/add"/>" method="post" class="col-md-8 col-md-offset-2">
			
				<div class="form-group">
					<label for="student-uid">UID</label>
					<input type="text" id="u_id" 
							class="form-control" name="u_id"/>
				</div>
				
				<div class="form-group">
					<label for="course-id">Course ID</label>
					<input type="text" id="course_id" 
							class="form-control" name="course_id"/>
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
