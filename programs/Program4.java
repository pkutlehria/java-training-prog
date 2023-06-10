import java.util.Scanner;
public class Program4{
		public int Smallest_Number(int num1,int num2,int num3){
			int min;
			if (num1 <= num2 && num1 <= num3){
				min = num1;
			}
 
			else if (num2 <= num1 && num2 <= num3){
				min = num2;
			}
 
			else{
				min = num3;
			}
			return min;
			}
			
		
		
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			System.out.println("Input first number::");
			int a = s.nextInt();
			
			System.out.println("Input second number::");
			int b = s.nextInt();
			
			System.out.println("Input third number::");
			int c = s.nextInt();
			
			
			Program4 obj = new Program4();
			System.out.println("The smallest value is "+(obj.Smallest_Number(a,b,c)));
		}
	}
