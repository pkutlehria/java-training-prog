import java.util.Scanner;
public class program2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any float value::");
		float num=s.nextFloat();
		int Int_part=(int)(num);
		System.out.println("The integer part of "+num+"is"+Int_part);
		float Dec_part=num-Int_part;
		System.out.println("The decimal part of "+num+"is"+Dec_part);
		
	}}