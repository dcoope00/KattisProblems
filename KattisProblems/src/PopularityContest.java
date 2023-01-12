import java.util.ArrayList;
import java.util.Scanner;

public class PopularityContest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int numFriends = scan.nextInt();
		int numFriendships = scan.nextInt();
		scan.nextLine();
		int[] c = new int[numFriends+1];
		
		for(int i = 0;i < numFriendships;i++) {
			String str = scan.nextLine();
			String[] line = str.split(" ");
			int num1 = Integer.parseInt(line[0]);
			int num2 = Integer.parseInt(line[1]);
			c[num1]++;
			c[num2]++;
			
			
					
		}
		for(int i = 1;i < c.length;i++) {
			int pf = c[i];
			int mc = pf-i;
			System.out.print(mc + " " );
			
		}
		
		
		
		
	}

}
