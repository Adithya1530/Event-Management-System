<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Delete Event</title>
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap"
	rel="stylesheet">
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	font-family: 'Roboto', sans-serif;
	background-color: #f4f7fc;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
	padding: 20px;
}

.container {
	width: 100%;
	max-width: 600px;
	background: #fff;
	padding: 40px;
	border-radius: 10px;
	box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
	text-align: center;
}

h1 {
	font-size: 32px;
	margin-bottom: 30px;
	color: #333;
}

.form-group {
	margin-bottom: 20px;
	text-align: left;
	padding-left: 10px;
}

.form-group label {
	font-weight: 500;
	color: #555;
}

.form-group input, .form-group textarea {
	width: 100%;
	padding: 12px;
	font-size: 16px;
	margin-top: 5px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
	transition: border-color 0.3s;
}

.form-group input:focus, .form-group textarea:focus {
	border-color: #007bff;
	outline: none;
}

.form-group textarea {
	resize: vertical;
	height: 100px;
}

.btn {
	padding: 12px 25px;
	font-size: 18px;
	font-weight: 500;
	border-radius: 5px;
	border: none;
	cursor: pointer;
	transition: all 0.3s ease;
	width: 100%;
	margin-top: 20px;
	text-transform: uppercase;
}

.submit-btn {
	background-color: #28a745;
	color: white;
}

.submit-btn:hover {
	background-color: #218838;
}

.cancel-btn {
	background-color: #dc3545;
	color: white;
	margin-top: 10px;
}

.cancel-btn:hover {
	background-color: #c82333;
}

/* Responsive Design */
@media ( max-width : 600px) {
	.container {
		padding: 20px;
	}
	h1 {
		font-size: 28px;
	}
	.form-group input, .form-group textarea {
		font-size: 14px;
	}
	.btn {
		font-size: 16px;
	}
}
</style>
</head>
<body>

	<div class="container">
		<h1>Event Management Form</h1>


		<form action="findEventUpdate" method="post", >
			<div>
				<label for="id">Enter the Id</label>
				<input type="number" required="required" id="id" name="id" placeholder="Enter the ID">
			</div>
			
			<button type="submit" class="btn submit-btn">Submit Event</button>
		</form>
		<a href="index.jsp"><button type="submit" class="btn submit-btn">Back</button></a>
</body>
</html>
