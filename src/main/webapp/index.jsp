<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>
	<div style="background-color:blue; height:300px; display:flex; flex-direction:column; justify-content:center; align-items:center">
		<h1 style="color:red">Hello</h1>
		<p>Welcome to the homepage</p>
		
		<form action="ShowDept" method="POST">
			<input type="text" name="dept-num" placeholder="Entrez un num�ro de d�partement"/>
			<br>
			<input type="submit" value="Envoyer"/>
		</form>
	</div>
</body>
</html>