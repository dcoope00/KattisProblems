import java.util.ArrayList;
import java.util.Scanner;

public class TowerConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> sizes = new ArrayList<>();
		int num = scan.nextInt();
		int numTowers = 1;
		for(int i = 0;i < num;i++) {
			int size = scan.nextInt();
			sizes.add(size);
			
		}
		
		for(int i = 0;i < sizes.size()-1;i++) {
			
			
			int temp = sizes.get(i+1);
			if(temp > sizes.get(i)) {
				numTowers++;
			}
			
		}
		
		
		System.out.println(numTowers);
	}

}
