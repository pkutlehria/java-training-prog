//Write a Java program to create a vehicle class hierarchy. 
//The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
// Base should have properties such as make, model, year, and sub class should have fuel type

import java.util.Scanner;
public class Vehicle{
	Scanner sc = new Scanner(System.in);
	public void make(){
		System.out.println("Enter the brand of the vehicle::");
		String make=sc.nextLine();
		
	}
	
	public void model(){
		System.out.println("Enter the model number of the vehicle::");
		int model=sc.nextInt();
		
		
	}
	public void year(){
		System.out.println("Enter the year of manufacturing of the vehicle::");
		int year=sc.nextInt();
		
		
	}
	
}