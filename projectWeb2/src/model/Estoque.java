package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBQuery;


public class Estoque {
 
	private String	tableName = "";
	private String	fieldsName = "";
	private String	keyField = "";
	// private String	where = "";
	private DBQuery	dbQuery = new DBQuery(tableName, fieldsName, keyField);
	

	private int	idEstoque;
	private int	idProduto;
	private String	dtEntrada;
	private int	quantidade;
	private String	dtFabricacao;
	private String	dtVencimento;
	private String	nfCompra;
	private double	precoCompra;
	private double	icmsCompra;
	private double	precoVenda;
	private int	qtdVendida;
	private int	qtdOcorrencia;
	private String	ocorrencia;

	public Estoque(){
		this.tableName  = "estoque";
		this.fieldsName = "idEstoque, idProduto, dtEntrada, quantidade, dtFabricacao, dtVencimento, nfCompra, precoCompra, icmsCompra, precoVenda, qtdVendida, qtdOcorrencia, ocorrencia";
		this.keyField   = "idEstoque";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	}

	public Estoque(int idEstoque, int idProduto, String dtEntrada, int quantidade, String dtFabricacao, String dtVencimento, String nfCompra, double precoCompra, double icmsCompra, double precoVenda, int qtdVendida, int qtdOcorrencia, String ocorrencia){
		this.tableName  = "estoque";
		this.fieldsName = "idEstoque, idProduto, dtEntrada, quantidade, dtFabricacao, dtVencimento, nfCompra, precoCompra, icmsCompra, precoVenda, qtdVendida, qtdOcorrencia, ocorrencia";
		this.keyField   = "idEstoque";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	
		this.setIdEstoque( idEstoque);
		this.setIdProduto( idProduto);
		this.setDtEntrada( dtEntrada);
		this.setQuantidade( quantidade);
		this.setDtFabricacao( dtFabricacao);
		this.setDtVencimento( dtVencimento);
		this.setNfCompra( nfCompra);
		this.setPrecoCompra( precoCompra);
		this.setIcmsCompra( icmsCompra);
		this.setPrecoVenda( precoVenda);
		this.setQtdVendida( qtdVendida);
		this.setQtdOcorrencia( qtdOcorrencia);
		this.setOcorrencia( ocorrencia);
	}
	public String toString(){
		return (
			this.getIdEstoque() +", "+
			this.getIdProduto() +", "+
			this.getDtEntrada() +", "+
			this.getQuantidade() +", "+
			this.getDtFabricacao() +", "+
			this.getDtVencimento() +", "+
			this.getNfCompra() +", "+
			this.getPrecoCompra() +", "+
			this.getIcmsCompra() +", "+
			this.getPrecoVenda() +", "+
			this.getQtdVendida() +", "+
			this.getQtdOcorrencia() +", "+
			this.getOcorrencia() +", "
		);
	 }

	public String[] toArray(){
		return (
			new String[] { 
				""+this.getIdEstoque(),
				""+this.getIdProduto(),
				""+this.getDtEntrada(),
				""+this.getQuantidade(),
				""+this.getDtFabricacao(),
				""+this.getDtVencimento(),
				""+this.getNfCompra(),
				""+this.getPrecoCompra(),
				""+this.getIcmsCompra(),
				""+this.getPrecoVenda(),
				""+this.getQtdVendida(),
				""+this.getQtdOcorrencia(),
				""+this.getOcorrencia()
			}
		);
	 }

	public void save() {
		  if ((this.getIdEstoque() == 0 )){
		       this.dbQuery.insert(this.toArray());
          }else{
		      this.dbQuery.update(this.toArray());
          }
        }
	
        public void delete() {
            if (this.getIdEstoque() > 0 ){
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
			     
				 saida += "<td>" + rs.getString("idEstoque" ) +  "</td>";
				 saida += "<td>" + rs.getString("idProduto" ) +  "</td>";
				 saida += "<td>" + rs.getString("dtEntrada" ) +  "</td>";
				 saida += "<td>" + rs.getString("quantidade" ) +  "</td>";
				 saida += "<td>" + rs.getString("dtFabricacao" ) +  "</td>";
				 saida += "<td>" + rs.getString("dtVencimento" ) +  "</td>";
				 saida += "<td>" + rs.getString("nfCompra" ) +  "</td>";
				 saida += "<td>" + rs.getString("precoCompra" ) +  "</td>";
				 saida += "<td>" + rs.getString("icmsCompra" ) +  "</td>";
				 saida += "<td>" + rs.getString("precoVenda" ) +  "</td>";
				 saida += "<td>" + rs.getString("qtdVendida" ) +  "</td>";
				 saida += "<td>" + rs.getString("qtdOcorrencia" ) +  "</td>";
				 saida += "<td>" + rs.getString("ocorrencia" ) +  "</td>";
			     saida += "</tr> <br>";
		      }
		   } catch (SQLException e) {
			 e.printStackTrace();
		   }
		   saida += "</table>";
		   return (saida);
	   }

	
	public void	setIdEstoque( int idEstoque ){
		this.idEstoque=idEstoque;
	};
	
	public int	 getIdEstoque(){
		return ( this.idEstoque );
	};
	
	public void	setIdProduto( int idProduto ){
		this.idProduto=idProduto;
	};
	
	public int	 getIdProduto(){
		return ( this.idProduto );
	};
	
	public void	setDtEntrada( String dtEntrada ){
		this.dtEntrada=dtEntrada;
	};
	
	public String	 getDtEntrada(){
		return ( this.dtEntrada );
	};
	
	public void	setQuantidade( int quantidade ){
		this.quantidade=quantidade;
	};
	
	public int	 getQuantidade(){
		return ( this.quantidade );
	};
	
	public void	setDtFabricacao( String dtFabricacao ){
		this.dtFabricacao=dtFabricacao;
	};
	
	public String	 getDtFabricacao(){
		return ( this.dtFabricacao );
	};
	
	public void	setDtVencimento( String dtVencimento ){
		this.dtVencimento=dtVencimento;
	};
	
	public String	 getDtVencimento(){
		return ( this.dtVencimento );
	};
	
	public void	setNfCompra( String nfCompra ){
		this.nfCompra=nfCompra;
	};
	
	public String	 getNfCompra(){
		return ( this.nfCompra );
	};
	
	public void	setPrecoCompra( double precoCompra ){
		this.precoCompra=precoCompra;
	};
	
	public double	 getPrecoCompra(){
		return ( this.precoCompra );
	};
	
	public void	setIcmsCompra( double icmsCompra ){
		this.icmsCompra=icmsCompra;
	};
	
	public double	 getIcmsCompra(){
		return ( this.icmsCompra );
	};
	
	public void	setPrecoVenda( double precoVenda ){
		this.precoVenda=precoVenda;
	};
	
	public double	 getPrecoVenda(){
		return ( this.precoVenda );
	};
	
	public void	setQtdVendida( int qtdVendida ){
		this.qtdVendida=qtdVendida;
	};
	
	public int	 getQtdVendida(){
		return ( this.qtdVendida );
	};
	
	public void	setQtdOcorrencia( int qtdOcorrencia ){
		this.qtdOcorrencia=qtdOcorrencia;
	};
	
	public int	 getQtdOcorrencia(){
		return ( this.qtdOcorrencia );
	};
	
	public void	setOcorrencia( String ocorrencia ){
		this.ocorrencia=ocorrencia;
	};
	
	public String	 getOcorrencia(){
		return ( this.ocorrencia );
	};
	
} 