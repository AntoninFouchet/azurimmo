package bts.sio.azurimmo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "locataire")
public class Locataire {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @Column(name="prenom")
	 private String prenom; 
	 
	 @Column(name="nom")
	 private String nom; 
	 
	 @Column(name="numero_tel")
	 private Number numero_tel; 
	 
	 @Column(name="mail")
	 private String mail; 
	 
	 @Column(name="iban")
	 private String iban; 
	 
	 @Column(name="situation")
	 private String situation; 


	 @ManyToOne 
	 @JoinColumn(name = "contrat_id") 
	 private Contrat contrat; 
}