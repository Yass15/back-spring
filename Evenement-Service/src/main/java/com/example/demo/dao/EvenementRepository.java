package com.example.demo.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.example.demo.entities.Evenement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement,Long>{
	Evenement findById(long id);
    List<Evenement>findByTitreStartingWith(String caractere);
}
