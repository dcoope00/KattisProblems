import java.util.ArrayList;
import java.util.Scanner;

public class CPRNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		char[] nums = str.toCharArray();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < nums.length;i++) {
			if(nums[i] != '-') {
				list.add(Integer.parseInt(nums[i] + ""));
			}
		}
		int[] vals = {4,3,2,7,6,5,4,3,2,1};
		int result = 0;
		for(int i = 0;i < list.size();i++) {
			int tempProd = list.get(i)*vals[i];
			result+=tempProd;
		}
		
		if(result%11 == 0) {
			System.out.println("1");
		}
		else {
			System.out.print("0");
		}
		
	}

}
