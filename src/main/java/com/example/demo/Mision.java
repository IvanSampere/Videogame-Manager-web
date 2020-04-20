package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mision {

	@Id
	private String name;
	private int level;
	private int coins;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "character")
	private MainCharacter character;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "zone")
	private Zone zone;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item")
	private Item item;
	
	
	Mision(){
		name = "default";
		level = 0;
		coins = 0;
		character = new MainCharacter();
		zone = new Zone();
		item =  null;
	}
	Mision(String name, int level, int coins, MainCharacter character, Zone zone, Item item){
		this.name = name;
		this.level = level;
		this.coins = coins;
		this.character = character;
		this.zone = zone;
		this.item = item;
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
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public MainCharacter getCharacter() {
		return character;
	}
	public void setCharacter(MainCharacter character) {
		this.character = character;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
//	METHODS
	@Override
	public String toString() {
		return "Mision [name=" + name + ", level=" + level + ", coins=" + coins + ", character=" + character + ", zone="
				+ zone + ", item=" + item + "]";
	}
	
	
	
	
	
	
	
}