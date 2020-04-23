package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		return "hability";
	}
	
	
	
	
	
	
	
}
	

