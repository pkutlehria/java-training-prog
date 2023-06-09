import java.util.Scanner;
public class Program4{
	public static void main(String []args){
		public int SmallestNumber(int num1,int num2,int num3){
			if(num1>num2){
				if(num1>num3){
					return num1;
				}
			}
			else if (num2>num3){
					return num2;
				}
			else 
				return num3;
			}
			
		}
		
		/*public static void main(String args[]){
			Scanner s = new Scanner(System.in)
			System.out.println("Input first number::");
			int a = s.nextInt();
			
			System.out.println("Input second number::");
			int b = s.nextInt();
			
			System.out.println("Input third number::");
			int c = s.nextInt();
			
			
			Program4 obj = new Program4();
			System.out.println("The smallest value is"+(obj.Smallest_Number(a,b,c)));
		}
	}
*/