import java.util.Scanner;
public class Program10{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be reversed::");
		int num = s.nextInt();
		int temp = num;
		int rem;
		int sum = 0;
		float avg = 0;
		System.out.println("Enter the number of digits in the number::");
		int digits = s.nextInt();
		while (num>0){
			rem = num%10;
			sum = rem + sum*10;
			num = num/10;
			avg = (rem + avg);
			}
			avg = avg/digits;
		
		System.out.println("The reversed number is :: "+sum);
		System.out.println("The average of digits of reversed number is :: "+avg);
		
	}
}