package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mision {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int level;
	private int coins;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "objetive")
	private MainCharacter objetive;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "zone")
	private Zone zone;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reward")
	private Item reward;
	
	
	Mision(){
	}
	Mision(String name, int level, int coins, MainCharacter character, Zone zone, Item item){
		this.name = name;
		this.level = level;
		this.coins = coins;
		this.objetive = character;
		this.zone = zone;
		this.reward = item;
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
	public MainCharacter getObjetive() {
		return objetive;
	}
	public void setObjetive(MainCharacter objetive) {
		this.objetive = objetive;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Item getReward() {
		return reward;
	}
	public void setReward(Item reward) {
		this.reward = reward;
	}
	//	METHODS
	@Override
	public String toString() {
		return "Mision [name=" + name + ", level=" + level + ", coins=" + coins + ", character=" + objetive + ", zone="
				+ zone + ", item=" + reward + "]";
	}
	
	
	
	
	
	
	
}