import java.util.Scanner;
public class Program12{
	public static void main(String[] args){
				int[] arr ;
				System.out.println("Enter the number of elements::");
				Scanner s = new Scanner(System.in);
				int size = s.nextInt();
				arr = new int[size];
				int sum = 0;
				
				for(int i = 0; i < size ; i++){
					System.out.println("Enter value at position "+(i+1));
					arr[i] = s.nextInt();
					sum = sum + arr[i];
					}
				
				System.out.println("Displaying values::");
				for(int i = 0; i < size ; i++){
					System.out.println("Value at "+(i+1)+"  position is "+ arr[i]);
					
				}
				
				System.out.println("The sum the values is ::"+sum);
	}
}