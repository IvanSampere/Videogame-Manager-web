package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "Type")
public abstract class Item {

	@Id
	protected String name;
	protected int value;
	
	@OneToMany
	@JoinColumn(name = "item")
	protected List<Hability> accions = new ArrayList<Hability>();
	
	Item(){
	}
	

//	GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public List<Hability> getAccions() {
		return accions;
	}


	public void setAccions(List<Hability> accions) {
		this.accions = accions;
	}

	
//	METHODS
	@Override
	public String toString() {
		return "Item [name=" + name + ", value=" + value + ", accions=" + accions + "]";
	}
	
	public boolean theSame(Item item) {
		boolean same = false;
		
		if(this.name==item.name) {
			same = true;
		}
		
		if(same==true && this.accions.size()==item.accions.size()) {
			for(int i=0; i<accions.size(); i++) {
				if(this.accions.get(i)!=item.accions.get(i)) {
					same = false;
				}
			}
		}else {
			same = false;
		}
		
		return same;
	}
	
	public boolean addHability(Hability hability) {
		boolean add = true;
		
		for(int i=0; i<this.accions.size() ; i++) {
			if(hability.getName()==this.accions.get(i).getName()) {
				add = false; 
			}
		}
		
		if(add==true) {
			this.accions.add(hability);
		}
		
		return add;
	}
	
	public boolean deleteHability(Hability hability) {
		boolean delete = false;
		int delete_index = -1;
		
		for(int i=0 ; i<this.accions.size() ; i++) {
			if(this.accions.get(i).getName()==hability.getName()) {
				delete = true;
				delete_index = i;
			}
		}
		
		if(delete==true) {
			this.accions.remove(delete_index);
		}
		
		return delete;
	}
	
}
