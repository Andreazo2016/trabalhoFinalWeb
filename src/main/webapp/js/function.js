
function showAll(){
	var tela_principal = $('#cards').is(":visible");
	var tela_login = $('#login-section').is(":visible");
	var tela_cadastro = $('#cadastro-section').is(":visible");
	var btn_login = $('#btn-login').is(":visible");
	var btn_cad = $('#btn-cad').is(":visible");
	
	
	$('#btn-cad').click(()=>{
		if(tela_login|| tela_principal){
			 $('#cards').hide();
			 $('#login-section').hide();
			 $('#btn-cad').hide();
			 if(btn_login){
				 $('#btn-login').hide();
			 }else{
				 $('#btn-login').show();
			 }
			
			 $('#cadastro-section').show();
		}
	});
	$('#btn-login').click(()=>{
		if(tela_cadastro || tela_principal){
			 $('#cards').hide();
			 $('#cadastro-section').hide();
			 $('#btn-login').hide();
			 if(btn_cad){
				 $('#btn-cad').hide();
			 }else{
				 $('#btn-cad').show();
			 }
			
			 $('#login-section').show();
		}
	});
	$('#login-cancelar').click(()=>{
		$('#btn-login').show();
		$('#login-section').hide();
		$('#cards').show();
		
	});
	$('#cad-cancelar').click(()=>{
		$('#cadastro-section').hide();
		$('#btn-cad').show();
		$('#cards').show();
	});
	
	
	
	
	
}

function showCategoria() {
	$('#efeito-lista').click(function(){

		$('#show').toggle(1000);
	});

}


$(document).ready(function(){
	$('#cadastro-section').hide();
	//showCad();
	$('#login-section').hide();
	showAll();
	//showAndHideLogin();
	$('#show').hide();
	showCategoria();
	$('.collapsible').collapsible();
	$('.tap-target').tapTarget('open');
	$('.tap-target').tapTarget('close');
	$('.tooltipped').tooltip({delay: 50});
	$(".button-collapse").sideNav();
	$('.modal').modal();
	$('select').material_select();

});