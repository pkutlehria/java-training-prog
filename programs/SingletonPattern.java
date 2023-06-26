import java.util.Scanner;
public class SingletonPattern{
	private static SingletonPattern singletonpattern = null;
	
	private SingletonPattern(){
}

public static SingletonPattern getInstance(){
	if (singletonpattern == null){
		singletonpattern = new SingletonPattern();
	}
	
	return singletonpattern;
}
public static void main(String args[]){
	SingletonPattern obj = new SingletonPattern();
	obj.SingletonPattern();
}
}

