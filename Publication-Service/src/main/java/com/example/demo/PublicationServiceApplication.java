package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entities.Publication;

@SpringBootApplication
@EnableDiscoveryClient
public class PublicationServiceApplication implements CommandLineRunner{
	
	@Autowired
	PublicationRepository publicationRepository;

	public static void main(String[] args) {
		SpringApplication.run(PublicationServiceApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = dateFormatter.parse("2010-11-16");
        Date d2 = dateFormatter.parse("2010-11-17");

        Publication e1 = new Publication(151213615,d1, "pub1","lien1", "type1", "source2",null);
        Publication e2 = new Publication(151213152,d2, "pub2","lien1", "type2", "source2",null);
        publicationRepository.save(e1);
        publicationRepository.save(e2);

    }

}
