import java.util.Scanner;

public class Tetration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		int count = 0;
		
		
		while(n != 0) {
			for(int i = 0;i < 2*n; i++) {
				if(i < n) {
				array1[i] = scan.nextInt();
				
			}
				
				if(i >= n) {
					array2[count] = scan.nextInt();
					count++;
				}
				
				
		}// end for loop
			for(int i = 0;i < array1.length;i++) {
				System.out.println(array1[i]);
			}
			System.out.println();
			for(int i = 0;i < array2.length;i++) {
				System.out.println(array2[i]);
			}
			n = scan.nextInt();

	}// end while loop
		
		
		
		
		
		for(int i = 0;i < array1.length;i++) {
			System.out.println(array1[i]);
		}
	
	
	}

}
