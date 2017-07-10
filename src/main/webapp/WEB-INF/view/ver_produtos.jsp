<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html >
<head>

</head>
<body>
	<nav>
		<div class="nav-wrapper blue darken-1">
			<a href="/" class="brand-logo center ">Game</a>
			<ul id="nav-mobile" class="left hide-on-med-and-down">

				<li><a href="/">Voltar</a></li>
			</ul>
			<ul id="nav-mobile" class="right hide-on-med-and-down btn-login">
				<c:if test="${sessionScope.usuario_logado == null }">
					<li id="btn-ver-game"><p class="msg-login tooltipped"
							data-position="bottom" data-delay="50"
							data-tooltip="Só é permitido comprar se estiver logado">
							Usuario não Logado</p></li>
				</c:if>
				<c:if test="${sessionScope.usuario_logado != null }">
					<li class="dropdown-button" data-activates='dropdown1'><a
						href="#">Olá, ${sessionScope.usuario_logado.nome}</a> <!-- Dropdown Structure -->
					</li>
					<ul id='dropdown1' class='dropdown-content'>

						<li><a href="/logout"><i class="material-icons">input</i>Logout</a></li>

					</ul>
					<li><a href="#modal2"><i class="material-icons">shopping_cart</i></a></li>
				</c:if>


			</ul>
		</div>

	</nav>

	<div id="area-principal">


		<div class="container">

			<div class="row">
				<div class="col s6">
					<div id="area-game">


						<div id="img-ver">
							<div class="card Medium ">
								<div class="card-image waves-effect waves-block waves-light">
								<div class="container">
									<img   src="${sessionScope.game.url }" width="10px">
								</div>
									
								</div>
								<div class="card-content">
									<span class="card-title center grey-text text-darken-4">${sessionScope.game.nomeGame}
										<i class="material-icons right">swap_vertical_circle</i>
									</span>
									<p>

										<a href="#" class="btn activator deep-orange">Alugar Jogo</a>
										<a href="/addGameCarro/${sessionScope.game.codGame}"
											class="btn deep-orange ">Add Carro</a>
									</p>
								</div>
								<div class="card-reveal ">
									<span class="card-title grey-text text-darken-4"> Alugar
										Game <i class="material-icons right">close</i>
									</span>
									<p>Data de Fim de Aluguel</p>
									<form action="/addGameData">
										<!-- criar a parte do alugar com calendario -->
										<input type="hidden" value="${sessionScope.game.codGame}"
											name="id"> <input type="date" name="data">
										<button type="submit" class="btn deep-orange">add
											Carro</button>
									</form>
								</div>
							</div>
						</div>

					</div>



				</div>

				<div class="col s6">
					<div class="container" id="area-game-compra">
						<div>
							<h4 class="center deep-orange white-text accent-3 msg-card">Produto</h4>
							<div>
								<div class="card-panel  ">
									<div class=" card-panel  ">
										<h5 class=" blue-text center">${sessionScope.game.nomeGame}</h5>
										<p class ="blue-text">R$: ${sessionScope.game.precoGame}</p>
										<p class ="blue-text">Categoria: ${sessionScope.game.categoriaGame}</p>
									</div>



									<div class="row">
										<div class="col s6">
											<a href="#modal1" class="btn deep-orange">Comprar</a>
										</div>
										<div class="col s6">
											<a href="/" class="btn   deep-orange">mais jogos</a>
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
	<div class="container" id="login-section"
		ng-controller="controllerIndex">
		<c:import url="login_form.jsp"></c:import>

	</div>



	<!-- Modal Structure -->
	<div id="modal1" class="modal">
		<div class="modal-content">
			<div class="card-panel">
				<h4 class="center">Compra individual</h4>
			</div>

			<div class="card-panel">
				<h4>Informação da compra:</h4>
				<h4>Nome do Jogo : ${sessionScope.game.nomeGame}</h4>
				<h4>Preço do Jogo : ${sessionScope.game.precoGame}</h4>

			</div>


		</div>
		<div class="modal-footer">

			<form action="/addCarro">
				<input type="hidden" value="${sessionScope.game.codGame}"
					name="codGame"> <input type="number"
					placeholder="Digite a quantidade do produto" name="qtd_produto">
				<button type="submit" class="btn ">Comfirmar</button>
			</form>


		</div>
	</div>
	<!-- Modal Carrinho -->
	<!-- Modal Structure -->
	<div id="modal2" class="modal" style="width: 900px">
	<!-- 
	
		<div class="modal-content">
			<div class="card-panel deep-orange">
				<h5 class=" white-text center">Carrinho de Compra do:
					${sessionScope.usuario_logado.nome }</h5>
			</div>

			<div class="card-panel">
				<div class="panel">
					<table class="table bordered centered">
						<thead>
							<tr>

								<th>Nome do Game</th>
								<th>Preço do Game</th>
								<th>Emprestado até</th>
								<th>Ação</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="item" items="${sessionScope.carroCompra.itens}">
								<tr>
									<td>${item.game.nomeGame}</td>
									<td>${item.game.precoGame}</td>
									<td>${item.fimALuguel}</td>
									<td><a href="#" class="btn">Editar</a></td>
									<td><a href="/removeGameCarro/${item.game.codGame}" class="btn">Excluir</a></td>
								</tr>

							</c:forEach>


						</tbody>
					</table>

				</div>


			</div>
			<br>
			<div class="right">
				<h4>
					<span class="blue-text">Total: R$
						${sessionScope.carroCompra.preco}</span>
				</h4>
			</div>
			<div class="left">

				<a href="/vendaCarro"
					class=" btn modal-action modal-close waves-effect waves-green deep-orange">Finalizar
					Venda</a>
			</div>

		</div>
	
	 -->
		
<c:import url="modal_carro.jsp"></c:import>

	</div>




	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script src="../../js/controllerIndex.js"></script>

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