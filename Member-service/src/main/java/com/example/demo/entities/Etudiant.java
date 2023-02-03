package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("etd")
public class Etudiant extends Member implements Serializable{
	
	

	@ManyToOne
	private EnseignantChercheur encadrants;
	private Date dateInscription;
	private String diplome;
	
	public Etudiant(EnseignantChercheur encadrants, Date dateInscription, String diplome) {
		super();
		this.encadrants = encadrants;
		this.dateInscription = dateInscription;
		this.diplome = diplome;
	}

	public Etudiant() {
		super();
	}
	
	public Etudiant(String cin, String nom, String prenom, Date date, byte[] photo, String cv, String email,
			String password, Date dateInscription, String diplome) {
			super(cin, nom, prenom, date, photo, cv, email, password,"etd");
			this.dateInscription = dateInscription;
			this.diplome = diplome;
			}
	
	public EnseignantChercheur getEncadrants() {
		return encadrants;
	}

	public void setEncadrants(EnseignantChercheur encadrants) {
		this.encadrants = encadrants;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	
	
	
	
	
	
}
