<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Delete région</title>
</head>
<body>
	<div style="background-color:blue; height:300px; display:flex; flex-direction:column; justify-content:center; align-items:center">
		<h1 style="color:red">Hello</h1>
		<p>Delete Région</p>
		
		<form action="RemoveDeptPair" method="POST">
			<input type="text" name="dept-num" placeholder="Entrez un numéro de département"/>
			<br>
			<input type="text" name="dept-nom" placeholder="Entrez un nom de département"/>
			<br>
			<input type="submit" value="Envoyer"/>
		</form>
	</div>
</body>
</html>