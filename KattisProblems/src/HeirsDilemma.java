import java.util.Scanner;

public class HeirsDilemma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt() ;
		int h = scan.nextInt();

		boolean isGood = true;
		int comboCount = 0;
		for (int i = l; i <= h; i++) {
			int[] buckets = new int[10];
			int temp = i;
			isGood = true;
			while (temp > 0) {
				int lastDigit = temp % 10;
				if (lastDigit == 0) { //cant divide by 0
					isGood = false;
					break;
				}
				if (i % lastDigit != 0) { //check that is divisble
					isGood = false;
					break;
				}
				buckets[lastDigit]++;
				if(buckets[lastDigit] > 1) {
					isGood = false;
					break;				//check for unique digits 
				}
				

				temp /= 10;
			}
			if (isGood) {
				
				comboCount++;
			}
		}

		System.out.println(comboCount);
	}

}
