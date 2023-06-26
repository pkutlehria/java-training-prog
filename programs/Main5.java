
class SingletonPattern{
	private static SingletonPattern singletonpattern = null;
	
	private SingletonPattern(){
}

public static SingletonPattern getInstance(){
	if (singletonpattern == null){
		singletonpattern = new SingletonPattern();
	}
	
	return singletonpattern;
}

}
public class Main5{
	 public static void main(String args[]){
		SingletonPattern singletonpattern = SingletonPattern.getInstance();
		SingletonPattern singletonpattern2 = SingletonPattern.getInstance();
		
		System.out.println("First object "+singletonpattern.hashCode());
		System.out.println("Second object "+singletonpattern2.hashCode());
		
}
 }
