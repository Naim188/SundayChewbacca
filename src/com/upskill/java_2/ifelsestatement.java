package com.upskill.java_2;

public class ifelsestatement {
	
	public static int age = 98;

	public static void main(String[] args) {
		conditionalStatement();
		
	}
	
	public static void conditionalStatement(){
		
		if(age<13){
			System.out.println("You are a children");
		}else if(age>13 && age <18){
			System.out.println("You are a Teenager");
		}else if (age>60){
			//Nested if Else Statement
			if(age > 100){
			System.out.println("You are a Hero");
		}else {
			System.out.println("You are Senior");
		}
		}else{
			System.out.println("You are a Adult");
			
					
			}
			
				
			}
		
	}

	
	
	

