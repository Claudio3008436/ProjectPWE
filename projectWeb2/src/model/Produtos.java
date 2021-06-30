package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBQuery;


public class Produtos {
 
	private String	tableName = "";
	private String	fieldsName = "";
	private String	keyField = "";
	// private String	where = "";
	private DBQuery	dbQuery = new DBQuery(tableName, fieldsName, keyField);
	

	private int	idProduto;
	private String	fabricante;
	private String	nome;
	private String	marca;
	private String	modelo;
	private int	idCategoria;
	private String	descricao;
	private String	unidadeMedida;
	private double	largura;
	private double	altura;
	private double	profundidade;
	private double	peso;
	private String	cor;
	private String	dtFabricacao;

	public Produtos(){
		this.tableName  = "produtos";
		this.fieldsName = "idProduto, fabricante, nome, marca, modelo, idCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor, dtFabricacao";
		this.keyField   = "idProduto";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	}

	public Produtos(int idProduto, String fabricante, String nome, String marca, String modelo, int idCategoria, String descricao, String unidadeMedida, double largura, double altura, double profundidade, double peso, String cor, String dtFabricacao){
		this.tableName  = "produtos";
		this.fieldsName = "idProduto, fabricante, nome, marca, modelo, idCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor, dtFabricacao";
		this.keyField   = "idProduto";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	
		this.setIdProduto( idProduto);
		this.setFabricante( fabricante);
		this.setNome( nome);
		this.setMarca( marca);
		this.setModelo( modelo);
		this.setIdCategoria( idCategoria);
		this.setDescricao( descricao);
		this.setUnidadeMedida( unidadeMedida);
		this.setLargura( largura);
		this.setAltura( altura);
		this.setProfundidade( profundidade);
		this.setPeso( peso);
		this.setCor( cor);
		this.setDtFabricacao( dtFabricacao);
	}
	public String toString(){
		return (
			this.getIdProduto() +", "+
			this.getFabricante() +", "+
			this.getNome() +", "+
			this.getMarca() +", "+
			this.getModelo() +", "+
			this.getIdCategoria() +", "+
			this.getDescricao() +", "+
			this.getUnidadeMedida() +", "+
			this.getLargura() +", "+
			this.getAltura() +", "+
			this.getProfundidade() +", "+
			this.getPeso() +", "+
			this.getCor() +", "+
			this.getDtFabricacao() +", "
		);
	 }

	public String[] toArray(){
		return (
			new String[] { 
				""+this.getIdProduto(),
				""+this.getFabricante(),
				""+this.getNome(),
				""+this.getMarca(),
				""+this.getModelo(),
				""+this.getIdCategoria(),
				""+this.getDescricao(),
				""+this.getUnidadeMedida(),
				""+this.getLargura(),
				""+this.getAltura(),
				""+this.getProfundidade(),
				""+this.getPeso(),
				""+this.getCor(),
				""+this.getDtFabricacao()
			}
		);
	 }

	public void save() {
		  if ((this.getIdProduto() == 0 )){
		       this.dbQuery.insert(this.toArray());
          }else{
		      this.dbQuery.update(this.toArray());
          }
        }
	
        public void delete() {
            if (this.getIdProduto() > 0 ){
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
			     
				 saida += "<td>" + rs.getString("idProduto" ) +  "</td>";
				 saida += "<td>" + rs.getString("fabricante" ) +  "</td>";
				 saida += "<td>" + rs.getString("nome" ) +  "</td>";
				 saida += "<td>" + rs.getString("marca" ) +  "</td>";
				 saida += "<td>" + rs.getString("modelo" ) +  "</td>";
				 saida += "<td>" + rs.getString("idCategoria" ) +  "</td>";
				 saida += "<td>" + rs.getString("descricao" ) +  "</td>";
				 saida += "<td>" + rs.getString("unidadeMedida" ) +  "</td>";
				 saida += "<td>" + rs.getString("largura" ) +  "</td>";
				 saida += "<td>" + rs.getString("altura" ) +  "</td>";
				 saida += "<td>" + rs.getString("profundidade" ) +  "</td>";
				 saida += "<td>" + rs.getString("peso" ) +  "</td>";
				 saida += "<td>" + rs.getString("cor" ) +  "</td>";
				 saida += "<td>" + rs.getString("dtFabricacao" ) +  "</td>";
			     saida += "</tr> <br>";
		      }
		   } catch (SQLException e) {
			 e.printStackTrace();
		   }
		   saida += "</table>";
		   return (saida);
	   }

	
	public void	setIdProduto( int idProduto ){
		this.idProduto=idProduto;
	};
	
	public int	 getIdProduto(){
		return ( this.idProduto );
	};
	
	public void	setFabricante( String fabricante ){
		this.fabricante=fabricante;
	};
	
	public String	 getFabricante(){
		return ( this.fabricante );
	};
	
	public void	setNome( String nome ){
		this.nome=nome;
	};
	
	public String	 getNome(){
		return ( this.nome );
	};
	
	public void	setMarca( String marca ){
		this.marca=marca;
	};
	
	public String	 getMarca(){
		return ( this.marca );
	};
	
	public void	setModelo( String modelo ){
		this.modelo=modelo;
	};
	
	public String	 getModelo(){
		return ( this.modelo );
	};
	
	public void	setIdCategoria( int idCategoria ){
		this.idCategoria=idCategoria;
	};
	
	public int	 getIdCategoria(){
		return ( this.idCategoria );
	};
	
	public void	setDescricao( String descricao ){
		this.descricao=descricao;
	};
	
	public String	 getDescricao(){
		return ( this.descricao );
	};
	
	public void	setUnidadeMedida( String unidadeMedida ){
		this.unidadeMedida=unidadeMedida;
	};
	
	public String	 getUnidadeMedida(){
		return ( this.unidadeMedida );
	};
	
	public void	setLargura( double largura ){
		this.largura=largura;
	};
	
	public double	 getLargura(){
		return ( this.largura );
	};
	
	public void	setAltura( double altura ){
		this.altura=altura;
	};
	
	public double	 getAltura(){
		return ( this.altura );
	};
	
	public void	setProfundidade( double profundidade ){
		this.profundidade=profundidade;
	};
	
	public double	 getProfundidade(){
		return ( this.profundidade );
	};
	
	public void	setPeso( double peso ){
		this.peso=peso;
	};
	
	public double	 getPeso(){
		return ( this.peso );
	};
	
	public void	setCor( String cor ){
		this.cor=cor;
	};
	
	public String	 getCor(){
		return ( this.cor );
	};
	
	public void	setDtFabricacao( String dtFabricacao ){
		this.dtFabricacao=dtFabricacao;
	};
	
	public String	 getDtFabricacao(){
		return ( this.dtFabricacao );
	};
	
} 