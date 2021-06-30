<%@page import="mail.SendMail"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id="frmMail" action="testeMail.jsp" method="get">
	De: <input type="text" name="mailFrom"><br> 
	Para: <input type="text" name="mailTo"><br>
	Assunto: <input type="text" name="mailSubject"><br> 
	Texto: <input type="text" name="mailBody"><br>
	<button  id="btnSendMail"> Enviar Email </button>
</form>
<%

if (request.getParameterMap().size()==4){

	
	String smtpHost = "smtp.gmail.com";
	String smtpPort = "587";
	String username = "claudiosantoscabral10@gmail.com";
	String password = "99341504cl";
	String auth		= "tls";
	
	SendMail sendMail = new SendMail(smtpHost, smtpPort, username, password, auth);
	
	String mailFrom		= request.getParameter("mailFrom"); 
	String mailTo		= request.getParameter("mailTo");
	String mailSubject	= request.getParameter("mailSubject");
	String mailBody 	= request.getParameter("mailBody");
	
	
	try {	
		sendMail.send(mailFrom, mailTo, mailSubject, mailBody);
		out.write("Email enviado com sucesso!");
	} catch(Exception e) {
		out.write("Erro ao tentar enviar o email!<br>");
		out.write( e.getMessage() );
	}
	
	
	//sendMail.send(mailFrom, mailTo, mailSubject, mailBody);
	// out.write(mailFrom+ " | "+mailTo+ " | "+mailSubject+ " | "+mailBody);	
}




%>


</body>
</html>