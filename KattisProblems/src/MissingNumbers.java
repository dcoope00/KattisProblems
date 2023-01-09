import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		
		int[] recited = new int[n];
		ArrayList<Integer> missed = new ArrayList<>();
		
		
		for(int i = 0;i < recited.length;i++) {
			recited[i] = scan.nextInt();
		}
		
		int[] range = new int[recited[recited.length-1]];
		
		for(int i = 0;i < range.length;i++ ) {
			range[i] = i+1;
			
		}
		int count = 0;
		
		for(int i = 0;i < range.length;i++) {
			if(range[i] != recited[count]) {
				missed.add(range[i]);
			}
			if(range[i] == recited[count]) {
				count++;
			}
			
		}
		if(missed.isEmpty()) {
			System.out.println("good job");
		}
		else {
		for(int num : missed) {
			System.out.println(num);
		}
		}
		
		
	}

}
