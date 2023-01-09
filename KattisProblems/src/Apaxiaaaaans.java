import java.util.Scanner;

public class Apaxiaaaaans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String newStr = "";
		int count = 0;
	
		
		for(int i = 0;i < str.length()-1; i++) {
		if(str.charAt(i) != str.charAt(i+1)) {
			System.out.print(str.charAt(i));
		}
		 if(i == str.length()-2 ){
			System.out.print(str.charAt(i+1));
		}
		
		
		}
		
		
	}
}
