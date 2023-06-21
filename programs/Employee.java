/*Create a class named Employee with following data members
first name
last name
bonus 
base salary
Ask the user the count of employee they want to enter and create array of employee objects. 
In this save values and calculate the salary as per the month entered by the user.*/

import java.util.Scanner;
public class Employee{
			String first_name,last_name;
			int bonus,base_salary;
	public static void main(String args[]){
			
			System.out.println("Enter the number of employee in the company");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			Employee[] employee = new Employee[size];
			for(int i =0;i<size;i++){
				employee[i] = new Employee();
				
				
				System.out.println("Enter the information of employee "+(i+1));
				System.out.println("Enter the first name");
				employee[i].first_name = sc.next();
				System.out.println("Enter the last name");
				employee[i].last_name = sc.next();
				System.out.println("Enter the base salary");
				employee[i].base_salary= sc.nextInt();
				System.out.println("Enter the bonus ");
				employee[i].bonus= sc.nextInt();
				
			}
			System.out.println("-----------");
			System.out.println("");
			System.out.println("Thank you");
			System.out.println("");
			System.out.println("-----------");
		}
	
	
		
	}
