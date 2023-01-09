import java.util.Scanner;

public class Soylent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0;i < n;i++) {
			double calories = scan.nextInt();
			int res = (int)Math.ceil(calories/400);
			System.out.println(res);
			
		}
	}

}
