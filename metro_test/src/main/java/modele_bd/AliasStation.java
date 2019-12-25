package modele_bd;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Représente un alias d'une station donnée, id est un autre nom 
 * (par exemple BFM pour bibliothèque mitterand, Chatelet - Les Halles pour Châtelet, etc.)
 * @author synophride
 * @version 0 
 * */
@Entity
@Table(name="alias_station")
public class AliasStation {
	
	public AliasStation() {}
	
	@ManyToOne
	@JoinColumn(name="sid")
	Station sid;
	
	@Column(name="alias", nullable=false, length=50)
	String alias;
	
	public Station getSid() {return sid; };
	public void setSid(Station value) { sid = value; } 
	
	public String getAlias() {return alias;}
	public void setAlias(String value) { alias = value; } 
	

}
