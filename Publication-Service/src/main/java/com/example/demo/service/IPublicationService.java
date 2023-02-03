package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Publication;



public interface IPublicationService {
    // Crud sur les publications
        public Publication addPublication(Publication p);

        public void deletePublication(Long id);

        public Publication updatePublication(Publication p);

        public Publication findPublication(Long id);

        public List<Publication> findAll();

        // Filtrage par propriété
        public Publication findByTitre(String titre);

        public Publication findByLien(String lien);

        public List<Publication> findByTitreStartingWith(String caractere);

        public List<Publication> findByType(String type);

        
}