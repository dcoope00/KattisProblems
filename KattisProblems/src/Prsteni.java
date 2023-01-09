import java.util.ArrayList;
import java.util.Scanner;

public class Prsteni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n= Integer.parseInt(scan.nextLine());
		ArrayList<Integer> list = new ArrayList<>();
		String str = scan.nextLine();
		String[] strArray = str.split(" ");
		for(int i = 0;i < n;i++) {
			list.add(Integer.parseInt(strArray[i]));
		}
		int num = list.get(0);
		for(int i = 1;i < n;i++) {
			int temp = list.get(i);
			for(int j = num;j >=1;j--) {
				if(num%j == 0 && temp%j == 0) {
					int newTop = num/j;
					int newBottom = temp/j;
					System.out.println(newTop + "/" + newBottom);
					break;
				}
				
				
			}
			
		
		}
		
		
		
		
	}

}
