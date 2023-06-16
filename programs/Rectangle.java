 /*Create a class named Rectangle with two data members- length and breadth and a
function to calculate the area which is length*breadth. The class has three
constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and
breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that
number.
Now, create objects of the Rectangle class having none, one and two parameters
and print their areas.*/

import java.util.Scanner;
public class Rectangle{
	int length;
	int breadth;
	public void area(int a,int b){
		length=a;
		breadth=b;
		System.out.println("The area of rectangle is::"+length*breadth);
		
	}
	
	Rectangle(){
		length=0;
		breadth=0;
		area(length,breadth);
	}
	
	Rectangle(int x,int y){
		length=x;
		breadth=y;
		area(length,breadth);
	}
	
	Rectangle(int x ){
		length=x;
		breadth=x;
		area(length,breadth);
	}
	
	public static void main(String args[]){
		Rectangle obj=new Rectangle();
		
		Rectangle obj1=new Rectangle(1);
		
		Rectangle obj2=new Rectangle(2,3);
		
		
	}
}