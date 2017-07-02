function showAll(){
	var tela_principal = $('#cards').is(":visible");
	var tela_login = $('#login-section').is(":visible");
	var tela_cadastro = $('#cadastro-section').is(":visible");
	var btn_login = $('#btn-login').is(":visible");
	var btn_cad = $('#btn-cad').is(":visible");
	$('#btn-cad').click(()=>{
		if(tela_login|| tela_principal){
			 $('#cards').hide();
			 $('#login-section').hide(1500);
			 $('#btn-cad').hide();
			 if(btn_login){
				 $('#btn-login').hide(1500);
			 }else{
				 $('#btn-login').show(1500);
			 }
			
			 $('body').css("background-image", "url()");
			 $('#cadastro-section').show(1500);
		}
	});
	$('#btn-login').click(()=>{
		if(tela_cadastro || tela_principal){
			 $('#cards').hide();
			 $('#cadastro-section').hide(1500);
			 $('#btn-login').hide(1500);
			 if(btn_cad){
				 $('#btn-cad').hide(1500);
			 }else{
				 $('#btn-cad').show(1500);
			 }
			 $('body').css("background-image", "url(../../img/ice.jpg)");
			 $('#login-section').show(1500);
		}
	});
	$('#login-cancelar').click(()=>{
		$('#btn-login').show(1500);
		$('#login-section').hide(1500);
		$('#cards').show(1500);
		
	});
	$('#cad-cancelar').click(()=>{
		$('#cadastro-section').hide(1500);
		$('#btn-cad').show(1500);
		$('#cards').show(1500);
	});
}
function showCategoria() {
	$('#efeito-lista').click(function(){
		$('#show').toggle(1000);
	});
}
$(document).ready(function(){
	$('#cadastro-section').hide();
	$('#login-section').hide();
	showAll();
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