import java.util.Scanner;
public class Program7{
	public boolean consec_num(int a , int b){
		if(a>b){
			if(a==(b+1)){
				return true;
			}
			else {return false;}
		}
		
		else {
			if(b==(a+1)){
				return true;
			}
			else {return false;}
			}
		}
	
	public static void main(String args[]){
		int num1,num2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number::");
		num1=s.nextInt();
		System.out.println("Enter second number::");
		num2=s.nextInt();
		
		Program7 obj = new Program7();
		System.out.println(obj.consec_num(num1,num2));
	}
}