<div >
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


	</div>