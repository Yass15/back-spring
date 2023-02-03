package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Membre_Out_Ids implements Serializable{
	private Long outil_id;
	private Long developpeur_Id;
	public Membre_Out_Ids() {
		super();
	}
	public Membre_Out_Ids(Long outil_id, Long developpeur_Id) {
		super();
		this.outil_id = outil_id;
		this.developpeur_Id = developpeur_Id;
	}
	public Long getOutil_id() {
		return outil_id;
	}
	public void setOutil_id(Long outil_id) {
		this.outil_id = outil_id;
	}
	public Long getDeveloppeur_Id() {
		return developpeur_Id;
	}
	public void setDeveloppeur_Id(Long developpeur_Id) {
		this.developpeur_Id = developpeur_Id;
	}
	
	
	
	
	
	
	
	
}
