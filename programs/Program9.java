import java.util.Scanner;
public class Program9{
	public static void main(String args[]){
		System.out.println("How many numbers you want to enter?");
		Scanner s = new Scanner(System.in);
		int sum_even = 0,sum_odd = 0;
		int n = s.nextInt();
		int arr[] = new int[n+1];
		arr[0]=0;
		for (int i = 1 ; i <= n ; i++){
			System.out.println("Enter number at "+i+" position");
			arr[i] = s.nextInt();
			if(arr[i]%2 == 0){
				sum_even=sum_even + arr[i];
			}
			
			else {
				sum_odd = sum_odd + arr[i];
			}
		}
		
		System.out.println("The sum of even numbers is ::"+sum_even);
		System.out.println("The sum of odd numbers is ::"+sum_odd);
		
	}
}