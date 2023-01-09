import java.util.ArrayList;
import java.util.Scanner;

public class ReverseRot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] array = {"A","B","C","D","E","F","G","H","I","J","K","L",
//						"M","N","O","P","Q","R","S","T","U","V","W","X","Y",
//						"Z","_","."};
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		Scanner scan = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		
		int a = -1;
		while(a != 0) {
			String temp = scan.nextLine();
			String[] line = temp.split(" ");
			a = Integer.parseInt(line[0]);
			if(a == 0) {
				break;
			}
			nums.add(a);
			words.add(line[1]);
			
		}
		
		
		for(int j = 0;j < words.size();j++){
			String str = words.get(j);
			int num = nums.get(j);
			String rev = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				rev += str.charAt(i);

			}		
			
			String res = "";
			for (int i = 0; i < rev.length(); i++) {
				char temp = rev.charAt(i);
				int index = alphabet.indexOf(temp);
				int count = 0;
				while (count < num) {
					if (index + 1 >= alphabet.length()) {
						index = 0;
						count++;
					} else {
						index++;
						count++;
					}
				}
				res += alphabet.charAt(index);

			}
			System.out.println(res);
		}
	
	

	}

}
