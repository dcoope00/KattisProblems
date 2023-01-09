import java.util.ArrayList;
import java.util.Scanner;

public class Volim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] = {8,7,6,5,4,3,2,1}
		Scanner scan = new Scanner(System.in);
		int player = Integer.parseInt(scan.nextLine());
		int questions = Integer.parseInt(scan.nextLine());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 8;i > 0;i--) {
			list.add(i);
		}
		int tempSeconds = 0;
		int result = 0;
		for(int i = 0;i <  questions;i++) {
			String time = scan.nextLine();
			String[] temp = time.split(" ");
			int seconds = Integer.parseInt(temp[0]);
			String answer = temp[1];
			
			if(tempSeconds + seconds >= 210) {
				result = player;
				break;
			}
			else {
				if(answer.equals("T")) {
					
					player++;
					tempSeconds += seconds;
				}
				else {
					tempSeconds += seconds;
				}
				
				if(player > 8) {
					player = 1;
				}
			}
			
			
			
			
		}
		System.out.println(result);
		
		
		
	}

}
