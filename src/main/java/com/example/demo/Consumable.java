package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CONS")
public class Consumable extends Item {

	private int quantity;
	
	Consumable(){
		
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Consumable [quantity=" + quantity + "]";
	}
	
	
	
	
	
}
