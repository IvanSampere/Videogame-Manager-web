package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repositories.HabilityRepository;
import com.example.demo.Repositories.ItemRepositoy;
import com.example.demo.Repositories.MainCharacterRepository;
import com.example.demo.Repositories.MisionRepository;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Repositories.ZoneRepository;

@Controller
public class Gestor {

//	REPOSITORIES
	@Autowired
	HabilityRepository habilityRepo;
	@Autowired
	ItemRepositoy itemRepo;
	@Autowired
	MainCharacterRepository mainCharacterRepo;
	@Autowired
	MisionRepository misionRepo;
	@Autowired
	UserRepository userRepo;
	@Autowired
	ZoneRepository zoneRepo;
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	/*
	 * Estas dos maneras sirven para lo mismo
	 */
//		---WAY 1---
//	@RequestMapping("/hability")
//	public ModelAndView habilities() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("habilities", habilityRepo.findAll());
//		return mav;
//	}
//		---WAY 2---
	@RequestMapping("/hability")
	public String hability(Model model) {
		model.addAttribute("habilities",habilityRepo.findAll());
		model.addAttribute("hability", new Hability());
		return "hability";
	}
	/*
	 * Este metodo borra una habilidad según su id
	 */
	@RequestMapping("/hability/delete/{id}")
	public String deleteHability(@PathVariable("id") int id, Model model) {
		habilityRepo.deleteById(id);
		return "redirect:/hability";
	}
	/*
	 * Este metodo añade una habilidad desde el formulario
	 */
	@PostMapping("/hability/add")
	public String addHability(Hability hability) {
		List<Hability> nameRepo = (List<Hability>) habilityRepo.findAll();
		boolean add = true;
		for(Hability name : nameRepo) {
			if(hability.getName().equalsIgnoreCase(name.getName())) {
				add=false;
			}
		}
		
		if(add==true) {
			habilityRepo.save(hability);
		}
		
		return "redirect:/hability";
	}
	
	
	
}
	

