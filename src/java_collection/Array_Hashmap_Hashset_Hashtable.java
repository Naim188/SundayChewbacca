package java_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		// Array store multiple data using index
		
		int age = 30;												//Variable
		int[] agechewbacca = new int[]{24, 45, 29, 35, 33, 28};		//Array
		
		// Array Index                  0   1   2   3   4   5
		
		System.out.println("student age:" + agechewbacca[3]);
		
		String[]namechewbacca = new String[]{"Joy","Fariyan","Naim","Alex","Mamun","forhad"};
		System.out.println("student name:" + namechewbacca[2]);
		System.out.println("Total student:" + namechewbacca.length);
		
		//Multi-Dimentional Array
		
		int[][] agechewbacca2D = {{24,45,29,35,33,28},	//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
								{24,45,28}};			//[1][0] [1][1] [1][2]
		
		System.out.println("student age 2D:" + agechewbacca2D[1][2]);
		
		//Hashmap store multiple data using key value paie, Implementation of map interface
		
		HashMap<String,Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Joy", 24);
		Student.put("Fariyan", 45);
		Student.put("Alex", 29);
		Student.put("Mamun", 35);
		Student.put("Jahid", 33);
		Student.put("Naim", 24);
		System.out.println("Student Age;" +Student.get("Alex"));
		
		
		HashMap<String,String> Capital = new HashMap<String, String>();
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		System.out.println("Capital City:" +Capital.get("USA"));
		System.out.println("Capital City:" +Capital.get("BD"));
		
		//Hashset store unordered collection containing unique value, Implementation of set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Toyota");
		System.out.println("car:" + car);
		
		//HashTable store multiple data using key-value pair, but is synchronized (only one thread can be modified)
		
		Hashtable<String,String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		System.out.println("Region:" +Region.get("USA"));
		
		}
	}
	




