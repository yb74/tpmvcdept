<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire d'affichage de département</title>
</head>
<body>
	<div style="background-color:cornflowerblue; height:300px; padding: 1em; display:flex; flex-direction:column; justify-content:center; align-items:center; text-align: center">
		<h1 style="color:darkblue">Affichage d'un département</h1>
		<h2 style="color:white">Vous pouvez afficher un département en saisissant son numéro</h2>
		
		<form action="ShowDept" method="POST">
			<input style="padding:5px" type="text" name="dept-num" placeholder="Entrez un numéro de département"/>
			<br>
			<input style="margin-top: 1em; background-color:deepskyblue; padding:10px" type="submit" value="Envoyer"/>
		</form>
	</div>
</body>
</html>