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
public class MainCharacter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String kind;
	private int max_life;
	private int max_energy;
	private int actual_life;
	private int actual_energy;
	private int coins;
	private boolean npc;
	private boolean hostile;
	
	@OneToMany
	@JoinColumn(name = "character")
	private List<Hability> habilities;
	
	@OneToMany
	@JoinColumn(name = "character")
	private List<Item> set;
	
	
	MainCharacter(){
		
	}
	MainCharacter(String name, String kind, int max_life, int max_energy, int actual_life, int actual_energy, int coins, boolean npc, boolean hostile){
		this.name = name; 
		this.kind = kind; 
		this.max_life = max_life;
		this.max_energy = max_energy;
		this.actual_life = actual_life;
		this.actual_energy = actual_energy;
		this.coins = coins;
		this.npc = npc;
		this.hostile = hostile;
		habilities = new ArrayList<Hability>(5);
		set = new ArrayList<Item>(10);
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
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getMax_life() {
		return max_life;
	}
	public void setMax_life(int max_life) {
		this.max_life = max_life;
	}
	public int getMax_energy() {
		return max_energy;
	}
	public void setMax_energy(int max_energy) {
		this.max_energy = max_energy;
	}
	public int getActual_life() {
		return actual_life;
	}
	public void setActual_life(int actual_life) {
		this.actual_life = actual_life;
	}
	public int getActual_energy() {
		return actual_energy;
	}
	public void setActual_energy(int actual_energy) {
		this.actual_energy = actual_energy;
	}
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public List<Hability> getHabilities() {
		return habilities;
	}
	public void setHabilities(List<Hability> habilities) {
		this.habilities = habilities;
	}
	public List<Item> getSet() {
		return set;
	}
	public void setSet(List<Item> set) {
		this.set = set;
	}
	public boolean isNpc() {
		return npc;
	}
	public void setNpc(boolean npc) {
		this.npc = npc;
	}
	public boolean isHostile() {
		return hostile;
	}
	public void setHostile(boolean hostile) {
		this.hostile = hostile;
	}
	
	
//	METHODS
	@Override
	public String toString() {
		return "Character [name=" + name + ", kind=" + kind + ", max_life=" + max_life + ", max_energy=" + max_energy
				+ ", actual_life=" + actual_life + ", actual_energy=" + actual_energy + ", coins=" + coins
				+ ", habilities=" + habilities + ", set=" + set + ", npc=" + npc + ", hostile=" + hostile + "]";
	}
	
	public boolean theSame(MainCharacter character) {
		boolean same = false;
		
		if(this.name.equalsIgnoreCase(character.name)) {
			same = true;
		}
		
		return same;
	}
	
	
	
}
