import java.util.Scanner;
abstract class Marks{
	abstract int  getPercentage();
}

class A extends Marks{
	int marks1,marks2,marks3;
	A(int num1, int num2, int num3){
		marks1=num1;
		marks2=num2;
		marks3=num3;
		
	}
	public int getPercentage(){
		int per = (marks1+marks2+marks3)/3;
		return per;	
	}
}

class B extends Marks{
	int marks1,marks2,marks3,marks4;
	B(int num1, int num2, int num3, int num4){
		marks1=num1;
		marks2=num2;
		marks3=num3;
		marks4=num4;	
	}
	public int getPercentage(){
		int per = (marks1+marks2+marks3+marks4)/4;
		return per;	
	}
}

public class Main3{
	public static void main(String args[]){
		B b = new B(12,13,14,15);
		System.out.println("The percentage of B is :: "+(b.getPercentage()));
		
		
		A a = new A(12,13,44);
		System.out.println("The percentage of A is :: "+a.getPercentage());
		
		
		
		
	}
}