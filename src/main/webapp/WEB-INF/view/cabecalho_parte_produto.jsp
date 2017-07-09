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
						
							<li><a href="#!"><i class="material-icons">input</i>Logout</a></li>

						</ul>
					<li><a href="#modal2"><i class="material-icons">shopping_cart</i></a></li>
				</c:if>


			</ul>
		</div>

	</nav>