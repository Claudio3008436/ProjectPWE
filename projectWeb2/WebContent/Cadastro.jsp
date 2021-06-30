<%@page import="model.Usuario"%>
<%@page import="multitools.RandomCode"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%

	if(request.getParameterMap().size() > 0){

		String email          = request.getParameter("email");
		String senha          = new RandomCode().generate(64);
		String nome           = request.getParameter("nome");
		String cpf            = request.getParameter("cpf").replace("."," ").replace("-", " ");
		String endereco       = request.getParameter("endereco");
		String bairro         = request.getParameter("bairro");
		String cidade         = request.getParameter("cidade");
		String uf             = request.getParameter("uf");
		String cep            = request.getParameter("cep").replace("\\D"," ");
		String telefone       = request.getParameter("telefone").replaceAll("\\D", " ");
		String acao           = request.getParameter("acao");
		
		if(acao!= null)
		{
			/*Integer.valueOf() --> Conversão de Dado em inteiro*/
			if(Integer.valueOf(acao) == 1)
			{
			
				Usuario usuario = new Usuario(email, senha, nome, cpf, endereco, bairro, cidade, uf, cep, telefone);
				out.write(usuario.toJson());
			}
		}
	}

	else{
		
		out.write("Nenhum indicador de Parâmetro");	
	}

	
	
/*    ****REGEX****
    \\D => Tudo que não for digito remove [{(.-,)}]]
    \\d => Tudo que for digito remove
    \\w => Tudo que é texto
    \\W => Tudo que não é texto [{(.-,)}]]
     Pesquisar sobre Server-Side
*/
%>


