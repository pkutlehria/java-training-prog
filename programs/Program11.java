//Write a function to calculate the power of a functions

import java.util.Scanner;
public class Program11{
	
	public int power_function(int base , int exponent){
			int value=1;
			for (int i = 0;i<exponent;i++){
				value = value*base;
			}
			return value;
		}
		
		
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter base number ");
		int b = s.nextInt();
		System.out.println("Enter exponent number ");
		int e = s.nextInt();
		Program11 object = new Program11();
		int res = object.power_function(b,e);
		System.out.println("Result is "+res);
	}
}