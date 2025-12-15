package bts.sio.azurimmo.model;

import java.time.LocalDate; 

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
@Table(name = "contrat")
public class Contrat {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @Column(name="libelle")
	 private String libelle; 

	 @Column(name="date_debut")
	 private LocalDate dateDebut; 
	 
	 @Column(name="date_fin") 
	 private LocalDate dateFin; 
	 
	 @Column(name="montant_brut") 
	 private float montantBrut; 
	 
	 @Column(name="montant_charges") 
	 private float montantCharges; 
	 
	 @ManyToOne 
	 @JoinColumn(name = "appartement_id") 
	 private Appartement appartement;
	 
}