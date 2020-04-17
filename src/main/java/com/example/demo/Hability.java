package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hability {

	@Id
	private String name;
	private int life;
	private int energy;
	private String type;
	

	Hability(){
	}
	Hability(String name, int life, int energy, String type){
		this.name = name;
		this.life = life;
		this.energy = energy;
		this.type = type;
	}
	
//	GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

//	METHODS
	@Override
	public String toString() {
		return "Hability [name=" + name + ", life=" + life + ", energy=" + energy + ", type=" + type + "]\n\r";
	}
	
	public boolean theSame(Hability hability) {
		boolean same = false;
		
		if(this.name == hability.name) {
			same = true;
		}
		
		return same;
	}
	
}
