import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LicenseToLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int min = 0;
		int[] array = new int[n];
			
		
		for(int i = 0;i < array.length;i++) {
			array[i] = scan.nextInt();
			
		}
		int[] unsorted = new int[n];
		System.arraycopy(array, 0, unsorted, min, n);
	
		Arrays.sort(array);
		min = array[0];

		
		
		for(int i = 0;i < array.length;i++) {
			if(unsorted[i] == min) {
				System.out.println(i);
				break;
			}
		}
	}

}
