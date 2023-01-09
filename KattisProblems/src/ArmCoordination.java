import java.util.Scanner;

public class ArmCoordination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		
		int x1 = x-r;
		int y1 = y+r;
		System.out.println(x1 + " " + y1);
		
		int x2 = x+r;
		int y2 = y+r;
		System.out.println(x2 + " " + y2);
		
		int x3 = x-r;
		int y3 = y-r;
		int x4 = x+r;
		int y4 = y-r;
		System.out.println(x4 + " " + y4);

		System.out.println(x3 + " " + y3);
		
		
	}

}
