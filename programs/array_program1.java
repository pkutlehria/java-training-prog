//Sort the array in ascending and descending Order
import java.util.Scanner;
public class array_program1{
	public static void main(String args[]){
		System.out.println("Enter the size of array");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter the element");
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the order in which you want to sort the array 1 - ascending 2 - descending");
		int get_value = s.nextInt();
		if (get_value == 2){
			System.out.println("Sorted array is");
			
			for(int i = 0; i<size ; i++){
				for(int j =i+1;j < size; j++){
					if (arr[i]<arr[j]){
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
				}
			}
			
			for(int i =0;i<size ; i++){
				System.out.println(arr[i]);
			}
		}
		
		else{
			System.out.println("Sorted array is");
			for(int i = 0; i<size ; i++){
				for(int j =i+1;j < size; j++){
					if (arr[i]>	arr[j]){
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
				}
			}
			
			for(int i =0;i<size ; i++){
				System.out.println(arr[i]);
			}
		}
		}
	}
