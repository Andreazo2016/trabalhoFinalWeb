
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>

	
	
	<div class="container ">
		<h3 class="center">Cadastro Cliente</h3>
		<div id="area-adm"></div>

	</div>

	<div id="corpo-cadastro" >
		<div class="container center">
		
			<div class="row">
				<form class="col s12" action="CadastroUser" method="post">
					<div class="row">
						<div class="col s12"></div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<input placeholder="CPf" id="user_cpf" name="user_cpf"
								type="text" class="validate"> <label for="user_pcf">CPf:
							</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<input placeholder="Nome" id="user_name" name="user_name"
								type="text" class="validate"> <label for="user_name">Nome:
							</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<input placeholder="Email" id="user_email" name="user_email"
								type="email" class="validate"> <label for="user_email">email:
							</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<input placeholder="Endereço" name="user_endereco"
								id="user_endereco" type="text" class="validate"> <label
								for="user_endereco">Endereço: </label>
						</div>
					</div>


					<button class="waves-effect waves-light btn" type="submit">Cadastrar</button>
					<button class="waves-effect waves-light  btn" type="submit">Cancelar</button>

				</form>
			</div>
		</div>

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