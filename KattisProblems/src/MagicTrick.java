import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		boolean b = false;
		int answer = 0;
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(!list.contains(str.charAt(i) + "")) {
				list.add(str.charAt(i) + "");
				b = false;
				}
			else if(list.contains(str.charAt(i) + "")) {
				b = true;
				break;
			}
			
		}
		if(b == true)
			answer = 0;
		
		else
			answer = 1;
		
		System.out.println(answer);
		
	}

}
