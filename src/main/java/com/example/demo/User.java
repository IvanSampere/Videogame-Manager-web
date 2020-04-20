package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nick;
	private String email;
	private String dni;
	private String pass;
	private String type;
	
	User(){
		
	}
	User(String nick, String email, String dni, String pass, String type){
		this.nick = nick;
		this.email = email;
		this.dni = dni;
		this.pass = pass;
		this.type = type;
	}
	
	
//	GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
//	METHODS
	@Override
	public String toString() {
		return "User [id=" + id + ", nick=" + nick + ", email=" + email + ", dni=" + dni + ", pass=" + pass + ", type="
				+ type + "]";
	}
	
	public boolean validateAnyDni(String dni) {
		boolean dniOk = false;
		char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B'
				,'N','J','Z','S','Q','V','H','L','C','K','E','T'};
		
		if(dni.length()==9) {
			try {
				
				dni.toCharArray();
				String subDni = dni.substring(0, 8);
				Integer.parseInt(subDni);
				
				for(char letter : letras) {
					if(dni.charAt(8)==letter) {
						dniOk = true;
					}
				}
			} catch(NumberFormatException e) {
				System.out.println("Error en DNI");
				dniOk = false;
			}
		}else {
			dniOk = false;
		}
		
		return dniOk;
	}
	
	public boolean validateDni(String dni) {
		boolean dniOk = false;
		char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B'
				,'N','J','Z','S','Q','V','H','L','C','K','E','T'};
		
		if(dni.length()==9) {
			try {
				
				dni.toCharArray();
				String subDni = dni.substring(0, 8);
				int numDni = Integer.parseInt(subDni);
				int result = numDni%23;
			
				if(dni.charAt(8)==letras[result]) {
					dniOk = true;
				}
				
			} catch(NumberFormatException e) {
				System.out.println("Error en DNI");
				dniOk = false;
			}
		}else {
			dniOk = false;
		}
		
		
		return dniOk;
	}
	
	
	
	
	
	
	
}