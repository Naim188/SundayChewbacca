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
		int b = 11;
				int c = (a*b)+ (a+b);
		System.out.println(c);
		
		}
		
		public static void substractionvalue(){
			int a = 30;
			int b = 50;
			int substractionvalue = b-a;
			
			System.out.println(substractionvalue);
		}
}


