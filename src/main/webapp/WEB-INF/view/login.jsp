<html >
<head>
<title></title>
</head>


<body >
 <nav>
    <div class="nav-wrapper blue darken-1">
      <a href="/" class="brand-logo">Home</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="sass.html">Sass</a></li>
        <li><a href="badges.html">Components</a></li>
        <li><a href="login">Login</a></li>
      </ul>
    </div>
  </nav>

<div id="tela-login-externo" ng-app="loginApp">
<div id="div-login" ng-controller="loginController">
	<div class="container" id="img-login">
		<img alt="login" src="../../img/login.png" style="width: 200px">
	</div>

	<div id="login" classs="container center ">

		<div class="row center">
			<form class="col s12" name = "formLogin"  action="validarUser" method="post">
				<div class="row">
					<div class="col s12"></div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<input placeholder="Login" id="user" name="user" ng-model ="userLogin" type="text"
							class="validate" required> <label for="user">Login: </label>
							
					</div>
					<p ng-class = "{'selecionado':formLogin.user.$dirty && formLogin.user.$invalid}" ng-show=" formLogin.user.$dirty && formLogin.user.$invalid">Preencha o campo Login</p>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<input placeholder="Senha" name="senha" ng-model = "userSenha" id="senhauser"
							type="password" class="validate" required> <label for="senhauser">Senha:
						</label>
						
					</div>
					
					<p ng-class = "{'selecionado':formLogin.senha.$dirty && formLogin.senha.$invalid}"  ng-show="formLogin.senha.$dirty && formLogin.senha.$invalid">Preencha o campo  Senha</p>
					
				</div>


				<button class="waves-effect waves-light btn" type="submit">Entrar</button>
				<button class="waves-effect waves-light  btn" type="submit">Cancelar</button>

			</form>
		</div>
		
	</div>	
	</div>
		<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
		<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
		<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
		<script
		src="../../js/controller_login.js"></script>
		<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
		<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
		rel="stylesheet">
		<link href="../../css/style.css" rel="stylesheet" >
</body>
</html>