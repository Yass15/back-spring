package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.demo.beans.PublicationBean;
import com.example.demo.dao.MemberRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Member;
import com.example.demo.proxies.PublicationProxyService;
import com.example.demo.service.IMemberService;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class MemberServiceApplication implements CommandLineRunner {
	@Autowired
	PublicationProxyService publicationProxyService;
	
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	IMemberService memberService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(MemberServiceApplication.class, args);

	}

	public void run(String... args) throws Exception {
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = dateFormatter.parse("2010-11-16");
		Date d2 = dateFormatter.parse("2010-11-17");
		Date d3 = dateFormatter.parse("2010-11-18");

		Etudiant e1 = new Etudiant("11109272", "Balkis", "Salhi", d1, null, "", "balkis.salhi@enis.tn", "1111", d1,
				"engineer");
		Etudiant e2 = new Etudiant("11109273", "Yessine", "Maalej", d2, null, "", "yessine.maalej@enis.tn", "222", d2,
				"engineer");
		memberRepository.save(e1);
		memberRepository.save(e2);
		EnseignantChercheur ec1 = new EnseignantChercheur("111222333", "Sabeh", "Salhi", d1, null, "",
				"sabeh.salhi@enis.tn", "fhfjv", "sup", "info");
		EnseignantChercheur ec2 = new EnseignantChercheur("11122444", "Nasreddine", "Salhi", d3, null, "",
				"nasreddine.salhi@enis.tn", "shfklg", "sup", "info");
		memberRepository.save(ec1);
		memberRepository.save(ec2);
		
		
		/*Member m= memberService.findMember(1L);
		m.setCv("cv1.pdf");
		memberService.updateMember(m);
		// Delete a Member
		//memberService.deleteMember(2L);
		
		memberService.affectStudToEns(1L,4L);
		
		*/
		/*PublicationBean pub = publicationProxyService.findPublicationById(1L);
		System.out.println(pub.getTitre()+" "+pub.getLien());
		memberService.affecterauteurTopublication(1L, 1L);*/

	}
}