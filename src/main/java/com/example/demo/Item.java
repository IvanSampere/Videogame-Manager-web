package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "type_id")
public abstract class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	protected String name;
	protected int value;
	

	/* Forma 1
	 * @OneToMany(fetch = FetchType.LAZY)
	 */
//	forma2
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "item")
	protected List<Hability> accions;
	
	Item(){
		accions = new ArrayList<Hability>(5);
	}
	Item(String name, int value){
		this.name = name;
		this.value = value;
		accions = new ArrayList<Hability>(5);
	}
	

//	GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
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
		return "Item [name=" + name + ", value=" + value + ", Accions: \t" + accions + "]";
	}
	
	public boolean theSame(Item item) {
		boolean same = false;
		
		if(this.name.equalsIgnoreCase(item.name)) {
			same = true;
		}
		
		if(item.accions != null) {
			if(same==true && this.accions.size()==item.accions.size()) {
				for(int i=0; i<accions.size(); i++) {
					if(this.accions.get(i)!=item.accions.get(i)) {
						same = false;
					}
				}
			}else {
				same = false;
			}
		}
		return same;
	}
	
	public boolean addHability(Hability hability) {
		boolean add = true;
		
		if(this.getAccions().contains(hability)) {
			add = false;
		}

		if(add==true) {
			this.accions.add(hability);
		}
		
		return add;
	}
	
	public boolean deleteHability(Hability hability) {
		boolean delete = false;
		
		if(this.accions.contains(hability)==true) {
			delete = true;
		}
		
		if(delete==true) {
			int indexRemove = this.accions.indexOf(hability);
			this.accions.remove(indexRemove);
		}
		
		return delete;
	}
	
}
