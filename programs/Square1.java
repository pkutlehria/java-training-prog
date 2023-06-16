import java.util.Scanner;
class Shape{
	
}
class Rectangle extends Shape{
	Rectangle(int a,int b){
		int length = a;
		int breadth= b;
		System.out.println("The area of the recatangle is::"+(length*breadth));
	}
	
}

class Square1 extends Rectangle{
	Square1(int a){
		super(2,3);
		int side=a;
		System.out.println("The area of the square is::"+a*a);
	}
	
	public static void main(String args[]){
		Square1 obj = new Square1 (2);
	
	}
}
