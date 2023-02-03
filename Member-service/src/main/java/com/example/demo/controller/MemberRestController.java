package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import com.example.demo.beans.PublicationBean;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Member;
import com.example.demo.proxies.PublicationProxyService;
import com.example.demo.service.IMemberService;

@CrossOrigin
@RestController
public class MemberRestController {
	@Autowired
	IMemberService memberService;
	
	@Autowired
	PublicationProxyService publicationProxyService;


	@GetMapping(value = "/members")
	public List<Member> findmembers() {
		return memberService.findAll();
	}

	@GetMapping(value = "/member/{id}")
	public Member findOneMemberById(@PathVariable Long id) {
		return memberService.findMember(id);
	}

	@GetMapping("/fullmember/{id}")
	public Member findAFullMember(@PathVariable(name = "id") Long id) {

		Member mbr = memberService.findMember(id);
		mbr.setPubs(memberService.findPublicationparauteur(id));

		return mbr;
	}
	
	@RequestMapping(value="/etudiants", method = RequestMethod.GET)
    public List<Member> findEtds(@RequestParam String type_mbre){
        return memberService.findByTypeMbre(type_mbre);
    }
    
    @RequestMapping(value="/enseignants", method = RequestMethod.GET)
    public List<Member> findEnsCh(@RequestParam String type_mbre){
        return memberService.findByTypeMbre(type_mbre);
    }

	@GetMapping(value = "/member/search/cin")
	public Member findOneMemberByCin(@RequestParam String cin) {
		return memberService.findByCin(cin);
	}

	@GetMapping(value = "/member/search/email")
	public Member findOneMemberByEmail(@RequestParam String email) {
		return memberService.findByEmail(email);
	}

	@PostMapping(value = "/members/enseignant")
	public Member addmember(@RequestBody EnseignantChercheur m) {
		return memberService.addMember(m);
	}
	
	@PostMapping(value = "/members/pubtomem")
	public void affectPubToMem(@RequestParam("param1") Long idArt,@RequestParam("param2") Long idMember) {
		memberService.affecterauteurTopublication(idArt, idMember);
		}
	
	@PostMapping(value = "/members/etdtoens")
	public void affectEtdToEns(@RequestParam("param1") Long idEns,@RequestParam("param2") Long idEtd) {
		memberService.affectStudToEns(idEtd, idEns);
		}

	@PostMapping(value = "/members/etudiant")
	public Member addmember(@RequestBody Etudiant e) {
		
		return memberService.addMember(e);
	}

	@DeleteMapping(value = "/members/{id}")
	public void deletemember(@PathVariable Long id) {

		memberService.deleteMember(id);

	}

	@PutMapping(value = "/memberupdate/{id}")
	public Member updatememberid(@PathVariable Long id, @RequestBody Member p) {

		Member m = memberService.findMember(id);
		m.setCin(p.getCin());
		m.setNom(p.getNom());
		m.setCv(p.getCv());
		m.setType_mbre(p.getType_mbre());
		m.setPrenom(p.getPrenom());
		return memberService.updateMemberid(id, m);

	}
	
	@PutMapping(value = "/memberupdateencadrant/{id}")
	public Member updateencadrant(@PathVariable Long id, @RequestBody Member p) {

		Etudiant m = (Etudiant) memberService.findMember(id);
		m.setCin(p.getCin());
		m.setNom(p.getNom());
		m.setCv(p.getCv());
		m.setType_mbre(p.getType_mbre());
		m.setPrenom(p.getPrenom());
		m.setEncadrants(((Etudiant) p).getEncadrants());
		return memberService.updateMemberid(id, m);

	}

	@CrossOrigin(origins = "http://localhost:4200/")
	@PostMapping(value = "/membersave")
	public void savemember(@RequestBody Member p) {
		System.out.println("4656464");

		memberService.saveMember(p);

	}

	@PutMapping(value = "/members/etudiant/{id}")
	public Member updatemember(@PathVariable Long id, @RequestBody Etudiant p) {

		p.setId(id);
		return memberService.updateMember(p);

	}

	@PutMapping(value = "/members/enseignant/{id}")
	public Member updatemember(@PathVariable Long id, @RequestBody EnseignantChercheur p) {
		p.setId(id);
		return memberService.updateMember(p);

	}
	
	@GetMapping("/fullmemberevt/{id}")
	public Member findAFullMemberevt(@PathVariable(name = "id") Long id) {

		Member mbr = memberService.findMember(id);
		mbr.setEvts(memberService.findevenementparparticipant(id));

		return mbr;
	}

}