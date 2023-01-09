import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FlyingSafely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();
		ArrayList<int[]> list = new ArrayList<>();
		int[] array = new int[2];
		for (int i = 0; i < cases; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			list = new ArrayList<>();
			for (int j = 0; j < m; j++) {
				
				
				list.add(new int[] {scan.nextInt(), scan.nextInt()});

			
			}
			
//			for(int w = 0;w < list.size();w++) {
//				
//				for(int k = 0;k < list.get(w).length;k++) {
//					System.out.print(list.get(w)[k] + ", ");
//				}
//				System.out.println();
//			}
			System.out.println(n-1);

		}
		
		
	}

}
