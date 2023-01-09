import java.util.Scanner;

public class DigitProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		
		String nString = n + "";
		int nLength = nString.length();
		
		int tmpSum = 1;
		String newNum =  "";
		while(nLength > 1) {
		for(int i = 0;i < nString.length();i++) {
			if(Integer.parseInt(nString.charAt(i) + "") != 0) {
				tmpSum *= Integer.parseInt(nString.charAt(i) + "");
			}
		
		nString = tmpSum + "";
		nLength = nString.length();
		}
		System.out.println(tmpSum);
		}
		
	
	
	
	
	}
	
	

}
