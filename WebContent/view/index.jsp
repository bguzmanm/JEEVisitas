<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Visitas</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"´
	 rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Listado de Visitas</h1>
		
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Rut</th>
					<th scope="col">Fecha</th>
					<th scope="col">Nombre</th>
					<th scope="col">Dirección</th>
					<th scope="col">Realizada</th>
			</thead>
			<tbody>
				<c:forEach var="v" items="${visitas}">
					<tr>
						<td><c:out value="${v.getId()}"></c:out></td>
						<td><c:out value="${v.getRut()}"></c:out></td>
						<td><c:out value="${v.getFecha()}"></c:out></td>
						<td><c:out value="${v.getNombre()}"></c:out></td>
						<td><c:out value="${v.getDireccion()}"></c:out></td>
						<td><c:out value="${v.getRealizada()}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>