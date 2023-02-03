package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Membre_Evt_Ids implements Serializable{
	private Long evenement_id;
	private Long participant_Id;
	public Membre_Evt_Ids() {
		super();
	}
	public Membre_Evt_Ids(Long evenement_id, Long participant_Id) {
		super();
		this.evenement_id = evenement_id;
		this.participant_Id = participant_Id;
	}
	public Long getEvenement_id() {
		return evenement_id;
	}
	public void setEvenement_id(Long evenement_id) {
		this.evenement_id = evenement_id;
	}
	public Long getParticipant_Id() {
		return participant_Id;
	}
	public void setParticipant_Id(Long participant_Id) {
		this.participant_Id = participant_Id;
	}
	
	
}
