package com.upskill.java_2;

public class Methodtype {

	/*Type of Methods
	 1.Void Method
	 2.Static Method
	 3.Return type Method */
	
	
	public static int hourlyincome = 65;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodtype obj = new Methodtype();
		obj.annualIncomeVoid();
		weeklyIncomeStatic();
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());

	}
	
	//Void method
	public void annualIncomeVoid(){
		int annualIncome = hourlyincome * 2000;
		System.out.println("My Annual Income = " + annualIncome);
	}

	//Void method
	public static void weeklyIncomeStatic(){
		int weeklyIncome = hourlyincome * 40;
		System.out.println("My Weekly Income = " + weeklyIncome);
	}
	
	//Return Type Method
	public int monthlyIncomeReturn(){ 
	int monthlyIncome = hourlyincome * 180;
	return monthlyIncome;
	
	}
}
