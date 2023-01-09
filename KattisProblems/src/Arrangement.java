import java.util.Scanner;

public class Arrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		
		int m = Integer.parseInt(scan.nextLine());
		int finalM = m;
		double temp =Math.round((double)m/n);
		int count = 0;
		for(int i = 0;i < n;i++) {
			
			for(int j = 0;j < temp && m > 0;j++) {
				System.out.print("*");
				m--;
			}
			if(temp*2 > m && count == 0 && m%2 == 0 && temp%m > 0 ) {
				temp--;
				count++;
			}
			
			System.out.println();
			
		}
		
		
	}

}
