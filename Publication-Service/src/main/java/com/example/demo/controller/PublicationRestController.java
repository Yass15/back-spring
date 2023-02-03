package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Publication;
import com.example.demo.service.IPublicationService;

@RestController
public class PublicationRestController {
	@Autowired
    IPublicationService publicationService;
    
    @RequestMapping(value = "/publications", method = RequestMethod.GET)
    public List<Publication> findPublications() {
        return publicationService.findAll();
    }
    
    @GetMapping(value = "/publication/{id}")
    public Publication findOnePublicationById(@PathVariable Long id) {
        return publicationService.findPublication(id);
    }
    
    @GetMapping(value = "/publication/search/titre")
    public Publication findOnePublicationByTitre(@RequestParam String titre) {
        return publicationService.findByTitre(titre);
    }
    
    @GetMapping(value = "/publication/search/lien")
    public Publication findOnePublicationByLien(@RequestParam String lien) {
        return publicationService.findByLien(lien);
    }
    
    @GetMapping(value = "/publications/search/type")
    public List<Publication> findPublicationsByType(@RequestParam String type) {
        return publicationService.findByType(type);
    }
    
    
    //Ajouter
    @PostMapping(value = "/publications")
    public Publication addPublication(@RequestBody Publication p) {
        return publicationService.addPublication(p);
    }

    
    
    //supprimer
    
     @DeleteMapping(value = "/publications/{id}") public void
     deletePublication(@PathVariable Long id) {
      
     publicationService.deletePublication(id);
     
     }
     
    
    //modifier
    @PutMapping(value = "/publications/{id}")
    public Publication updatePublication(@PathVariable Long id, @RequestBody Publication p) {

    	Publication m = publicationService.findPublication(id);
		m.setTitre(p.getTitre());
		m.setLien(p.getLien());
		m.setSourcePdf(p.getSourcePdf());
        return publicationService.updatePublication(m);

    }
    
    @PutMapping(value = "/publicationsaut/{id}")
    public Publication updatePublicationAuteur(@PathVariable Long id, @RequestBody Publication p) {

    	Publication m = publicationService.findPublication(id);
		m.setTitre(p.getTitre());
		m.setLien(p.getLien());
		m.setSourcePdf(p.getSourcePdf());
		m.setAteur(p.getAuteur());
        return publicationService.updatePublication(m);

    }

}
