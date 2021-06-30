// CONSULTAR CEP
function consultaEPreencheCEP(cep) {
	
	var urlConsultaCEP = "https://viacep.com.br/ws/"+cep+"/json/";
	$.get(urlConsultaCEP, function(data, success) {
		//console.log(data);
		if(success == "success"){
			var obj = data;
			console.log(success);
			console.log(obj);
			
			$("#endereco").val(obj.logradouro);
			$("#bairro").val(obj.bairro);
			$("#cidade").val(obj.localidade);
			$("#uf").val(obj.uf);
		}	
	});	
}

//VALIDAÇÃO DOS DADOS
function validar() {
	var email = $("#email");
	if(email.val() == "")
	{
		alert("E-mail não informado!");
		email.focus();	
	}
}	
	
$(document).ready(function() {
	$('#telefone').mask('+55(00) 0000-0000');
	$('#cpf').mask('000.000.000-00');
	$('#cep').mask('00000-000');
	
	$("#cep").change(function() {
		var str = $("#cep").val(); //var str = $("#cep").val().length; -- quantidade de números
		
		if(str.indexOf("-") >= 0){
			str = str.replace("-","");
		}
		
		if(str.length == 8){ // exibe o CEP completo
			console.log(str);
			consultaEPreencheCEP(str);
			
		}else if(str.length == 5){
			console.log(str +"000");
			consultaEPreencheCEP(str +"000");
		}
	});
	
	/*$("#btnCadastrar").click(function() {
		
		
		/*$(this.form).acao=1;
		var formData = $(this.form).serialize();
		console.log(formData);
		
		$.post("Cadastro.jsp", formData, function(data, status) {
			console.log(data);
			
		});
	});*/
});
