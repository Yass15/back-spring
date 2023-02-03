package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Evenement_Membre;
import com.example.demo.entities.Membre_Evt_Ids;



public interface MembreEvtRepository extends JpaRepository<Evenement_Membre, Membre_Evt_Ids>{
	@Query("select m from Evenement_Membre m where participant_Id=:x")
	List<Evenement_Membre> findevtId(@Param ("x") Long partId);
}
