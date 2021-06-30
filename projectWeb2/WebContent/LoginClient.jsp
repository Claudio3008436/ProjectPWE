<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String msg = request.getParameter("msg");
	msg = ((msg==null)?"":msg);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Autenticação Login</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet"/>
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.5.0/mdb.min.css" rel="stylesheet"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#btnLogin").click(function() {
			var formData = $(this.form).serialize();
				//alert(formData);
				console.log(formData);
				$.post( "testLogin.jsp" , formData, function( data, status ){
					//alert(data);
					console.log( data );
					var objLogin = JSON.parse( data );
					console.log( objLogin );
					if(objLogin.success){
						$("#msg").html(objLogin.msg + "<br> Seja bem vindo(a)!!!" + objLogin.nome);
					} else{
						$("#msg").html(objLogin.msg);
						
					}
				
				});
		});
	});

</script>

<style type="text/css">
#article01{
	width:  300px;
	height: 400px;	
}
</style>
</head>
 	
<body>
<header></header>
<nav></nav>
<section>
	<article id = "article01">
		<form id = "frmLogin">
  				<!-- Email input -->
  			<div class="form-outline mb-4">
    			<input type="email" name="email" id="form1Example1" class="form-control" />
    			<label class="form-label" for="form1Example1">Email address</label>
  			</div>

  				<!-- Password input -->
 			 <div class="form-outline mb-4">
    			<input type="password" name="senha" id="form1Example2" class="form-control" />
    			<label class="form-label" for="form1Example2">Password</label>
  			</div>

  				<!-- 2 column grid layout for inline styling -->
  			<div class="row mb-4">
    			<div class="col d-flex justify-content-center">
     			 <!-- Checkbox -->
      				<div class="form-check">
        				<input class="form-check-input" type="checkbox" value="" id="form1Example3" checked/>
        				<label class="form-check-label" for="form1Example3"> Remember me </label>
      				</div>
    			</div>

    			<div class="col">
     				 <!-- Simple link -->
      				<a href="#!">Forgot password?</a>
    			</div>
  			</div>
  					<!-- Submit button -->
  			<button id="btnLogin" type="button" value="RealizarLogin" class="btn btn-primary btn-block">Realizar Login</button>
		</form>
		<div id="msg"><%=msg%></div>
		<br><a href="testLoginPublic.jsp">Link para página Pública</a>
		<br><a href="testLoginPrivate.jsp">Link para Página Privada</a>
		
	</article>
</section>
<footer></footer>
</body>
</html>