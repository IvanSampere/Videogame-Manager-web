package com.example.demo;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ARMOR")
public class Armor extends Item {
	
	private int armor;
	private int weight;
	private String type = "ARMOR";
	
	Armor(){
	}
	Armor(String name, int value, int armor, int weight){
		this.name = name;
		this.value = value;
		this.armor = armor;
		this.weight = weight;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "Armor [name=" + name + ", value=" + value + ", armor= " + armor + ", weight=" + weight + ", ,\n Accions:"
				+ accions + "]";
	}

	
	
	
	
	
}
