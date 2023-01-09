import java.util.ArrayList;
import java.util.Scanner;

public class Karte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pCount = 13;
		int kCount = 13;
		int hCount = 13;
		int tCount = 13;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean bool = false;
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0;i < str.length()-2;i+=3) {
			String temp = str.substring(i,i+3);
			if(list.contains(temp)) {
				System.out.println("GRESKA");
				bool = true;
				break;
			}
			else {
				list.add(temp);
			}
			if(temp.charAt(0) == 'P') {
				pCount--;
			}
			if(temp.charAt(0) == 'K') {
				kCount--;
			}
			if(temp.charAt(0) == 'H') {
				hCount--;
			}if(temp.charAt(0) == 'T') {
				tCount--;
			}
			
		}
		if(bool == false) {
		System.out.println(pCount + " " + kCount + " " + hCount + " " + tCount);
		}
		
	}

}
