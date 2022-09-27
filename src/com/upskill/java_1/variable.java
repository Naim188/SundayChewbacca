package com.upskill.java_1;

public class variable {
	
	//variable in java
	
	public String country = "USA";				//Instance OR global variable - variable declared in class level, outside method
	
	public static String region = "America";	//Static variables - belong to class and don't required creating object 

	public static void main(String[] args) {
		
		String city = "NYC";					//Local variable - variables declared in method

	}
	
	public void myMethod(String country){		//Method parameter - variables used as method parameter
		
		String mycountry = country; 
	}

}
