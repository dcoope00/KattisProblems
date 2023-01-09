import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class MixedFractions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();

		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int count = 0;
			String str = br.readLine();
			
			
			
			String[] nums = str.split(" ");
			int numer = Integer.parseInt(nums[0]);
			int denom = Integer.parseInt(nums[1]);
			if (numer == 0 && denom == 0) {
				break;
			}
			while (true) {
				if (numer >= denom) {
					
					
					numer -= denom;
					count++;
					
				} else {
					System.out.println(count + " " + numer + " / " + denom);
					break;
				}

			}

		}
		

	}

}
