import java.util.Scanner;

public class CoffeeCupCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		
		int coffee = 0;
		int res = 0;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == '1') {
				coffee = 2;
				res++;
			}
			else if(coffee > 0) {
				res++;
				coffee--;
			}
		}
		System.out.println(res);
		
		
		
	}

}
