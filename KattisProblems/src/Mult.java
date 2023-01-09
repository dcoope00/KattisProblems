import java.util.ArrayList;
import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		ArrayList<Integer> list = new ArrayList<>();
		int first = 0;
		for(int i = 0;i < n;i++) {
			if(i == 0) {
				first = Integer.parseInt(scan.nextLine());
			}
			else {
				int temp = Integer.parseInt(scan.nextLine());
				if(temp%first == 0) {
					list.add(temp);
					temp = Integer.parseInt(scan.nextLine());
					i++;
					first = temp;
				}
			}
		}
		
		
		for(Integer e: list) {
			System.out.println(e);
		}
	}

}
