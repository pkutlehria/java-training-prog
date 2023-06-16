 /*Create a class named 'Shape' with a method to print "This is This is shape".
 Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, 
 both having a method to print "This is rectangular shape" and "This is circular shape" 
 respectively. Create a subclass 'Square' of 'Rectangle' having a method to 
 print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
 object of 'Square' class.*/
 
import java.util.Scanner;
class Shape{
	public void ShapeMethod(){
		System.out.println("This is This is shape.");
	}
}
class Rectangle extends Shape{
	public void RectangleMethod(){
		System.out.println("This is Rectangular shape.");
	}
}
class Circle extends Shape{
	public void CircleMethod(){
		System.out.println("This is Circular shape.");
	}
}
class Square extends Rectangle{
	public void SquareMethod(){
		System.out.println("Square is Rectangle.");
	}
	public static void main(String args[]){
		Square obj = new Square();
		obj.ShapeMethod();
		obj.RectangleMethod();
	}
}
