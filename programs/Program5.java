import java.util.Scanner;
public class Program5{
	public int getTotal(int a , int b){
		return (a+b);
	}
	
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		
		Program5 obj = new Program5();
		
		System.out.println("Enter first number");
		int num1 = s.nextInt();
		
		System.out.println("Enter second number");
		int num2 = s.nextInt();
		
		int sum = obj.getTotal(num1,num2);
		
		System.out.println("The sum of given numbers is::"+sum);
		}
}