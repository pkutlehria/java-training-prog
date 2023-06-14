//function overloading
public class Program15{
	final float  pi = 3.14f;
	public void area(int side){
		System.out.println("The area of the square with side "+side+" is "+(side*side));
	}
	
	public void area(int l, int b){
		System.out.println("The area of the rectangle with length "+l+" and width "+b+" is "+(l*b));
	}
	
	public void area(float r){
		System.out.println("The area of the circle with radius "+r+" is "+(pi*r*r));
	}
	
	
	public static void  main(String args[]){
		Program15 obj = new Program15();
		obj.area(5);
		obj.area(3,4);
		obj.area(5.6f );
	}
	
}