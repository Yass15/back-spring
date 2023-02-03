package com.example.demo;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entities.Evenement;

@SpringBootApplication
public class EvenementServiceApplication implements CommandLineRunner{
	
	@Autowired
    EvenementRepository evenementRepository;

	public static void main(String[] args) {
		SpringApplication.run(EvenementServiceApplication.class, args);
	}
	
	 public void run(String... args) throws Exception {
	        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	        Date d1 = dateFormatter.parse("2010-11-16");
	        Date d2 = dateFormatter.parse("2010-11-17");

	        Evenement e1 = new Evenement(151213615, d1, "Sfax, route ", "pitch");
	        Evenement e2 = new Evenement(151213152, d2, "Sousse, route ", "std");
	        evenementRepository.save(e1);
	        evenementRepository.save(e2);

	    }
}
