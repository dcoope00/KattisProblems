import java.util.ArrayList;
import java.util.Scanner;

public class BoatParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt(); //# of parts boat consists of
		int n = scan.nextInt(); //# of days in boating season
		int count = 0;
		int dayCount = 0;
		ArrayList<String> list = new ArrayList<>();
		String[] array = new String[n];
		for(int i = 0;i < n; i++) {
			array[i] = scan.next();
		}
		for(int i = 0; i < n; i++) {
		
			if(!list.contains(array[i])) {
				list.add(array[i]);
				count++;
			}
			
			if(list.size() == p) {
				dayCount = i+1;
				break;
			}
			
		}
		if(count >= p) {
			System.out.println(dayCount);
			
		}
		else {
			System.out.println("paradox avoided");
		}
			
	}

}
