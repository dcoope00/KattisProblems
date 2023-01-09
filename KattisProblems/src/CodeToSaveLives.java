import java.util.ArrayList;
import java.util.Scanner;

public class CodeToSaveLives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		
		
		
		for(int i = 0;i < cases;i++) {
			String strNum1 = scan.nextLine();
			String strNum2 = scan.nextLine();
			String noSpacesNum1 = strNum1.replaceAll(" ", "");
			String noSpacesNum2 = strNum2.replaceAll(" ", "");
			int num1 = Integer.parseInt(noSpacesNum1);
			int num2 = Integer.parseInt(noSpacesNum2);
			int sum = num1+num2;
			while(sum >0) {
				int temp = sum%10;
				result.add(temp);
				
				sum/= 10;
			}
			for(int j = result.size()-1;j >= 0;j--) {
				System.out.print(result.get(j) + " ");
				
				
			}
			result.clear();
		}
		
		
		
		
	}

}
