import java.util.Scanner;

public class SquarePeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] nums = str.split(" ");
		int length = Integer.parseInt(nums[0]);
		int radius = Integer.parseInt(nums[1]);
		double diagonal = Math.sqrt(2)*length;
		int diameter = radius*2;
		if(diagonal > diameter) {
			System.out.println("nope");
		}else {
			System.out.println("fits");
		}
		
		
		
		
	}

}
