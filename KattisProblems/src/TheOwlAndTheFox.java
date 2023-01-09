import java.util.Scanner;

public class TheOwlAndTheFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fail due to time constraint
		Scanner scan= new Scanner(System.in);
		int numCases = scan.nextInt();
		for(int i = 0;i < numCases;i++) {
			int num = scan.nextInt();
			int holder = num;
			int sumDigits = 0;
			while(num > 0) {
				int rem = num%10;
				sumDigits += rem;
				num/=10;
			}
			for(int j = holder; j >=0;j--) {
				int temp = j;
				int tempSumDigits = 0;
				while(temp > 0) {
					int tempRem = temp%10;
					tempSumDigits+=tempRem;
					temp/=10;
				}
				
				if(tempSumDigits == sumDigits-1) {
					System.out.println(j);
					break;
					
				}
				
				
			}
			
			
		}
		
		
		
	}

}
