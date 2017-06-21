var app = angular.module('app', []);
app.controller('controller_adm',function($scope, $http){
	$scope.showEdiarDiv = false;
	$http.get('/Game').then(function(response){
		$scope.games = [];
		 var count = Object.keys(response.data).length 
		 for(var i = 0; i < count; i++){
			 var json = response.data[i]; 
			 $scope.games.push({cod:json.codGame,nome:json.nomeGame,preco: json.precoGame,categoria:json.categoriaGame});
			
		 }
		
	});
	$scope.openDivAtualizar = function(cod,nome,preco,categoria){
		$scope.edit = {codigoGame: cod,nomeGame : nome,precoGame : preco,categoriaGame : categoria};
		$scope.showEdiarDiv = true;
		
	}
	$scope.close = function(){
		$scope.showEdiarDiv = false;
	}
	
	
	
});