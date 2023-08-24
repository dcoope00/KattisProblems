import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompoundWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<>();
		ArrayList<String> results = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] toAdd = line.split(" ");
			for(int i = 0;i < toAdd.length;i++) {
				words.add(toAdd[i]);
			}
			
		}
		
		
		for(int i = 0;i < words.size();i++) {
			for(int j = 0;j < words.size();j++) {
				
				if(!results.contains(words.get(i) + words.get(j)) && i != j) {
					results.add(words.get(i) + words.get(j));
				}
			}
		}
		Collections.sort(results);
		for(int i = 0;i < results.size();i++) {
			System.out.println(results.get(i));
		}
	}

}
