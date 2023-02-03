
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Publication_Member;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	List<Etudiant> findByDiplome(String diplome);

	List<Etudiant> findByDiplomeOrderByDateInscriptionDesc(String diplome);

}
