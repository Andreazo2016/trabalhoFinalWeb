
<div class="modal-content">
	<div class="" id="modal-container">
		<h3 class="center">Editar Jogos</h3>
		<div class="row">
			<form class="col s12" action="/updateGame"
				method="post">
				<input type="hidden" name="codGame" value="${param.codGame}">
				<div class="row">
					<div class="input-field col s12">
						<input placeholder="Digite o nome do Produto" id="NomeProduto"
							name="Gamename" type="text" value="${ param.nomeGame}"
							class="validate"> <label for="NomeProduto">Nome
							do Produto </label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<input placeholder="Digite o Preço do Produto" name="precoGame"
							id="PrecoProduto" type="number" step="any"
							value="${param.precoGame}" class="validate"> <label
							for="PrecoProduto">Preço do Produto </label>
					</div>
				</div>

				<div class="row">
					<div class="input-field col s12">
						<select name="categoria">
							<option value="${param.categoria}"  selected>${param.categoria }</option>
							<option value="Xbox 360">Xbox 360</option>
							<option value="Xbox One">Xbox one</option>
							<option value="Playstation4">Playstation 4</option>
							<option value="PC">Computador</option>
						</select> <label>Selecione a Plataforma:</label>
					</div>

				</div>
				<button class="waves-effect waves-light btn-large" type="submit">Salvar</button>
				<a href="#!"
					class="modal-action modal-close waves-effect waves-green btn-flat">Cancelar</a>
			</form>
		</div>
	</div>
</div>
