import java.util.Scanner;

public class Employee extends Person{
Scanner s = new Scanner(System.in);
	public void getEmployeeId(){
		System.out.println("Enter your emplyee-id::");
		int employeeID = s.nextInt();
		
	}
	
	
	
	public static void main(String[] args){
		Employee obj = new Employee();
		obj.getFirstName();
		obj.getLastName();
		obj.getEmployeeId();
		
	}
}