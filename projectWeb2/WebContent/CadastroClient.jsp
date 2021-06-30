<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Cadastro Cliente</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.js"></script>
<script type="text/javascript" src="Cadastro.js"></script>

<style type="text/css">
section
{
	width:1300px;
	height:1000px;
	position:absolute;
	border:1px solid #000;
	
	
	
}
article
{
	width:500px;              /*margem-esquerda*/
	height:750px;			 /*altura da tabela*/
	position:relative;
	border:3px solid #F4A460;
	border-radius:15px;   /*arredondamento nos quatro lados da div*/
	margin-top:20px;	 /*margem-superior*/
	margin-left:auto;	/*margem-esquerda*/
	margin-right:auto; /*margem-superior: auto --> o navegador calcula a margem*/
	
	
}
#cadastro
{	
	width:500px; 	 
	height:50px;	
	position:relative;
	/*border:1px solid #000;*/
	
}
.cadastre-se
{
	color:#1c1e21; /*cor da fonte*/
	font-family:Helvetica, Sans-Serif, Arial; /*fonte do texto*/
	font-size:32px;        /*tamanho da fonte*/
	line-height:50px;     /*especifica altura da linha*/
	font-weight:bold;    /*espessura da fonte: negrito*/
	padding-left:10px;  /*gerar espaço na esquerda*/
}
#frase
{
	width:500px;
	height:30px;
	position:relative;
	/*border:1px solid #000;*/
}
.rapido_facil
{
	color:gray;
	font-family:inherit;
	font-size:16px;
	padding-left:10px;
}

/*Manipulação de Icones e-mail, phone number,etc...*/
.campo
{	width:490px;
	height:60px;
	/*border:1px solid #708090;*/
	position:relative;
	left:0;
	top:8px;
}

.campo i
{	position:absolute;
	left:25px;
  	top:30px;
  	color:#aaa;
}
.form-control
{
	padding-left:35px;
	margin-left:auto;
	margin-right:auto; 
}

.msg
{
	color:gray;
	font-family:sans-serif;
	font-size: 10px;
	text-align:left;
	padding-left:10px; 
}
#btnCadastrar
{
	position:relative;
	background-color:white;
	font-family:Helvetica, Sans-Serif, Arial;
	color:black;
	border:2px solid #F4A460;
	border-radius:5px;
	font-size:20px;
	left:180px;
	transition-duration:0.4s;
}
#btnCadastrar:hover
{
	background-color:#F4A460;
	color:white;	 
}
</style>
</head>
<body>
<header></header>
<nav></nav>
<section>
	<article>
		<div  id="cadastro" class="cadastre-se">Cadastre-se</div>
		<div  id="frase" class="rapido_facil">É rápido e fácil.</div>
		<form id="frmCadastro" action="#" method="GET">
					<!--CAIXA DE TXT E-MAIL -->
			<div class="campo">
				<label class="form-label" for="email"></label>
  				<input type="email" id="email" placeholder="E-mail" name="email" class="form-control" style="width:450px;"/>
  				<i class="fa fa-envelope fa-lg fa-fw" aria-hidden="true"></i>
			</div>
					<!-- CAIXA DE TXT NOME -->
			<div class="campo">
				<label class="form-label" for="nome"></label>
  				<input type="text" id="nome" placeholder="Nome" name="nome" class="form-control" style="width:450px;"/>
  				<i class="fa fa-user fa-lg fa-fw" aria-hidden="true"></i>
			</div>
					<!-- CAIXA DE TXT CPF -->
			<div class="campo">
				<label class="form-label" for="cpf"></label>
  				<input type="text" id="cpf" placeholder="Cpf" name="cpf" class="form-control" style="width:450px;"/>
			</div>
					<!-- CAIXA DE TXT CEP -->
			<div class="campo">
				<label class="form-label" for="cep"></label>
  				<input type="text" id="cep" placeholder="Cep" name="cep" class="form-control" style="width:450px;"/>
			</div>
					<!-- CAIXA DE TXT ENDERECO -->
			<div class="campo">
				<label class="form-label" for="endereco"></label>
  				<input type="text" id="endereco" placeholder="Endereço" name="endereco" class="form-control" style="width:450px;"/>
			</div>
					<!--  CAIXA DE TXT BAIRRO -->
			<div class="campo">
				<label class="form-label" for="bairro"></label>
  				<input type="text" id="bairro" placeholder="Bairro" name="bairro" class="form-control" style="width:450px;"/>
			</div>
		
			<div class="campo">
				<label class="form-label" for="cidade"></label>
  				<input type="text" id="cidade" placeholder="Cidade" name="cidade" class="form-control" style="width:450px;"/>
			</div><br>
		
			<div class="campo">
				<label class="form-label" for="uf">UF:</label>
  					<select>
  						<option value="AC">Acre</option>
						<option value="AL">Alagoas</option>
						<option value="AP">Amapá</option>
						<option value="AM">Amazonas</option>
						<option value="BA">Bahia</option>
						<option value="CE">Ceará</option>
						<option value="ES">Espírito Santo</option>
						<option value="GO">Goiás</option>
						<option value="MA">Maranhão</option>
						<option value="MT">Mato Grosso</option>
						<option value="MS">Mato Grosso do Sul</option>
						<option value="MG">Minas Gerais</option>
						<option value="PA">Pará</option>
						<option value="PB">Paraíba</option>
						<option value="PR">Paraná</option>
						<option value="PE">Pernambuco</option>
						<option value="PI">Piauí</option>
						<option value="RJ">Rio de Janeiro</option>
						<option value="RN">Rio Grande do Norte</option>
						<option value="RS">Rio Grande do Sul</option>
						<option value="RO">Rondônia</option>
						<option value="RR">Roraima</option>
						<option value="SC">Santa Catarina</option>
						<option value="SP">São Paulo</option>
						<option value="SE">Sergipe</option>
						<option value="TO">Tocantins</option>
						<option value="DF">Distrito Federal</option>
  				</select>
		</div>
		
			<div class="campo">
				<label class="form-label" for="telefone"></label>
  				<input type="text" id="telefone" placeholder="Telefone" name="telefone" class="form-control" style="width:450px;"/>
  				<i class="fa fa-phone fa-lg fa-fw" aria-hidden="true"></i>
			</div><br>
			
			<p class="msg">Ao clicar em Cadastre-se, você concorda com nossos Termos, Política de Dados e Política de Cookies. Você poderá receber notificações por SMS e cancelar isso quando quiser.</p>
		
			<!-- type="hidden" tipo de entrada oculto -->
			<!--<input type="hidden" name="acao" value="1">-->
			<button type="button" id="btnCadastrar" onclick="validar()">Cadastrar</button>
		<br><br>
	</form> 
</article>
</section>
	
</body>
</html>