import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DrunkVigenere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String encrypted = scan.next(); // CPMCRYY
		String key = scan.next(); // alberta

		Map<Character,Integer> indexMap = new HashMap<>();
		int i = 0;
		for (char ch = 'A'; ch <= 'Z'; ++ch) {
			indexMap.put(ch,i++);

		}

		String newString = "";
		for(int j = 0; j < encrypted.length();j++) {
			
			if(j%2 == 0) {
				char temp = encrypted.charAt(j);
				int shift = indexMap.get(key.charAt(j));
				if(key.charAt(j)== 'A') {
					newString = newString + temp;
				}
				else {
				for(int k = 0; k < shift;k++) {
					if(temp == 'A') {
						temp = 'Z';
					}
					else {
						temp--;
					}
				}
				
				newString = newString + temp;
				}
				
			}
			else if(j%2 == 1) {
				char temp = encrypted.charAt(j);
				int shift = indexMap.get(key.charAt(j));
				for(int k = 0;k < shift;k++) {
					if(temp == 'Z') {
						temp = 'A';
					}
					else {
						temp++;
					}
				}
				newString = newString + temp;
			}
			
			
		}
		System.out.println(newString);
		
		
		
	}

}
