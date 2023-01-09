import java.util.ArrayList;
import java.util.Scanner;

public class FiftyShadesOfPink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] array = new String[n];
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0;i < n;i++) {
			String str = scan.next();
			String lower = str.toLowerCase();
			array[i] = lower;
		}
		
		for(int i = 0;i < array.length;i++) {
			if(array[i].contains("pink") || array[i].contains("rose")) {
				list.add(array[i]);
			}
		}
		
		if(!list.isEmpty()) {
			System.out.println(list.size());
		}
		else {
			System.out.println("I must watch Star Wars with my daughter");
		}
	}

}
