import java.util.ArrayList;
import java.util.Scanner;

public class FreeFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < n;i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			for(int j = start; j < end+1;j++) {
				if(!list.contains(j)) {
					list.add(j);
				}
			}
			
		}
		System.out.println(list.size());
	}

}
