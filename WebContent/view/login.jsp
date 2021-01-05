<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	´
	 rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<br/>
		<div class="col-5 bg-light mx-auto p-4 border">
		
			<form action="ControllerLogin" method="POST">
				
				<h3 class="text-center">Login</h3>
				<div class="mb-3">
					<label for="usr" class="form-label">Usuario:</label> 
					<input type="text" class="form-control" id="usr" name="usr">
				</div>
				<div class="mb-3">
					<label for="pwd" class="form-label">Password</label> 
					<input type="password" class="form-control" id="pwd" name="pwd">
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>

			</form>
		</div>
	</div>
</body>
</html>