import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		System.out.println(gcd(n,m));
		
		
	}
	
	public static int gcd(int n, int m) {
		if(n == 0) {
			return m;
		}
		else if(m == 0) {
			return n;
		}
		else {
			if(n > m) {
				return gcd(m, n%m);
				
			}
			else {
				return gcd(n,m%n);
			}
			
			
		}
		
		
	}

}
