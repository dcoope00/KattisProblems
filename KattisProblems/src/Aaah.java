import java.util.Scanner;

public class Aaah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String str2 = scan.next();
		System.out.println(scream(str,str2));
		
	}
	
	public static String scream(String jon, String required) {
		if(required.length() > jon.length())
			return "no";
		else {
			return "go";
		}
	}

}
