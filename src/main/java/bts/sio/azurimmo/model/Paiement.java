package bts.sio.azurimmo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "paiement")
public class Paiement {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @Column(name="libelle")
	 private String libelle; 

	 @Column(name="date_paiement")
	 private LocalDate datePaiement; 

	 
	 @Column(name="type_paiement") 
	 private String typePaiement; 
	 
	 @Column(name="satut") 
	 private String statut; 
	 
	 
	 @ManyToMany
	 @JoinColumn(name = "contrat_id") 
	 private Appartement contrat;
}
