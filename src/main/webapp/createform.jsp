<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cr�er un d�partement</title>
</head>
<body>
	<div style="background-color:cornflowerblue; height:300px; padding: 1em; display:flex; flex-direction:column; justify-content:center; align-items:center; text-align: center">
		<h1 style="color:darkblue">Cr�ation d'un d�partement</h1>
		<h2 style="color:white">Vous pouvez ins�rer un nouveau d�partement en base de donn�es en saisissant son num�ro et nom</h2>
		
		<form action="CreateDeptPair" method="POST">
			<input style="padding:5px" type="text" name="dept-num" placeholder="Entrez un num�ro de d�partement"/>
			<br>
			<input style="margin-top: 5px; padding:5px" type="text" name="dept-nom" placeholder="Entrez un nom de d�partement"/>
			<br>
			<input style="margin-top: 1em; background-color:deepskyblue; padding:10px" type="submit" value="Envoyer"/>
		</form>
	</div>
</body>
</html>