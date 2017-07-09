<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html ng-app="app">
<head>
<meta charset="UTF-8">
<title>${user}</title>

</head>
<body ng-controller="controller_adm">


	<nav>
		<div class="nav-wrapper blue darken-1">
			<a href="/" class="brand-logo center ">Game</a>
			<ul id="nav-mobile" class="left hide-on-med-and-down">
			<li><a href="/">Home</a></li>
			</ul>
		</div>
	
	</nav>

	<div class="container ">
		<h3 class="center"> Administrador: ${sessionScope.usuario_logado.nome} </h3>
		<div id="area-adm"></div>


	


	<div id="corpo-site" ng-controller="controller_adm">
		<div class="container">
			<div id="tabela-crud">
				<table class="bordered highlight centered" id="tabela">
					<thead>
						<tr>
							<th>Id</th>
							<th>Nome Jogo</th>
							<th>Preço</th>
							<th>Categoria</th>
							<th>Opções</th>
						</tr>
					</thead>

					<tbody>
						<tr ng-repeat="jogo in games ">
							<td>{{jogo.cod}}</td>
							<td>{{jogo.nome}}</td>
							<td>{{jogo.preco | currency:'R$ ':2}}</td>
							<td>{{jogo.categoria}}</td>
							<td>

								<a
									href="#"
									class="btn" ng-click="openDivAtualizar(jogo.cod,jogo.nome,jogo.preco,jogo.categoria)">Editar</a> 
								 
								<a
								class="btn waves-effect red darken-1"
								href="/Game/{{jogo.cod}}/delete" type="submit">Excluir</a> <!-- Modal Editar -->
							</td>
						</tr>
					</tbody>
				</table>
			</div>

		</div>
		<br><br><br>
		<div  class = "container" ng-show="showEdiarDiv">
			<div class="center" id="modal-container">
				<h3 class="center">Editar Jogos</h3>
				<div class="row">
					<form class="col s12" action="/Game/update" method="post">
						<input type="hidden" name="codGame" value="{{edit.codigoGame}}">
						<div class="row">
							<div class="input-field col s12">
								<input placeholder="Digite o nome do Produto" id="NomeProduto"
									name="nomeGame" type="text" value="{{edit.nomeGame}}"
									class="validate"> <label for="NomeProduto">Nome
									do Produto </label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12">
								<input placeholder="Digite o Preço do Produto" name="precoGame"
									id="PrecoProduto" type="number" step="any"
									value="{{edit.precoGame}}" class="validate"> <label
									for="PrecoProduto">Preço do Produto </label>
							</div>
						</div>

						<div class="row">
							<div class="input-field col s12">
								<select name="categoriaGame">
									<option value="{{edit.categoriaGame}}" selected>{{edit.categoriaGame}}</option>
									<option value="Xbox360">Xbox 360</option>
									<option value="XboxOne">Xbox one</option>
									<option value="Play4">Playstation 4</option>
									<option value="PC">Computador</option>
								</select> <label>Selecione a Plataforma:</label>
							</div>

						</div>
						
						<button class="waves-effect waves-light btn-large" type="submit">Salvar</button>
						<a  ng-click = "close(false)";
							class="modal-action modal-close waves-effect red darken-1 btn-large">Cancelar</a>
					</form>
				</div>
			</div>

		</div>
		<!-- Modal Structure Register-->
		<div id="modal1" class="modal">
			
			<div class="modal-content">
				<div class="">
					<h3 class="center">Cadastro de Jogos</h3>
					<div class="row">
						<form class="col s12 center" action="/Game/add" method="post"
							>
							<div class="row">
								<div class="input-field col s12">
									<input placeholder="Digite o nome do Produto" id="NomeProduto"
										name="nomeGame" type="text" class="validate" > <label
										for="NomeProduto">Nome do Produto </label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s12">
									<input placeholder="Digite o Preço do Produto" name="precoGame"
										id="PrecoProduto" type="number" step="any" class="validate">
									<label for="PrecoProduto">Preço do Produto </label>
								</div>
							</div>

							<div class="row">
								<div class="input-field col s12">
									<select name="categoriaGame">
										<option value="" disabled selected>Plataformas</option>
										<option value="Xbox 360">Xbox 360</option>
										<option value="Xbox One">Xbox one</option>
										<option value="Playstation4">Playstation 4</option>
										<option value="PC">Computador</option>
									</select> <label>Selecione a Plataforma:</label>
								</div>

							</div>
							<div class="row">
								<div class="input-field col s12">
									<input placeholder="Digite o URL do Produto" id="urlProduto"
										name="url" type="text" class="validate" > <label
										for="urlProduto">URL do Produto </label>
								</div>
							</div>
							<button  class="waves-effect waves-light btn-large " type="submit" >Salvar</button>
							<a href="#!" class="modal-action modal-close waves-effect red darken-1 btn-flat btn-large">Cancelar</a>
						</form>
					</div>
				</div>
			</div>

		</div>


		<!-- Modal Structure Edit -->
		
		<div class="fixed-action-btn">
			<a
				class="btn-floating btn-large waves-effect blue darken-1  trigger-modal"
				data-target="modal1"><i class="material-icons">add</i></a>
		</div>


	</div>





	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="../../js/function.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script type="text/javascript" src="../../js/controller_adm.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
	<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
		rel="stylesheet">
	<link rel="stylesheet" href="../../css/style.css">


</body>
</html>
