package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publication implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private Date date;
    private String titre;
    private String lien;
    private String type;
    private String sourcePdf;
    private String auteur;
    public Publication(long id, Date date, String titre, String lien, String type, String sourcePdf, String auteur) {
        super();
        this.id = id;
        this.date = date;
        this.titre = titre;
        this.lien = lien;
        this.type = type;
   
        this.sourcePdf = sourcePdf;
        this.auteur=auteur;
    }
    public Publication() {}
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAteur(String auteur) {
        this.auteur = auteur;
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