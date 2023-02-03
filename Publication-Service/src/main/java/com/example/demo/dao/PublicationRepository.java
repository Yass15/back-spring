package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Publication;
@Repository
public interface PublicationRepository extends JpaRepository<Publication,Long>{
    Publication findById(long Id);

    Publication findByTitre(String titre);

    Publication findByLien(String lien);

    List<Publication> findByTitreStartingWith(String caractere);

    List<Publication> findByType(String type);
    

}