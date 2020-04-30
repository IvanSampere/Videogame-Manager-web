package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
//	-----------------------------------------------------------HABILITY------------------------------------------------------------------------------

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
		List<Hability> checkName = (List<Hability>) habilityRepo.findAll();
		boolean add = true;
		for(Hability name : checkName) {
			if(hability.getName().equalsIgnoreCase(name.getName())) {
				add=false;
			}
		}
		
		if(add==true) {
			habilityRepo.save(hability);
		}
		
		return "redirect:/hability";
	}
	
//	-----------------------------------------------------------ARMOR------------------------------------------------------------------------------
	@RequestMapping("/armor")
	public String armor(Model model) {
		model.addAttribute("habilities",habilityRepo.findAll());
		model.addAttribute("armors", itemRepo.findArmors());
		model.addAttribute("newArmor" , new Armor());
		return "armor";
	}
	
	@RequestMapping("/armor/delete/{id}")
	public String deleteArmor(@PathVariable("id") int id) {
		itemRepo.deleteById(id);
		return "redirect:/armor";
	}
	
	@PostMapping("/armor/add")
	public String addArmor(Armor armor) {
		boolean add = true;
		List<Item> checkArmor = itemRepo.findArmors();
		for(Item i : checkArmor) {
			if(i.theSame(armor)==true) {
				add = false;
			}
		}
		
		if(add==true) {
			itemRepo.save(armor);
		}
		
		return "redirect:/armor";
	}
	
	@PostMapping(value="/armor/addHability",params = {"armorId", "habilityId"})
	public String addHabilityToArmor(final HttpServletRequest req) {
		
		String armorName = req.getParameter("armorId");
		String habilityName = req.getParameter("habilityId");
		
		Item armor = itemRepo.findByName(armorName);
		Hability hability = habilityRepo.findByName(habilityName);
		
		armor.addHability(hability);
		itemRepo.save(armor);
		
		return "redirect:/armor";
	}
		
	@RequestMapping("/armor/deleteHability/{armor}/{hability}")
	public String deleteHabilityToArmor(@PathVariable("hability") String idHab, @PathVariable("armor") String idArmor) {
		
		Item armor = itemRepo.findByName(idArmor);
		Hability hability = habilityRepo.findByName(idHab);
		
		armor.deleteHability(hability);
		itemRepo.save(armor);
		
		return "redirect:/armor";
	}
	

//	-----------------------------------------------------------WEAPON------------------------------------------------------------------------------

	@RequestMapping("/weapon")
	public String weapon(Model model) {
		model.addAttribute("habilities",habilityRepo.findAll());
		model.addAttribute("weapons", itemRepo.findWeapons());
		model.addAttribute("newWeapon" , new Weapon());
		return "weapon";
	}
	
	@RequestMapping("/weapon/delete/{id}")
	public String deleteWeapon(@PathVariable("id") int id) {
		itemRepo.deleteById(id);
		return "redirect:/weapon";
	}
	
	@PostMapping("/weapon/add")
	public String addWeapon(Weapon weapon) {
		boolean add = true;
		List<Item> checkWeapon = itemRepo.findWeapons();
		for(Item i : checkWeapon) {
			if(i.theSame(weapon)==true) {
				add = false;
			}
		}
		
		if(add==true) {
			itemRepo.save(weapon);
		}
		
		return "redirect:/weapon";
	}
	
	@PostMapping(value="/weapon/addHability",params = {"weaponId", "habilityId"})
	public String addHabilityToWeapon(final HttpServletRequest req) {
		
		String weaponName = req.getParameter("weaponId");
		String habilityName = req.getParameter("habilityId");
		
		Item weapon = itemRepo.findByName(weaponName);
		Hability hability = habilityRepo.findByName(habilityName);
		
		weapon.addHability(hability);
		itemRepo.save(weapon);
		
		return "redirect:/weapon";
	}
		
	@RequestMapping("/weapon/deleteHability/{weapon}/{hability}")
	public String deleteHabilityToWeapon(@PathVariable("hability") String idHab, @PathVariable("weapon") String idWeapon) {
		
		Item weapon = itemRepo.findByName(idWeapon);
		Hability hability = habilityRepo.findByName(idHab);
		
		weapon.deleteHability(hability);
		itemRepo.save(weapon);
		
		return "redirect:/weapon";
	}
	
	
	
//	-----------------------------------------------------------CONSUMIABLES------------------------------------------------------------------------------

	@RequestMapping("/consumable")
	public String consumable(Model model) {
		model.addAttribute("habilities",habilityRepo.findAll());
		model.addAttribute("consumables", itemRepo.findConsumables());
		model.addAttribute("newConsumable" , new Consumable());
		return "consumable";
	}
	
	@RequestMapping("/consumable/delete/{id}")
	public String deleteConsumable(@PathVariable("id") int id) {
		itemRepo.deleteById(id);
		return "redirect:/consumable";
	}
	
	@PostMapping("/consumable/add")
	public String addConsumable(Consumable consumable) {
		boolean add = true;
		List<Item> checkConsumable = itemRepo.findConsumables();
		for(Item i : checkConsumable) {
			if(i.theSame(consumable)==true) {
				add = false;
			}
		}
		
		if(add==true) {
			itemRepo.save(consumable);
		}
		
		return "redirect:/consumable";
	}
	
	@PostMapping(value="/consumable/addHability",params = {"consumableId", "habilityId"})
	public String addHabilityToconsumable(final HttpServletRequest req) {
		
		String consumableName = req.getParameter("consumableId");
		String habilityName = req.getParameter("habilityId");
		
		Item consumable = itemRepo.findByName(consumableName);
		Hability hability = habilityRepo.findByName(habilityName);
		
		consumable.addHability(hability);
		itemRepo.save(consumable);
		
		return "redirect:/consumable";
	}
		
	@RequestMapping("/consumable/deleteHability/{consumable}/{hability}")
	public String deleteHabilityToConsumable(@PathVariable("hability") String idHab, @PathVariable("consumable") String idConsumable) {
		
		Item consumable = itemRepo.findByName(idConsumable);
		Hability hability = habilityRepo.findByName(idHab);
		
		consumable.deleteHability(hability);
		itemRepo.save(consumable);
		
		return "redirect:/consumable";
	}
	
	
	
	
	
	
}
	

