package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Membre_Out_Ids;
import com.example.demo.entities.Outil_Membre;



public interface MembreOutRepository extends JpaRepository<Outil_Membre, Membre_Out_Ids>{
	@Query("select m from Outil_Membre m where developpeur_Id=:x")
	List<Outil_Membre> findoutId(@Param ("x") Long devId);

}
