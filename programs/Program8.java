//Write a program to calculate the sum of first 10 natural number.

import java.util.Scanner;
public class Program8{
	public static void main(String []args){
		int sum = 0;
		for (int i = 1; i <= 10; i++){
			sum = sum + i;
		}
	
		System.out.println("Sum of first 10 natural numbers is ::"+sum);
	}
}