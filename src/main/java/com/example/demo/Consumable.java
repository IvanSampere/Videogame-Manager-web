package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CONS")
public class Consumable extends Item {

	private int quantity;
	
	Consumable(){
		name = "default";
		value = -1;
		quantity = -1;
	}
	Consumable(String name, int value, int quantity){
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Consumable [quantity=" + quantity + ", name=" + name + ", value=" + value + ",\n accions=" + accions
				+ "]";
	}
	
	
	
	
	
}
