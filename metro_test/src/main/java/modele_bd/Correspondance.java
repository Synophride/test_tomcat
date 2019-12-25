package modele_bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="correspondances")
public class Correspondance {
	
	@Id
	@GeneratedValue
	Integer cid;
	
	@Column(name="sid")
	@ManyToOne
	@JoinColumn(name="sid")
	Station sid;
	
	@Column(name="pos")
	Integer pos; 
	
}
