import java.util.ArrayList;
import java.util.Scanner;

public class SecretMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		scan.nextLine();
		ArrayList<String> list = new ArrayList<>();
		
		for (int a = 0; a < cases; a++) {
			String output = "";
			String str = scan.nextLine();
			int n = str.length();
			
			while (Math.floor(Math.sqrt(n)) -Math.sqrt(n) != 0) {
				str += "*";
				n++;
			}
			String[][] array = new String[(int) Math.sqrt(n)][(int) Math.sqrt(n)];
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = str.charAt(count++) + "";

				}
			}
			String[][] newArray = new String[array.length][array[0].length];
			int row = 0;
			int col = array.length - 1;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					newArray[row][col] = array[i][j];
					row++;
					if (row >= array.length) {
						row = 0;
						col--;
					}

				}
				
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					if (!newArray[i][j].equals("*")) {
						output+=newArray[i][j];
					}

				}

			}
			list.add(output);
		}
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
	
	}

}
