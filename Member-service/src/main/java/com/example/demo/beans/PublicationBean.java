package com.example.demo.beans;

import java.util.Date;

public class PublicationBean {
	private long id;
	private Date date;
	private String titre;
	private String lien;
	private String type;
	private String sourcePdf;
	private String auteur;

	public String getAuteur() {
		return auteur;
	}

	public void setAteur(String auteur) {
		this.auteur = auteur;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSourcePdf() {
		return sourcePdf;
	}

	public void setSourcePdf(String sourcePdf) {
		this.sourcePdf = sourcePdf;
	}

}
