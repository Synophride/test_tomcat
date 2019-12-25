package modele_bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Classe représentant une station de métro, indépendamment de la ligne où elle se situe
 * @author synophride
 * @version 0
 **/
@Entity
@Table(name="stations")
public class Station {
	
	Station(){
		nom = null;
		nomAppel = null;
	}
	
	// Identifiant
	@Id
	@GeneratedValue
	@Column(name = "sid")
	private Integer sid;
	
	// Nom de la station
	@Column(name="nom", nullable=false, length=50)
	private String nom;
	
	// Nom utilisé pour l'appel à l'api
	@Column(name="nom_appel", nullable=false, length=50)
	private String nomAppel;
	
	
	// Getters et Setters, rien de très marquant
	public int getSid() {
		return sid;
	}
	public void setSid(Integer value) {
		sid = value;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String value) {
		nom = value;
	}
	public String getNomAppel() {
		return nomAppel;
	}
	public void setNomAppel(String value) {
		nomAppel = value;
	}
}
