package model;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBQuery;

public class Usuario {
	
	private int    idUsuario;
	private String email;
	private String senha;
	private int    idNivelUsuario;
	private String nome;
	private String cpf;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String foto;
	private String ativo;
	
	private String tableName = "lojinha.usuarios";
	private String fieldsName = "idUsuario, email, senha, idNivelUsuario, nome, cpf, endereco, bairro, cidade, uf, cep, telefone, foto, ativo";
	private String keyField = "idUsuario";
	
	//private String where = "";
	private DBQuery dbQuery = null;
	

	public Usuario() {
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
		
	}
	public Usuario(String idUsuario, String email, String senha, String idNivelUsuario, String nome, String cpf, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String foto, String ativo){
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
		
		this.setIdUsuario((idUsuario==null)?0:Integer.valueOf(idUsuario));
		this.setEmail(email);
		this.setSenha(senha);
		this.setIdNivelUsuario((idNivelUsuario==null)?0:Integer.valueOf(idNivelUsuario));
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setCep(cep);
		this.setTelefone(telefone);
		this.setFoto(foto);
		this.setAtivo(ativo);
	}
	
	
	public Usuario(String email, String senha, String nome, String cpf, String endereco, String bairro, String cidade, String uf, String cep, String telefone){
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
		
		this.setEmail(email);
		this.setSenha(senha);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setCep(cep);
		this.setTelefone(telefone);
		
	}
	
	public String[] toArray(){
		return (
			new String[] {
				""+this.getIdUsuario(),
				""+this.getEmail(),
				""+this.getSenha(),
				""+this.getIdNivelUsuario(),
				""+this.getNome(),
				""+this.getCpf(),
				""+this.getEndereco(),
				""+this.getBairro(),
				""+this.getCidade(),
				""+this.getUf(),
				""+this.getCep(),
				""+this.getTelefone(),
				""+this.getFoto(),
                ""+this.getAtivo()
				}
			);		
		}
	
		/*public String toString(){
			return(
					this.getIdUsuario()+ "|" +
					this.getEmail()+ "|" + 
					this.getSenha()+ "|" + 
					this.getIdNivelUsuario()+ "|" + 
					this.getNome()+ "|" + 
					this.getCpf()+ "|" + 
					this.getEndereco()+ "|" + 
					this.getBairro()+ "|" + 
					this.getCidade()+ "|" + 
					this.getUf()+ "|" + 
					this.getCep()+ "|" + 
					this.getTelefone()+ "|" + 
					this.getFoto()+ "|" + 
	                this.getAtivo()
				);
			}*/
	
	public String toJson(){
		return(
				"Usuario{\n\t"+
				
 					"IdUsuario: "+this.getIdUsuario()+ ",\n\t" +
					"Email: "+this.getEmail()+ ",\n\t" + 
					"Senha: "+this.getSenha()+ ",\n\t" + 
					"IdNivelUsuario: "+this.getIdNivelUsuario()+ ",\n\t" + 
					"Nome: "+this.getNome()+ ",\n\t" + 
					"CPF: "+this.getCpf()+ ",\n\t" + 
					"Endereço: "+this.getEndereco()+ ",\n\t" + 
					"Bairro: "+this.getBairro()+ ",\n\t" + 
					"Cidade: "+this.getCidade()+ ",\n\t" + 
					"UF: "+this.getUf()+ ",\n\t" + 
					"CEP: "+this.getCep()+ ",\n\t" + 
					"Telefone: "+this.getTelefone()+ ",\n\t" + 
					"Foto: "+this.getFoto()+ ",\n\t" + 
		            "Ativo: "+this.getAtivo()+ "\n\t"+
				"}"
			);
		}
	
	public void save(){
		if((this.getIdUsuario() == 0)){
			this.dbQuery.insert(this.toArray());
			}
		else {
			this.dbQuery.update(this.toArray());
		}
	}
	
	public void delete() {
		if(this.getIdUsuario() > 0) {
			this.dbQuery.delete(this.toArray());
		}
	}
	
	public String listAll() {
		ResultSet rs = this.dbQuery.select("");
	   String saída = "<br>";
		 saída += "<table border=1>";
		 
		 try {
			while (rs.next()) {
				 saída += "<tr>";
				 saída += "<td>" + rs.getString("idUsuario" ) +  "</td>";
				 saída += "<td>" + rs.getString("email" ) +      "</td>";
				 saída += "<td>" + rs.getString("senha" ) +      "</td>";
				 saída += "<td>" + rs.getString("idNivelUsuario" ) +  "</td>";
				 saída += "<td>" + rs.getString("nome" )  +  "</td>";
				 saída += "<td>" + rs.getString("cpf" )   +  "</td>";
				 saída += "<td>" + rs.getString("endereco" ) +  "</td>";
				 saída += "<td>" + rs.getString("bairro" )   +  "</td>";
				 saída += "<td>" + rs.getString("cidade" )   +  "</td>";
				 saída += "<td>" + rs.getString("uf" ) +  "</td>";
				 saída += "<td>" + rs.getString("cep" ) +  "</td>";
				 saída += "<td>" + rs.getString("telefone" ) +  "</td>";
				 saída += "<td>" + rs.getString("foto" ) +  "</td>";
				 saída += "</tr> <br>";
				 }
		 } catch (SQLException e) {
			 e.printStackTrace();
		 }
		 saída += "</table>";
		 return(saída);
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getIdNivelUsuario() {
		return idNivelUsuario;
	}


	public void setIdNivelUsuario(int idNivelUsuario) {
		this.idNivelUsuario = idNivelUsuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getAtivo() {
		return ativo;
	}


	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public ResultSet select(String where) {
		return this.dbQuery.select(where);
	}
}
