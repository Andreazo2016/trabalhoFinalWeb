<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="appindex">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body ng-controller="controllerIndex">
	<div id="nav">
		<c:import url="cabecalho_unico.jsp" />
	</div>

	<div class="container" id="show">

		<div style="width: 1000px;" class="card-panel   grey lighten-3">
			<div class="panel">
				<h4 class="center ">Categorias:</h4>
			</div>


			<div class="collection  light-blue lighten-1">
				<a href="#" class="collection-item center" id="xbox360"
					ng-click="showGameCategoriaXbox360()">Xbox 360</a> <a href="#"
					id="xboxone" class="collection-item center"
					ng-click="showGameCategoriaXboxOne()">Xbox One</a> <a href="#"
					class="collection-item center" id="ps4"
					ng-click="showGameCategoriaP4()">Playstation 4</a> <a href="#"
					id="pc" class="collection-item center"
					ng-click="showGameCategoriaPC()">Computador</a>
			</div>


		</div>



	</div>
	<div id="modal2" class="modal" style="width: 900px">
		<c:import url="modal_carro.jsp">

		</c:import>
	</div>

	<c:if test="${teste == 'failed' }">
		<div id="div-error">
			<h1 class="center red-text">${msgError}</h1>

		</div>

	</c:if>



	<div id="corpo">
		<div class=" card-panel" id="img-logo">
			<div class="slider">
				<ul class="slides">
					<li><img src="../../img/destaques/e31.JPG"> <!-- random image -->
						<div class="caption center-align">
							<h3>Lancamentos</h3>
							<h5 class="light grey-text text-lighten-3">Só aqui na
								GameFlix.</h5>
						</div></li>
					<li><img src="../../img/destaques/e31.JPG"> <!-- random image -->
						<div class="caption left-align">
							<h3>Venha Aproveitar</h3>
							<h5 class="light grey-text text-lighten-3">Só aqui na
								GameFlix.</h5>
						</div></li>
					<li><img src="../../img/destaques/e33.png"> <!-- random image -->
						<div class="caption right-align">
							<h3>Corre que está acabando</h3>
							<h5 class="light grey-text text-lighten-3">Só aqui na
								GameFlix.</h5>
						</div></li>
					<li><img src="../../img/destaques/e32.jpg"> <!-- random image -->
						<div class="caption center-align">
							<h3>Venha!</h3>
							<h5 class="light grey-text text-lighten-3">Só aqui na
								GameFlix.</h5>
						</div></li>
				</ul>
			</div>
		</div>

		<div id="cards" class=" container center">
			<h4 class="center">Destaques</h4>
			<div class="row">
				<div class="red-text center" ng-if="qtd_obj == 0">

					<h1>Não há Game nessa Categoria</h1>
					<h2>Desculpa, Escolha outra Categoria</h2>
				</div>





				<div class="col s5 m4" ng-repeat="game in games ">
					<div class="card horizontal  hoverable">
						<div class="card-image circle responsive-img">
							<img ng-src="{{game.url}}" width="10px" height="200px">
						</div>

						<div class="card-stacked  ">
							<div class="card-content">
								<p>{{game.nome}}</p>
								<p>{{game.categoria}}</p>
								<p>{{game.preco | currency:'R$ ': 2}}</p>



							</div>
							<div class="card-action">
								<a href="verGame/{{game.cod}}" class="btn  deep-orange">
									Mais</a>

							</div>
						</div>
					</div>
				</div>




			</div>


		</div>


	</div>
	<!-- Secção do Login -->
	<div class="container" id="login-section">

		<!-- <div class="container" id="login" >
		{{teste}}
			<div class="center">
				<div class="container" id="img-login">
					<img alt="login" src="../../img/login.png" style="width: 200px">
				</div>
				<div class="row ">
					<form class="col s12" name="formLogin" action="loginUser" id="login-in"
						method="get">
						<div class="row">
							<div class="col s12"></div>
						</div>
						<div class="row">
							<div class="input-field col s12">
							  <i class="material-icons prefix">account_circle</i>
								<input placeholder="Login" id="user" name="login"
									ng-model="userLogin" type="text" class="validate" required>
								<label for="user">Login: </label>

							</div>
							<p
								ng-class="{'selecionado':formLogin.user.$dirty && formLogin.user.$invalid}"
								ng-show=" formLogin.user.$dirty && formLogin.user.$invalid">Preencha
								o campo Login</p>
						</div>
						<div class="row">
							<div class="input-field col s12">
							 <i class="material-icons prefix">lock_outline</i>
								<input placeholder="Senha" name="senha" ng-model="userSenha"
									id="senhauser" type="password" class="validate"  required>
								<label for="senhauser">Senha: </label>

							</div>

							<p
								ng-class="{'selecionado':formLogin.senha.$dirty && formLogin.senha.$invalid}"
								ng-show="formLogin.senha.$dirty && formLogin.senha.$invalid">Preencha
								o campo Senha</p>

						</div>


						<button class="waves-effect waves-light btn" type="submit">Entrar</button>
						<button id="login-cancelar" class="waves-effect waves-light  btn">Cancelar</button>

					</form>
				</div>
			</div>


		</div> -->
		<c:import url="login_form.jsp"></c:import>


	</div>
	<!-- Secção do Cadastro -->
	<div id="cadastro-section" class="container">
		<div class="container ">
			<div id="corpo-cadastro">
				<h1 class="center">Cadastro</h1>
				<div class="container center">
					<div class="row">
						<form class="col s12" name="formCad" action="CadastroUser"
							method="post">
							<div class="row">
								<div class="input-field col s12">
									<input id="user_cpf" name="cpf" ng-model="cpfUser" ng-cpf
										ui-mask="999.999.999-99" type="text" class="validate" required>
									<label for="user_pcf">CPF: </label>
									<p
										ng-show="formCad.user_cpf.$invalid && formCad.user_cpf.$dirty">Erro</p>

								</div>
							</div>
							<div class="row">
								<div class="input-field col s12">

									<input placeholder="Login" id="login_user" name="login"
										ng-maxlength="12" type="text" class="validate" required>
									<label for="login_user">Login: </label>
								</div>

							</div>
							<div class="row">
								<div class="input-field col s12">
									<input placeholder=" Senha" id="senha_user" name="senha"
										type="password" class="validate" required> <label
										for="senha_user">Senha: </label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s12">
									<input placeholder="Nome" id="user_name" name="nome"
										type="text" class="validate" required> <label
										for="user_name">Nome: </label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s12">
									<input placeholder="Email" id="user_email" name="email"
										type="email" class="validate" required> <label
										for="user_email">email: </label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s12">
									<input placeholder="Endereço" name="endereco"
										ng-model="user_endereco" id="user_endereco" type="text"
										class="validate"> <label for="user_endereco" required>Endereço:
									</label>

								</div>
							</div>


							<button class="waves-effect waves-light btn" type="submit">Cadastrar</button>
							<button id="cad-cancelar" class="waves-effect waves-light btn">Cancelar</button>

						</form>
					</div>
				</div>

			</div>

		</div>


	</div>

	<div id="rodape"></div>



	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="../../js/function.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script src="../../js/controllerIndex.js"></script>

	<script src="../../js/mask.js"></script>


	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
	<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
		rel="stylesheet">
	<link rel="stylesheet" href="../../css/style.css">
</body>
</html>