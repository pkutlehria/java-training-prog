import java.util.Scanner;
public class program3{
	public static void main(String args[]){
		float a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number-->");
		a=s.nextFloat();
		
		System.out.println("Enter Second Number-->");
		b=s.nextFloat();
		
		System.out.println("Enter Third Number-->");
		c=s.nextFloat();
		
		double sum_1=a+b+c;
		int sum_2=(int)(a+b+c);
		
		System.out.println("Storing sum in Int variable will give::"+sum_2);
		System.out.println("Storing sum in float variable will give::"+sum_1);
		
	}
}