package com.upskill.java;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";					//write & read 
	private int ssn = 512456125;						//write only
	private String username = "Naim";					//read only
	
	//Setter method - ssn
	public void setName(String value){					//Set the data, write
		name = value;
	}

	//Getter Method - name
	public String getname(){							//get the data, read
		return name;
	}
	
	//Setter Method - ssn
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - Username
	public String getUsername(){
		return username;
	}
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("upskill");
		System.out.println(obj.getname());
		obj.setSSN(452465123);
		System.out.println(obj.getUsername());

	}

}
