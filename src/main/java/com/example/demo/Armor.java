package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ARMOR")
public class Armor extends Item {
	
	private int armor;
	private int weight;
	
	Armor(){
		
	}
	
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	@Override
	public String toString() {
		return "Armor [armor=" + armor + ", weight=" + weight + "]";
	}

	
	
	
	
	
}
