import java.util.Scanner;
public class program1{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int a;
		float b;
		double c;
		char d;
		System.out.println("Enter Integer value::");
		a=scan.nextInt();
		System.out.println("You entered the value::"+a);
		
		System.out.println("Enter Float value::");
		b=scan.nextFloat();
		System.out.println("You entered the value::"+b);
		
		System.out.println("Enter double value::");
		c=scan.nextDouble();
		System.out.println("You entered the value::"+c);
		
		
		System.out.println("Enter character value::");
		d=scan.next().charAt(0);
		System.out.println("You entered the value::"+d);
		
		}}
		