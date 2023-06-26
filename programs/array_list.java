import java.util.*;
public class array_list{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<>();
		String name;
		for(int i = 0; i < 3 ; i++){
			System.out.println("Enter your name::");
			name = sc.nextLine();
			arrayList.add(name);
		}
		for(int i = 0; i < 3 ; i++){
			System.out.println("You entered::");
			String get_value=arrayList.get(i);
			System.out.println(get_value);
		}
	}
}