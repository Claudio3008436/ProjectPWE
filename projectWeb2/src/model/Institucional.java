package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBQuery;


public class Institucional {
 
	private String	tableName = "";
	private String	fieldsName = "";
	private String	keyField = "";
	// private String	where = "";
	private DBQuery	dbQuery = new DBQuery(tableName, fieldsName, keyField);
	

	private int	idInstituicao;
	private String	nome;
	private String	cpf_cnpj;
	private String	tipoPessoa;
	private String	endereco;
	private String	bairro;
	private String	cidade;
	private String	uf;
	private String	cep;
	private String	telefone;
	private String	email;
	private String	logo;

	public Institucional(){
		this.tableName  = "institucional";
		this.fieldsName = "idInstituicao, nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, uf, cep, telefone, email, logo";
		this.keyField   = "idInstituicao";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	}

	public Institucional(int idInstituicao, String nome, String cpf_cnpj, String tipoPessoa, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email, String logo){
		this.tableName  = "institucional";
		this.fieldsName = "idInstituicao, nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, uf, cep, telefone, email, logo";
		this.keyField   = "idInstituicao";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	
		this.setIdInstituicao( idInstituicao);
		this.setNome( nome);
		this.setCpf_cnpj( cpf_cnpj);
		this.setTipoPessoa( tipoPessoa);
		this.setEndereco( endereco);
		this.setBairro( bairro);
		this.setCidade( cidade);
		this.setUf( uf);
		this.setCep( cep);
		this.setTelefone( telefone);
		this.setEmail( email);
		this.setLogo( logo);
	}
	public String toString(){
		return (
			this.getIdInstituicao() +", "+
			this.getNome() +", "+
			this.getCpf_cnpj() +", "+
			this.getTipoPessoa() +", "+
			this.getEndereco() +", "+
			this.getBairro() +", "+
			this.getCidade() +", "+
			this.getUf() +", "+
			this.getCep() +", "+
			this.getTelefone() +", "+
			this.getEmail() +", "+
			this.getLogo() +", "
		);
	 }

	public String[] toArray(){
		return (
			new String[] { 
				""+this.getIdInstituicao(),
				""+this.getNome(),
				""+this.getCpf_cnpj(),
				""+this.getTipoPessoa(),
				""+this.getEndereco(),
				""+this.getBairro(),
				""+this.getCidade(),
				""+this.getUf(),
				""+this.getCep(),
				""+this.getTelefone(),
				""+this.getEmail(),
				""+this.getLogo()
			}
		);
	 }

	public void save() {
		  if ((this.getIdInstituicao() == 0 )){
		       this.dbQuery.insert(this.toArray());
          }else{
		      this.dbQuery.update(this.toArray());
          }
        }
	
        public void delete() {
            if (this.getIdInstituicao() > 0 ){
                this.dbQuery.delete( this.toArray() );
            }
        }
	    
	   public String listAll() {
	       ResultSet rs =  this.dbQuery.select("");
           String saida = "<br>";
	       saida += "<table border=1>";
		
		   try {
		      while (rs.next()) {
			     saida += "<tr>";
			     
				 saida += "<td>" + rs.getString("idInstituicao" ) +  "</td>";
				 saida += "<td>" + rs.getString("nome" ) +  "</td>";
				 saida += "<td>" + rs.getString("cpf_cnpj" ) +  "</td>";
				 saida += "<td>" + rs.getString("tipoPessoa" ) +  "</td>";
				 saida += "<td>" + rs.getString("endereco" ) +  "</td>";
				 saida += "<td>" + rs.getString("bairro" ) +  "</td>";
				 saida += "<td>" + rs.getString("cidade" ) +  "</td>";
				 saida += "<td>" + rs.getString("uf" ) +  "</td>";
				 saida += "<td>" + rs.getString("cep" ) +  "</td>";
				 saida += "<td>" + rs.getString("telefone" ) +  "</td>";
				 saida += "<td>" + rs.getString("email" ) +  "</td>";
				 saida += "<td>" + rs.getString("logo" ) +  "</td>";
			     saida += "</tr> <br>";
		      }
		   } catch (SQLException e) {
			 e.printStackTrace();
		   }
		   saida += "</table>";
		   return (saida);
	   }

	
	public void	setIdInstituicao( int idInstituicao ){
		this.idInstituicao=idInstituicao;
	};
	
	public int	 getIdInstituicao(){
		return ( this.idInstituicao );
	};
	
	public void	setNome( String nome ){
		this.nome=nome;
	};
	
	public String	 getNome(){
		return ( this.nome );
	};
	
	public void	setCpf_cnpj( String cpf_cnpj ){
		this.cpf_cnpj=cpf_cnpj;
	};
	
	public String	 getCpf_cnpj(){
		return ( this.cpf_cnpj );
	};
	
	public void	setTipoPessoa( String tipoPessoa ){
		this.tipoPessoa=tipoPessoa;
	};
	
	public String	 getTipoPessoa(){
		return ( this.tipoPessoa );
	};
	
	public void	setEndereco( String endereco ){
		this.endereco=endereco;
	};
	
	public String	 getEndereco(){
		return ( this.endereco );
	};
	
	public void	setBairro( String bairro ){
		this.bairro=bairro;
	};
	
	public String	 getBairro(){
		return ( this.bairro );
	};
	
	public void	setCidade( String cidade ){
		this.cidade=cidade;
	};
	
	public String	 getCidade(){
		return ( this.cidade );
	};
	
	public void	setUf( String uf ){
		this.uf=uf;
	};
	
	public String	 getUf(){
		return ( this.uf );
	};
	
	public void	setCep( String cep ){
		this.cep=cep;
	};
	
	public String	 getCep(){
		return ( this.cep );
	};
	
	public void	setTelefone( String telefone ){
		this.telefone=telefone;
	};
	
	public String	 getTelefone(){
		return ( this.telefone );
	};
	
	public void	setEmail( String email ){
		this.email=email;
	};
	
	public String	 getEmail(){
		return ( this.email );
	};
	
	public void	setLogo( String logo ){
		this.logo=logo;
	};
	
	public String	 getLogo(){
		return ( this.logo );
	};
	
} 