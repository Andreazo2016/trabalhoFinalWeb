var app = angular.module('appindex',['ui.mask']);
app.controller('controllerIndex',function($scope ,$http){
	$scope.games = [];
	
		$http.get('/Game')
		.then(function(response){
			$scope.games = [];
			 var count = Object.keys(response.data).length 
			
			 for(var i = 0; i < count; i++){
				 var json = response.data[i]; 
				 $scope.games.push({cod:json.codGame,nome:json.nomeGame,preco: json.precoGame,categoria:json.categoriaGame,url:json.url});
				
			 }
		},function(response){
			
		});
	
;
$scope.showGameCategoriaPC = function(){
	
	$http.get('/GameCategoria/PC')
	.then(function(response){
		console.log(response);
		 var count = Object.keys(response.data).length 
		 $scope.qtd_obj= count;
		 console.log("QTD" + $scope.qtd_obj);
		 $scope.games = [];
		
		 for(var i = 0; i < count; i++){
			 var json = response.data[i]; 
			 $scope.games.push({cod:json.codGame,nome:json.nomeGame,preco: json.precoGame,categoria:json.categoriaGame,url:json.url});
		 }
	});
}
$scope.showGameCategoriaXbox360 = function(){
	
	$http.get('/GameCategoria/Xbox 360')
	.then(function(response){
		console.log(response);
		 var count = Object.keys(response.data).length 
		 $scope.qtd_obj= count;
		 console.log("QTD" + $scope.qtd_obj);
		 $scope.games = [];
		 for(var i = 0; i < count; i++){
			 var json = response.data[i]; 
			 $scope.games.push({cod:json.codGame,nome:json.nomeGame,preco: json.precoGame,categoria:json.categoriaGame,url:json.url});
		 }
	});
}
$scope.showGameCategoriaXboxOne = function(){
	
	$http.get('/GameCategoria/Xbox One')
	.then(function(response){
		console.log(response);
		 var count = Object.keys(response.data).length 
		 $scope.games = [];
		 $scope.qtd_obj= count;
		 console.log("QTD" + $scope.qtd_obj);
		 for(var i = 0; i < count; i++){
			 var json = response.data[i]; 
			 $scope.games.push({cod:json.codGame,nome:json.nomeGame,preco: json.precoGame,categoria:json.categoriaGame,url:json.url});
		 }
	});
}
$scope.showGameCategoriaP4 = function(){
	
	$http.get('/GameCategoria/Playstation4')
	.then(function(response){
		console.log(response);
		 var count = Object.keys(response.data).length
		 $scope.qtd_obj= count;
		 console.log("QTD" + $scope.qtd_obj);
		 $scope.games = [];
		 for(var i = 0; i < count; i++){
			 var json = response.data[i]; 
			 $scope.games.push({cod:json.codGame,nome:json.nomeGame,preco: json.precoGame,categoria:json.categoriaGame,url:json.url});
		 }
	});
}
	
});



