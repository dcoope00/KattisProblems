import java.util.Scanner;

public class SMIL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		
		for(int i = 0; i < str.length()-1;i++) {
			if(str.charAt(i) == ':' || str.charAt(i) == ';') {
				if(str.charAt(i+1) == ')' || str.charAt(i+1) == '-' && str.charAt(i+2) == ')') {
					System.out.println(i);
				}
			}
			
		}
		
		
	}

}
