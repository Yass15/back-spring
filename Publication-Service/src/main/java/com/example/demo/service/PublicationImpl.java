package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entities.Publication;

@Service
public class PublicationImpl implements IPublicationService {
    
    @Autowired
    PublicationRepository publicationRepository;

    @Override
    public Publication addPublication(Publication p) {
        publicationRepository.save(p);
        return p;
    }

    @Override
    public void deletePublication(Long id) {
        publicationRepository.deleteById(id);

    }

    @Override
    public Publication updatePublication(Publication p) {
        return publicationRepository.saveAndFlush(p);
    }

    @Override
    public Publication findPublication(Long id) {
        Publication p = (Publication) publicationRepository.findById(id).get();
        return p;
    }

    @Override
    public List<Publication> findAll() {
        return publicationRepository.findAll();
    }

    @Override
    public Publication findByTitre(String titre) {
        return publicationRepository.findByTitre(titre);
    }

    @Override
    public Publication findByLien(String lien) {
        return publicationRepository.findByLien(lien);
    }

    @Override
    public List<Publication> findByTitreStartingWith(String caractere) {
        return publicationRepository.findByTitreStartingWith(caractere);
    }

    @Override
    public List<Publication> findByType(String type) {
        return publicationRepository.findByType(type);
    }

}