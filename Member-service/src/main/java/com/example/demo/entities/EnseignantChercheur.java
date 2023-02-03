package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Member implements Serializable{

	private String grade;
	private String etablissement;

	public EnseignantChercheur() {
		super();
		}

	public EnseignantChercheur(String cin, String nom, String prenom, Date date, byte[] photo, String cv, String email,
		String password, String grade, String etablissement) {
		super(cin, nom, prenom, date, photo, cv, email, password,"ens");
		this.grade = grade;
		this.etablissement = etablissement;
		}

	@OneToMany(mappedBy = "encadrants")
	private Collection<Etudiant> etudiants;

	

	

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
