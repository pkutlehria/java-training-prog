import java.util.Scanner;
public class Program14{
	int a =0;
	static int b = 0;
	public void increment(){
		a++;
		b++;
		System.out.println("a="+a+",b="+b);
	}
	public static void main(String args[]){
		Program14 obj = new Program14();
		obj.increment();               //a=1,b=2
		
		Program14 obj2 = new Program14();
		obj2.increment();             //a=1,b=2
	}
}