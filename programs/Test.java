import java.util.Scanner;
public class Test{
	public static void main(String[] args){
				int[] arr ;
				System.out.println("Enter the number of elements::");
				Scanner s = new Scanner(System.in);
				int size = s.nextInt();
				arr = new int[size];
				
				for(int i = 0; i < size ; i++){
					System.out.println("Enter value at position "+(i+1));
					arr[i] = s.nextInt();
				}
				
				System.out.println("Displaying values::");
				for(int i = 0; i < size ; i++){
					System.out.println("Value at "+(i+1)+" position is "+ arr[i]);
					
				}
	}
}