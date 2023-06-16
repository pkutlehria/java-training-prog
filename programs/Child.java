//Create a class with a method that prints "This is parent class" and its subclass with 
//another method that prints "This is child class". Now, create an object for each of the 
//class and call1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

import java.util.Scanner;
class Parent{
	public void parentMethod(){
		System.out.println("This is parent class.");
	}
}


class Child extends Parent{
	public void childMethod(){
		System.out.println("This is child class");
	}
	public static void main(String []args){
		Parent p = new Parent();
		Child c = new Child();
		p.parentMethod();
		c.childMethod();
		c.parentMethod();
	}
}