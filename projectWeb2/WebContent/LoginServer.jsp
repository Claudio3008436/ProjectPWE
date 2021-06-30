<%@page import="model.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>

<%	
	
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	
	if(email != null && senha != null)
	{
		Login login = new Login(email,senha);
		if (login.getSuccess()){
			session.setAttribute("idUsuario",login.getIdUsuario());
			session.setAttribute("idNivelUsuario",login.getIdNivelUsuario());
			session.setAttribute("nome",login.getNome());
			session.setAttribute("email",login.getEmail());
		} else{
			session.invalidate();	
		}
		out.write(login.toJson());
	}
	/*
	
	else{
		Login login = new Login("","");
		out.write(login.toJson());
	}
	*/
	//out.write("{'teste':'ok';'email':'"+email+"';'senha':'"+senha+"'}");
	
	//Login login = new Login("","");
	//Login login = new Login();
%>
