<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div
		style="background-color: cornflowerblue; height: 300px; padding: 1em; display: flex; flex-direction: column; justify-content: center; align-items: center; text-align: center">
		<h1 style="color: darkblue">Affichage d'un département</h1>
		<h2 style="color: white">Numéro du département : ${key.deptNum}</h2>
		<h2 style="color: white">Nom du département : ${key.deptName}</h2>
	</div>
</body>
</html>