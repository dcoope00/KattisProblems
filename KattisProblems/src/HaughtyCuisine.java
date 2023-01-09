import java.util.ArrayList;
import java.util.Scanner;

public class HaughtyCuisine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0;i < n;i++) {
			String line = scan.nextLine();
			String[] array = line.split(" ");
			nums.add(Integer.parseInt(array[0]));
			for(int j = 1;j < array.length;j++) {
				list.add(array[j]);
			}
		}
		
		int num = nums.get(0);
		System.out.println(num);
		for(int i = 0;i < num;i++) {
			System.out.println(list.get(i));
			
			
		}
		
	}

}
