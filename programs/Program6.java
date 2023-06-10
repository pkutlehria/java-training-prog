import java.util.Scanner;
public class Program6{
	public void palindrome_checker(int a){
		int rem=0;
		int temp = a;
		while(a>0){
		rem = rem*10 + a%10 ;
		a = a/10 ;
		}
		
		if(rem==temp){
			System.out.println("The number you entered is a palindrome!!");
		}
		
		else System.out.println("The number you entered is not a palindrome!!");
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		Program6 obj = new Program6();
		obj.palindrome_checker(num);
	}
}