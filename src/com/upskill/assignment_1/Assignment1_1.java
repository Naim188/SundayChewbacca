package com.upskill.assignment_1;

public class Assignment1_1 {

	public static void main(String[] args){
		trianglePerimeter();
		multiplicationValue();
		substractionvalue();
	}
		public static void trianglePerimeter(){
			int a = 5;
			int b = 7;
			int c = 11;
			int perimeter = a+b+c;
			System.out.println("The perimeter "+ perimeter);
			}
		
		
		public static void multiplicationValue() {
		int a = 9;
		int c = 11;
				int b = (a*c)+ (a+c);
		System.out.println(c);
		
		}
		
		public static void substractionvalue(){
			int a = 30;
			int b = 60;
			int substractionvalue = b-a;
			
			System.out.println(substractionvalue);
		}
}


