package org.springboothomework.app.models;

public class User {
	private int id;
	private String name;
	private String gender;
	private String pob;
	
	public User(){
		this(0,"Unknown", "Unknown", "Unknown");
	}
	
	public User(int id, String name, String gender, String pob){
		setId(id);
		setName(name);
		setGender(gender);
		setPob(pob);
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public void setPob(String pob){
		this.pob = pob;
	}
	
	public int getId(){
		return id;
	}	
	
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
	
	public String getPob(){
		return pob;
	}
	
}
