package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBQuery;


public class ItemsPedido {
 
	private String	tableName = "";
	private String	fieldsName = "";
	private String	keyField = "";
	// private String	where = "";
	private DBQuery	dbQuery = new DBQuery(tableName, fieldsName, keyField);
	

	private int	idItemPedido;
	private int	ordem;
	private int	idPedido;
	private int	idEstoque;
	private int	qtdItem;
	private String	dtDevolucao;
	private String	motivoDevolucao;

	public ItemsPedido(){
		this.tableName  = "itemsPedido";
		this.fieldsName = "idItemPedido, ordem, idPedido, idEstoque, qtdItem, dtDevolucao, motivoDevolucao";
		this.keyField   = "idItemPedido";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	}

	public ItemsPedido(int idItemPedido, int ordem, int idPedido, int idEstoque, int qtdItem, String dtDevolucao, String motivoDevolucao){
		this.tableName  = "itemsPedido";
		this.fieldsName = "idItemPedido, ordem, idPedido, idEstoque, qtdItem, dtDevolucao, motivoDevolucao";
		this.keyField   = "idItemPedido";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	
		this.setIdItemPedido( idItemPedido);
		this.setOrdem( ordem);
		this.setIdPedido( idPedido);
		this.setIdEstoque( idEstoque);
		this.setQtdItem( qtdItem);
		this.setDtDevolucao( dtDevolucao);
		this.setMotivoDevolucao( motivoDevolucao);
	}
	public String toString(){
		return (
			this.getIdItemPedido() +", "+
			this.getOrdem() +", "+
			this.getIdPedido() +", "+
			this.getIdEstoque() +", "+
			this.getQtdItem() +", "+
			this.getDtDevolucao() +", "+
			this.getMotivoDevolucao() +", "
		);
	 }

	public String[] toArray(){
		return (
			new String[] { 
				""+this.getIdItemPedido(),
				""+this.getOrdem(),
				""+this.getIdPedido(),
				""+this.getIdEstoque(),
				""+this.getQtdItem(),
				""+this.getDtDevolucao(),
				""+this.getMotivoDevolucao()
			}
		);
	 }

	public void save() {
		  if ((this.getIdItemPedido() == 0 )){
		       this.dbQuery.insert(this.toArray());
          }else{
		      this.dbQuery.update(this.toArray());
          }
        }
	
        public void delete() {
            if (this.getIdItemPedido() > 0 ){
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
			     
				 saida += "<td>" + rs.getString("idItemPedido" ) +  "</td>";
				 saida += "<td>" + rs.getString("ordem" ) +  "</td>";
				 saida += "<td>" + rs.getString("idPedido" ) +  "</td>";
				 saida += "<td>" + rs.getString("idEstoque" ) +  "</td>";
				 saida += "<td>" + rs.getString("qtdItem" ) +  "</td>";
				 saida += "<td>" + rs.getString("dtDevolucao" ) +  "</td>";
				 saida += "<td>" + rs.getString("motivoDevolucao" ) +  "</td>";
			     saida += "</tr> <br>";
		      }
		   } catch (SQLException e) {
			 e.printStackTrace();
		   }
		   saida += "</table>";
		   return (saida);
	   }

	
	public void	setIdItemPedido( int idItemPedido ){
		this.idItemPedido=idItemPedido;
	};
	
	public int	 getIdItemPedido(){
		return ( this.idItemPedido );
	};
	
	public void	setOrdem( int ordem ){
		this.ordem=ordem;
	};
	
	public int	 getOrdem(){
		return ( this.ordem );
	};
	
	public void	setIdPedido( int idPedido ){
		this.idPedido=idPedido;
	};
	
	public int	 getIdPedido(){
		return ( this.idPedido );
	};
	
	public void	setIdEstoque( int idEstoque ){
		this.idEstoque=idEstoque;
	};
	
	public int	 getIdEstoque(){
		return ( this.idEstoque );
	};
	
	public void	setQtdItem( int qtdItem ){
		this.qtdItem=qtdItem;
	};
	
	public int	 getQtdItem(){
		return ( this.qtdItem );
	};
	
	public void	setDtDevolucao( String dtDevolucao ){
		this.dtDevolucao=dtDevolucao;
	};
	
	public String getDtDevolucao(){
		return ( this.dtDevolucao );
	};
	
	public void	setMotivoDevolucao( String motivoDevolucao ){
		this.motivoDevolucao=motivoDevolucao;
	};
	
	public String	 getMotivoDevolucao(){
		return ( this.motivoDevolucao );
	};
	
} 