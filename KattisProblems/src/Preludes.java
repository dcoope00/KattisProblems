import java.util.ArrayList;
import java.util.Scanner;

public class Preludes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> original = new ArrayList<>();
		ArrayList<String> alternate = new ArrayList<>();
		
		original.add("A#");
		original.add("C#");
		original.add("D#");
		original.add("F#");
		original.add("G#");
		alternate.add("Bb");
		alternate.add("Db");
		alternate.add("Eb");
		alternate.add("Gb");
		alternate.add("Ab");
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		int count = 1;
		while(scan.hasNext()) {
			String res = "";
			
				str = scan.nextLine();
				
			
			
			String[] line = str.split(" ");
			if(original.contains(line[0])) {
				int index = original.indexOf(line[0]);
				res+=alternate.get(index);
				res+= " " + line[1];
			}
			else if(alternate.contains(line[0])) {
				int index = alternate.indexOf(line[0]);
				res+=original.get(index);
				res+= " " + line[1];
			}
			else {
				res = "UNIQUE";
			}
			System.out.println("Case " + count + ": " + res);
			count++;
		}
		
	}

}
