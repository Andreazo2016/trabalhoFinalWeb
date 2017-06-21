var myApp = angular.module("loginApp",[]);

myApp.controller('loginController',function($scope,$http){
	$scope.sendData = function(){
		var data = $.param({
			user:$scope.userLogin,
			senha:$scope.userSenha
		});
		$http.post('/validarUser?'+ data).then(function(resposta,status){
			console.log(resposta.data);
		});
	}
});