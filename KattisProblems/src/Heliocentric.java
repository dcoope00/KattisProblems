import java.util.Scanner;

public class Heliocentric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int caseCount = 1;
		while(scan.hasNextInt()) {
			
			int earth = scan.nextInt();
			int mars = scan.nextInt();
			
			int count = 0;
		
			while (earth != 0 || mars != 0) {
//			if(count == 239075) {
//				System.out.println("earth " + earth + " " + "mars " + mars);
//				break;
//			}

				if (earth == 365) {
					earth = 0;

				}
				if (mars == 687) {
					mars = 0;
				}
				if (earth == 0 && mars == 0) {

					break;
				}

				earth++;
				mars++;
				count++;

			}
			System.out.println("Case " + caseCount++ + ":" + " " + count);
		}
	}

}
