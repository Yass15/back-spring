package com.example.demo.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Evenement_Membre {
	@EmbeddedId
	private Membre_Evt_Ids id;
	@ManyToOne @MapsId("participant_Id")
	private Member participant;
	public Evenement_Membre() {
		super();
	}
	public Evenement_Membre(Membre_Evt_Ids id, Member participant) {
		super();
		this.id = id;
		this.participant = participant;
	}
	public Membre_Evt_Ids getId() {
		return id;
	}
	public void setId(Membre_Evt_Ids id) {
		this.id = id;
	}
	public Member getParticipant() {
		return participant;
	}
	public void setParticipant(Member participant) {
		this.participant = participant;
	}
	
}
