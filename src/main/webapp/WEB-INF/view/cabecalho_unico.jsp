<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<ul id="dropdown1" class="dropdown-content">
	<c:if test="${sessionScope.usuario_logado == null }">
		<li  id="btn-login"><a href="#" class="left"><i
				class=" material-icons left"> person_pin</i>login</a></li>

		<li id="btn-cad"><a href="#">cadastrar</a></li>
	</c:if>

	<li class="divider"></li>
	<c:if test="${sessionScope.usuario_logado != null }">
		<li><a href="/logout"><i class=" material-icons left">input</i>Logout</a></li>
	</c:if>
	<c:if test="${sessionScope.usuario_logado.isAdmin == false}">
		<li><a href="/adm">Adm </a></li>
	</c:if>
</ul>
<nav>
	<div class="nav-wrapper blue darken-1">
		<a href="#slide-out" id="efeito-lista" class="brand-logo"
			class="button-collapse"><i class="large material-icons">menu</i></a>
		<a href="/" class="brand-logo center  ">GAMEFLIX</a>
		<ul class="right hide-on-med-and-down">
			<li><c:if test="${sessionScope.usuario_logado == null }">
					<div class="btn-login">
						<p class="msg-login tooltipped" data-position="bottom"
							data-delay="50" data-tooltip="Bem-vindo ao Gameflix">Ola, Visitante
						</p>
					</div>
				</c:if></li>

			<li><p class="msg-login tooltipped" data-position="bottom"
					data-delay="50"
					data-tooltip=" Bem-Vindo ${sessionScope.usuario_logado.nome}">${sessionScope.usuario_logado.nome}
				</p></li>
				<c:if test="${sessionScope.usuario_logado != null }">
					<li><a href="#modal2"><i class="material-icons ">shopping_cart</i></a></li>
				</c:if>
			
			<!-- Dropdown Trigger -->
			<li><a class="dropdown-button" href="#!"
				data-activates="dropdown1"><i class="material-icons right">perm_identity</i></a></li>
		</ul>
	</div>
</nav>