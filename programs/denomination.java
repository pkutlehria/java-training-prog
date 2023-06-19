//A person landed in a country where he has no idea of the currency notes. 
//He asked the locals about the notes available in the country and he had to pay in a shop. 
//Given an amount, find the minimum number of notes of different denominations that sum up to the 
//given amount.Starting from the highest denomination note, 
//try to accommodate as many notes as possible for a given amount.

import java.util.Scanner;
public class denomination{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of currency denominations");
	int size = s.nextInt();
	int arr[] = new int[size];
	for(int i = 0 ; i < size ; i++){
		System.out.println("Enter the currency denomination");
		arr[i]=s.nextInt();
		
	}
	System.out.println("Enter the amount you want to pay ");
	int amt = s.nextInt();
	System.out.println("Your payment approach in order to give min no of notes will be");
	
	for(int i = 0; i<size ; i++){
				for(int j =i+1;j < size; j++){
					if (arr[i]<arr[j]){
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
				}
			}
	while(amt>0){
	for(int i =0 ; i< size ; i++){
		
		int n = amt/arr[i];
		amt = amt - (n*arr[i]);
		System.out.println(arr[i]+":"+n);
		}
	}
	}
	
}
