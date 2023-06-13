import java.util.Scanner;
public class Program13{
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the rows of first array::");
		int rows1 = s.nextInt();
		System.out.println("Enter the columns of first array::");
		int cols1 = s.nextInt();
		int arr1[][]=new int[rows1][cols1];
		System.out.println("Enter the elements of first array::");
		for (int i = 0;i<rows1;i++){
			for(int j = 0; j<cols1 ; j++){
				System.out.print("array["+i+"]["+j+"]=");
				arr1[i][j]=s.nextInt();
			
			}
		}
		System.out.println("Enter the rows of second array::");
		int rows2 = s.nextInt();
		System.out.println("Enter the columns of second array::");
		int cols2 = s.nextInt();
		int arr2[][]=new int[rows2][cols2];
		System.out.println("Enter the elements of second array::");
		for (int i = 0;i<rows2;i++){
			for(int j = 0; j<cols2 ; j++){
				System.out.print("array["+i+"]["+j+"]=");
				arr2[i][j]=s.nextInt();
			
			}
			
		
		}
		int sum[][]=new int[rows1][cols1];
		if (rows1==rows2 && cols1==cols2){
				System.out.println("Addition of two arrays will give::");
		
				for(int i = 0 ; i<rows1 ; i++){
					for(int j = 0  ;j<cols1;j++){
					sum[i][j]= arr1[i][j] + arr2[i][j];
				}
			}
			System.out.println("The sum is::");
			for(int i = 0 ; i<rows1 ; i++){
					for(int j = 0;j<cols1;j++){
					System.out.println(sum[i][j]);
				}
			}
		}
		
		else {System.out.println("Additon is not possible!!");}
		
	}
}
