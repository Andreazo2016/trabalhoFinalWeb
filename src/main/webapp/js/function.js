function confirmCarro(){
	$("#myform").click(()=>{
		$("#modal-resposta").modal('show');
	});
	
}

function msgError(){
	var tela_erro = $('#div-error').is(":visible");
	if(tela_erro){
		$('#div-error').toggle(10000);
	}
}


function showAndHideNav(){
	$('#xbox360').click(()=>{
		$('#show').toggle(1000);
		$('#img-logo').toggle(1000);
	});
	$('#xboxone').click(()=>{
		$('#show').toggle(1000);
		$('#img-logo').toggle(1000);
	});
	$('#ps4').click(()=>{
		$('#show').toggle(1000);
		$('#img-logo').toggle(1000);
	});
	$('#pc').click(()=>{
		$('#show').toggle(1000);
		$('#img-logo').toggle(1000);
	});
}



function showVerProduto(){
	$('#btn-login').click(()=>{
		$('#btn-login').hide();
		$('#area-principal').hide();
		$('#login-section').show(1500);
	});
}


function showAll(){
	var tela_principal = $('#cards').is(":visible");
	var tela_login = $('#login-section').is(":visible");
	var tela_cadastro = $('#cadastro-section').is(":visible");
	var btn_login = $('#btn-login').is(":visible");
	var btn_cad = $('#btn-cad').is(":visible");
	var div_log = $('#img-logo').is(":visible");
	var ver_prod = $('#area-principal').is(":visible");
	var show = $('#show').is(":visible");
	$('#btn-cad').click(()=>{
		
		if(div_log || show){
			$('#img-logo').hide(1000);
			$('#show').hide(1000);
		}
		if(tela_login){
			$('#cadastro-section').show(10000);
		}
		
		if(tela_login|| tela_principal){
			 $('#cards').hide();
			 $('#login-section').hide(1500);
			 $('#btn-cad').hide();
			 if(btn_login){
				 $('#btn-login').hide(1500);
			 }else{
				 $('#btn-login').show(1500);
			 }
			
			// $('body').css("background-image", "url()");
			 $('#cadastro-section').show(1500);
		}
	});
	$('#btn-login').click(()=>{
		if(div_log|| show){
			$('#img-logo').hide(1000);
			$('#show').hide(1000);
		}
		if(tela_cadastro || tela_principal){
			 $('#cards').hide();
			 $('#cadastro-section').hide(1500);
			 $('#btn-login').hide(1500);
			 if(btn_cad){
				 $('#btn-cad').hide(1500);
			 }else{
				 $('#btn-cad').show(1500);
			 }
			 
			 //$('body').css("background-image", "url(../../img/console.jpg)");
			 $('#login-section').show(1500);
		}
	});
	$('#login-cancelar').click(()=>{
	    $('#area-principal').toggle(1500);
		$('#img-logo').toggle(1000);
		$('#btn-login').show(1500);
		$('#login-section').hide(1500);
		$('#cards').show(1500);
		
	});
	$('#cad-cancelar').click(()=>{
		
		$('#img-logo').toggle(1000);
		$('#cadastro-section').hide(1500);
		$('#btn-cad').show(1500);
		$('#cards').show(1500);
	});
}
function showCategoria() {
	var tela_login = $('#login-section').is(":visible");
	var tela_cadastro = $('#cadastro-section').is(":visible");
	$('#efeito-lista').click(function(){
		
		$('#img-logo').toggle(1000);
		$('#show').toggle(1000);
	
	});
}
$(document).ready(function(){
	
	$('.carousel.carousel-slider').carousel({fullWidth: true});
	 $('.carousel').carousel({dist:0});
     window.setInterval(function(){$('.carousel').carousel('next')},1500);
	$('.carousel.carousel-slider').carousel({});
	//$('body').css("background-image", "url(../../img/console.jpg)");
	showAndHideNav();
	$('.materialboxed').materialbox();
	$('#cadastro-section').hide();
	$('#login-section').hide();
	showVerProduto();
	confirmCarro();
	msgError();
	showAll();
	$('.slider').slider();
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