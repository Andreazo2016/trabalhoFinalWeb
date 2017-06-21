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
							<button  class="waves-effect waves-light btn-large " type="submit" >Salvar</button>
							<a href="#!" class="modal-action modal-close waves-effect red darken-1 btn-flat btn-large">Cancelar</a>
						</form>
					</div>
				</div>
			</div>