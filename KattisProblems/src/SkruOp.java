import java.util.Scanner;

public class SkruOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int req = Integer.parseInt(scan.nextLine());
		int start = 7;
		for(int i = 0;i < req;i++) {
			String command = scan.nextLine();
			if(command.equals("Skru op!") && start < 10) {
				start++;
			}
			else if(command.equals("Skru ned!")){
				if(start > 0) {
				start--;
				}
			}
			
			
		}
		System.out.println(start);
	}

}
