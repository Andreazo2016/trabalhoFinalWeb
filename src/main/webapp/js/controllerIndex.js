var app = angular.module('appindex',['ui.mask']);
app.controller('controllerIndex',function($scope,$http){
	$scope.games = [];
	
		$http.get('/Game')
		.then(function(response){
			$scope.games = [];
			 var count = Object.keys(response.data).length 
			 for(var i = 0; i < count; i++){
				 var json = response.data[i]; 
				 $scope.games.push({cod:json.codGame,nome:json.nomeGame,preco: json.precoGame,categoria:json.categoriaGame});
				
			 }
		},function(response){
			
		});
	
;
$scope.showGameCat = function(){
	
}
	
});

