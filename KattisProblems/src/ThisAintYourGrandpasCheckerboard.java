import java.util.Scanner;

public class ThisAintYourGrandpasCheckerboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[][] array = new String[n][n];
		for(int i = 0;i < n;i++) {
			String str = scan.nextLine();
			for(int j = 0;j < str.length();j++) {
				array[i][j] = str.charAt(j) + "";
				
			}
			
			
		}
		int black = 0;
		int white = 0;
		int bCount = 0;
		int wCount = 0;
		boolean equalRowColors = true;
		for(int i = 0;i < array.length;i++) {
			wCount = 0;
			bCount = 0;
			for(int j = 0;j < array[0].length;j++) {
				if(array[i][j].equals("W")) {
					white++;
					wCount++;
					bCount = 0;
				}
				else {
					black++;
					bCount++;
					wCount = 0;
				}
				
				if(bCount == 3 || wCount == 3 ) {

					System.out.println("0");
					System.exit(0);
				}
			}
			if(white != black) {
				equalRowColors = false;
				break;
			}
			
			
		}
		if(equalRowColors == false) {
			System.out.println("0");
			System.exit(0);
			
		}
		
		//2nd condition
		white = 0;
		black = 0;
		bCount = 0;
		wCount = 0;
		boolean equalColColors = true;
		for(int i = 0;i < array[0].length;i++) {
			wCount = 0;
			bCount = 0;
			for(int j = 0;j < array.length;j++) {
				if(array[j][i].equals("W")) {
					white++;
					wCount++;
					bCount = 0;
				}
				else {
					black++;
					bCount++;
					wCount = 0;
				}
				
				if(bCount == 3 || wCount == 3 ) {

					System.out.println("0");
					System.exit(0);
				}
			}
			if(white != black) {
				equalColColors = false;
				break;
			}
			
			
		}
		if(equalColColors == false) {

			System.out.println("0");
			System.exit(0);
			
		}
		
		System.out.println("1");
		
	}

}
