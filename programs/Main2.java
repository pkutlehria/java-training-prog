import java.util.Scanner;
abstract class Parent{
	public abstract void message();
	
}

class subclass1 extends Parent{
	public void message(){
		System.out.println("This is first subclass");
	}
}

class subclass2 extends Parent{
	public void message(){
		System.out.println("This is second subclass");
	}
}

public class Main2{
	public static void main(String args[]){
		subclass1 obj = new subclass1();
		subclass2 obj2 = new subclass2();
		obj.message();
		obj2.message();
	}
	
	
}