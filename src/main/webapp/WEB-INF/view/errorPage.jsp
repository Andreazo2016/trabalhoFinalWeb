<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<c:import url="cabecalho_unico.jsp"></c:import>
<div class=" left">
	<img alt="" src="../../img/erro1.jpg">
</div>
	<div class="container">
		<h1>Erro : ${codErro }</h1>
		<h4>${erro}</h4>
		<a href="/" class="btn"> Voltar pra Home</a>
	</div>





	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>

	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
	<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
		rel="stylesheet">
	<link rel="stylesheet" href="../../css/style.css">


</body>

</html>