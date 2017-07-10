<div class="container" id="login"  >
			<div class="center">
				<div class="container" id="img-login">
					<img alt="login" src="../../img/login.png" style="width: 200px">
				</div>
				<div class="row ">
					<form class="col s12" name="formLogin" action="/loginUser" id="login-in"
						method="post">
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
							
						</div>
						<div class="row">
							<div class="input-field col s12">
							 <i class="material-icons prefix">lock_outline</i>
								<input placeholder="Senha" name="senha" ng-model="userSenha"
									id="senhauser" type="password" class="validate"  required>
								<label for="senhauser">Senha: </label>

							</div>

						

						</div>


						<button class="waves-effect waves-light btn" type="submit">Entrar</button>
						<button id="login-cancelar" class="waves-effect waves-light  btn">Cancelar</button>

					</form>
				</div>
			</div>


		</div>