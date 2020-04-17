package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "WEAP")
public class Weapon extends Item {

	private int grievance;
	private int weight;
	
	
	Weapon(){
		
	}
	
	
	public int getGrievance() {
		return grievance;
	}
	public void setGrievance(int grievance) {
		this.grievance = grievance;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Weapon [grievance=" + grievance + ", weight=" + weight + "]";
	}
	
	
	
	
}
