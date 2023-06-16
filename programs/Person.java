//Write a Java program to create a class known as Person with methods called getFirstName()
// and getLastName(). Create a subclass called Employee that adds a 
//new method named getEmployeeId().

import java.util.Scanner;
public class Person{
	Scanner s = new Scanner(System.in);
	public void getFirstName(){
		System.out.println("Enter your first-name::");
		String firstName = s.nextLine();
		
	}
	
	public void getLastName(){
		System.out.println("Enter your last-name::");
		String lastName = s.nextLine();
		
		
	}
}



