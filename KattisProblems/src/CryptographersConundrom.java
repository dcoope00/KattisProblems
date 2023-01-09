import java.util.Scanner;

public class CryptographersConundrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		char[] array = {'P','E','R'};
		System.out.println(countDays(str,array));
	}
	
	
	public static int countDays(String str,char[] array) {
		int count = 0;
		int dayCount = 0;
		int arrayCount = 0;
		while(count != str.length()) {
			if(str.charAt(count) != array[arrayCount]) {
				dayCount++;
				
			}
		
			if(arrayCount == 2) {
				arrayCount = 0;
			}
			else {
			arrayCount++;
			}
			count++;
		}
		return dayCount;
	}

}
