import java.util.Scanner;
public class Pattern2{
	public static void main(String []args){
		for(int i=4;i>0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int k=0;k<5;k++){
			for(int l=0;l<=k;l++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}