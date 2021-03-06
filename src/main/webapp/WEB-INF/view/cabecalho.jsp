<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav>
	<div class="nav-wrapper  blue darken-1">
		<a href="#slide-out" id="efeito-lista" class="brand-logo"
			class="button-collapse"><i class="large material-icons">menu</i></a>
		<a href="/" class="brand-logo center  ">GameFlix</a>

		<div class="btn-login">

			<a class='dropdown-button  right' href='#' data-activates='dropdown1'>
				<i class="medium material-icons">perm_identity</i>
			</a>
		</div>
		<div class="right"></div>
		<c:if test="${sessionScope.usuario_logado == null }">
			<div class="btn-login">
				<p class="msg-login tooltipped" data-position="bottom"
					data-delay="50" data-tooltip="Bem-vindo ao Gameflix">Ola,Visetante
				</p>
			</div>
		</c:if>


		<div class="btn-login">
			<p class="msg-login tooltipped" data-position="bottom"
				data-delay="50"
				data-tooltip=" Bem-Vindo ${sessionScope.usuario_logado.nome}">${sessionScope.usuario_logado.nome}
			</p>
		</div>
		<!-- Dropdown Structure -->
		<ul id='dropdown1' class='dropdown-content container '>
			<c:if test="${sessionScope.usuario_logado == null }">
				<li id="btn-login"><a href="#" class="left"><i
						class=" material-icons left">input</i>login</a></li>

				<li id="btn-cad"><a href="#">cadastre-se</a></li>
			</c:if>
			<c:if test="${sessionScope.usuario_logado != null }">
				<li><a href="logout">Logout</a></li>
			</c:if>
			<c:if test="${sessionScope.usuario_logado.isAdmin}">
				<li><a href="/adm">Adm</a></li>
			</c:if>
		</ul>
	</div>
</nav>

<div class="container" id="show">

	<div style="width: 1000px;" class="card-panel   grey lighten-3">
		<div class="panel">
			<h4 class="center ">Categorias:</h4>
		</div>


		<div class="collection  light-blue lighten-1">
			<a href="#" class="collection-item center" id="xbox360"
				ng-click="showGameCategoriaXbox360()">Xbox 360</a> <a href="#" id="xboxone"
				class="collection-item center" ng-click="showGameCategoriaXboxOne()">Xbox
				One</a> <a href="#" class="collection-item center" id="ps4"
				ng-click="showGameCategoriaP4()">Playstation 4</a> <a href="#" id="pc"
				class="collection-item center" ng-click="showGameCategoriaPC()">Computador</a>
		</div>


	</div>



</div>
