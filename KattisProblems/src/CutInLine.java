import java.util.ArrayList;
import java.util.Scanner;

public class CutInLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		ArrayList<String> names = new ArrayList<>();
		for(int i = 0;i < n;i++) {
			String name = scan.nextLine();
			names.add(name);
		}
		
		
		int c = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0;i < c;i++) {
			String temp = scan.nextLine();
			String[] line = temp.split(" ");
			if(line[0].equals("cut")) {
				String name1 = line[1];
				String name2 = line[2];
				int index = names.indexOf(name2);
				names.add(index, name1);
				
			}
			else if(line[0].equals("leave")) {
				String removed = line[1];
				names.remove(removed);
			}
		}
		for(int i = 0;i < names.size();i++) {
			
			System.out.println(names.get(i));
		}
		
	}

}
