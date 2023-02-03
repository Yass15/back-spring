package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Evenement implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private Date date;
    private String lieu;
    private String titre;
    
    public Evenement() {}
    public Evenement(long id, Date date, String lieu, String titre) {
		super();
		this.id = id;
		this.date = date;
		this.lieu = lieu;
		this.titre = titre;
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
    public String getLieu() {
        return lieu;
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
}