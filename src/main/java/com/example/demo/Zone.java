package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Zone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int level;
	
	@OneToMany
	@JoinColumn(name = "zone")
	private List<MainCharacter> npcs;
	
	Zone(){
		name = "default";
		level = 0;
		npcs = new ArrayList<MainCharacter>(10);
	}
	Zone(String name, int level){
		this.name = name;
		this.level = level;
		npcs = new ArrayList<MainCharacter>(10);
	}
	
	
//	GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public List<MainCharacter> getNpcs() {
		return npcs;
	}
	public void setNpcs(List<MainCharacter> npcs) {
		this.npcs = npcs;
	}
	
	
//	METHODS
	@Override
	public String toString() {
		return "Zone [name=" + name + ", level=" + level + ", npcs=" + npcs + "]";
	}
	
	public boolean theSame(Zone zone) {
		boolean same = false;
		
		if(this.name==zone.name) {
			same = true;
		}
		
		return same;
	}
	
	
	public boolean addMainCharacter(MainCharacter character) {
		boolean add = true;
		
		for(int i=0; i<this.npcs.size() ; i++) {
			if(character.getName()==this.npcs.get(i).getName() || this.npcs.size()>=10) {
				add = false; 
			}
		}

		if(add==true) {
			this.npcs.add(character);
		}
		
		return add;
	}
	
	
	public boolean deleteMainCharacter(MainCharacter character) {
		boolean delete = false;
		
		if(this.npcs.contains(character)==true) {
			delete = true;
		}
		
		if(delete==true) {
			int indexRemove = this.npcs.indexOf(character);
			this.npcs.remove(indexRemove);
		}
		
		return delete;
	}
	
	
	
	
}
