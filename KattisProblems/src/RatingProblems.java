import java.util.Scanner;

public class RatingProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();//# of judges
		 int k = scan.nextInt();//# of judges who have rated already
		 int[] array = new int[k];
		
		 int diff = n-k;
		 double minAvg = 0;
		 double maxAvg = 0;
		 int minSum = 0;
		 int maxSum = 0;
		 int count = 0;
	
		 /*min		max
		  * 1		1
		  * 2		2
		  * -3		3
		  * -3		3
		  * -3		3
		  * -1.2	2.4
		  */
		 
		 for(int i = 0;i < k; i++) {
			 array[i] = scan.nextInt(); // ratings of the k judges who have rated already
		
		 }
		 
		 
		for(int i = 0; i < 2; i++) {
			count = 0;
			for(int j = 0; j < n; j++) {
				if(i == 0 && count < array.length) {
					minSum += array[count];
				}
				if(i == 1 && count < array.length) {
					maxSum += array[count];
				}
				count++;
				
				
				
			}
		}
		
		
		while(diff-- > 0) {
			minSum += -3;
			maxSum += 3;
		}
		
		minAvg = (double)minSum/n;
		maxAvg = (double)maxSum/n;
		
		System.out.println(minAvg);
		System.out.println(maxAvg);
						
			 
	}

}
