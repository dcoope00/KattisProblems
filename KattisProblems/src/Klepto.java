import java.util.Scanner;

public class Klepto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int lenOfKeyword = scan.nextInt();
		int lengthOfTxt = scan.nextInt();
		
		
		int[] alphabet = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		
		String lastletters = "";
		
		String lastLetters = scan.nextLine();
		String wholeCipher = scan.nextLine();
			
		
		
		String plaintext = "";
		for(int i = 0;i < lenOfKeyword;i++) {
			plaintext = plaintext + (Integer.parseInt(wholeCipher.charAt(i) + "")-(Integer.parseInt(wholeCipher.charAt(i) + "")))%26;
			
			
			
		}
		
		System.out.println(plaintext);
	}

}
