<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<head>
	<style>
	.dropdown-toggle::after {
    	display:none
	}
	</style>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid row">
			<div class="navbar-header col-sm-9">
				<a class="navbar-brand" href="#">Course Management</a>
			</div>
			<div class="nav navbar-nav col-sm-3">
				<div class="row">
					<div class="col-sm-3">
						<a href="<spring:url value="/"/>" class="nav-link">Home</a>
					</div>
					<div class="col-sm-3">
						<div class="dropdown">
							<a href="#" class="nav-link dropdown-toggle"
								data-toggle="dropdown" role="button" aria-expanded="false"
								aria-haspopup="true" id="coursesDropdown">Courses</a>
							<ul class="dropdown-menu" role="menu"
								aria-labelledby="coursesDropdown">
								<li><a href="<spring:url value="/course/register"/>"
									class="dropdown-item">Create Registration</a></li>
								<li><a href="<spring:url value="/course/viewAllCourses"/>" 
									class="dropdown-item">View Available Courses</a></li>
								<li><a href="<spring:url value="/course/viewAllRegistrations"/>" 
									class="dropdown-item">Manage Registrations</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="dropdown">
							<a href="#" class="nav-link dropdown-toggle"
								data-toggle="dropdown" role="button" aria-expanded="false"
								aria-haspopup="true" id="teachersDropdown">Teachers</a>
							<ul class="dropdown-menu" role="menu"
								aria-labelledby="teachersDropdown">
								<li><a href="#" class="dropdown-item">Modify</a></li>
								<li><a href="<spring:url value="/teacher/viewAll"/>" class="dropdown-item">View All</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="dropdown">
							<a href="#" class="nav-link dropdown-toggle"
								data-toggle="dropdown" role="button" aria-expanded="false"
								aria-haspopup="true" id="studentsDropdown">Students</a>
							<ul class="dropdown-menu" role="menu"
								aria-labelledby="studentsDropdown">
								<li><a href="<spring:url value="/student/add"/>" class="dropdown-item">Add new</a></li>
								<li><a href="<spring:url value="/student/viewAll"/>" class="dropdown-item">View All</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</nav>
</body>