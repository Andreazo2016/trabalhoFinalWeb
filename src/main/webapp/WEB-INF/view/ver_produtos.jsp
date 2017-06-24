<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

</head>
<body>
<div id="nav">
		<c:import url="cabecalho.jsp" />
	</div>

	<div id="area-principal">


	<div class="container">
	
			<div class="row">
			<div class="col s6">
				<div id="area-game">
					<div id="img-ver">
						<div class="card Medium">
							<div class="card-image waves-effect waves-block waves-light">
								<img class="activator" src="http://lorempixel.com/400/200/">
							</div>
							<div class="card-content">
								<span class="card-title activator grey-text text-darken-4">Card
									Title<i class="material-icons right">more_vert</i>
								</span>
								<p>
									<a href="#">Adicionar ao Carrinho</a>
								</p>
							</div>
							<div class="card-reveal">
								<span class="card-title grey-text text-darken-4">Card
									Title<i class="material-icons right">close</i>
								</span>
								<p>Here is some more information about this product that is
									only revealed once clicked on.</p>
							</div>
						</div>
					</div>
				</div>



			</div>
			<div class="col s6">
				<div class="container" id="area-game-compra">
					<div>
						<h4 class="center"> Produto</h4>
						<div >
							<div class="card-panel ">
								<h5>Nome do Produto</h5>
								<p>R$:120</p>
								<form action="">
									<!-- criar a parte do alugar com calendario -->
								
								
								</form>
								<div class="row">
							<div class="col s6">
								<button type="button" class="btn">Comprar</button>
							</div>
							<div class="col s6">
								<button type="button" class="btn">Alugar</button>
							</div>


						</div>
							</div>
						</div>
						<br> <br>
						

					</div>



				</div>


			</div>
		</div>
		
	
	
	
	
	</div>
	




	</div>











	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="../../js/function.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
	<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
		rel="stylesheet">
	<link rel="stylesheet" href="../../css/style.css">

</body>
</html>