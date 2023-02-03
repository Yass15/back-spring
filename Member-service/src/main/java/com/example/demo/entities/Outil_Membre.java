package com.example.demo.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Outil_Membre {

	@EmbeddedId
	private Membre_Out_Ids id;
	@ManyToOne @MapsId("developpeur_Id")
	private Member developpeur;
	public Outil_Membre() {
		super();
	}
	public Outil_Membre(Membre_Out_Ids id, Member developpeur) {
		super();
		this.id = id;
		this.developpeur = developpeur;
	}
	public Membre_Out_Ids getId() {
		return id;
	}
	public void setId(Membre_Out_Ids id) {
		this.id = id;
	}
	public Member getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(Member developpeur) {
		this.developpeur = developpeur;
	}
	
	
}
