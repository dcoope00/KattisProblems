import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int tempSum = 0;
		int totalSum = 0;
		int n = scan.nextInt();
		
		ArrayList<String> answers= new ArrayList<>();
		Map<Integer, Integer> speedTime = new HashMap<>();
		while (n != -1) {
			int[] speeds = new int[n];
			int[] times = new int[n];
			for (int i = 0; i < n; i++) {
				int speed = scan.nextInt();
				int time = scan.nextInt();
				speeds[i] = speed;
				times[i] = time;
				
				speedTime.put(speed, time);
				if(i == 0) {
					tempSum = speed*time;
					totalSum = totalSum+tempSum;
					
				}
				else {
					int diff = times[i]-times[i-1];
					tempSum = diff*speeds[i];
					totalSum = totalSum+tempSum;
				}
					
			}
			answers.add(totalSum + " " + "miles");
			totalSum = 0;
			tempSum = 0;
			n = scan.nextInt();
		}
		for(String speed: answers)
			System.out.println(speed);
	}

}
