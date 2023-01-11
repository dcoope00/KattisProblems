import java.util.ArrayList;
import java.util.Scanner;

public class QuickBrownFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		ArrayList<String> alphabet = new ArrayList<>();
		for(char i = 'a';i <= 'z';i++) {
			alphabet.add(i+"");
		}
		ArrayList<String> missing = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();
		for(int i = 0;i < n;i++) {
			String str = scan.nextLine();
			String temp = "";
			str = str.toLowerCase();
			 missing = new ArrayList<>();
			
			for(int j = 0;j < alphabet.size();j++) {
				if(!str.contains(alphabet.get(j))){
					missing.add(alphabet.get(j));
				}
				
				
			}
			if(missing.size() == 0) {
				res.add("pangram");
			}
			else {
				
				for(int j = 0;j < missing.size();j++) {
					temp+=missing.get(j);
				}
				res.add("missing " + temp);
			}
			
		}
		for(int i = 0;i < res.size();i++) {
			System.out.println(res.get(i));
		}
		
	}

}
