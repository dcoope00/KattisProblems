import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DRMMessages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		String str1 = str.substring(0, (str.length() / 2));
		String str2 = str.substring(str.length() / 2, str.length());

		Map<Character, Integer> indexMap = new HashMap<>(30);
		Map<Integer, Character> opposite = new HashMap<>(30);
		int i = 0;
		for (char ch = 'A'; ch <= 'Z'; ++ch) {
			indexMap.put(ch, i);
			opposite.put(i++, ch);
		}
		System.out.println(rotate(str1,str2,indexMap,opposite));

	}
	
	

	public static String rotate(String str1, String str2, Map<Character, Integer> indexMap, 
			Map<Integer, Character> opposite) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0;i < str1.length();i++) {
			char temp = str1.charAt(i);
			sum1 += indexMap.get(temp);
			
		}
		int curr1 = 0;
		StringBuilder builder1 = new StringBuilder();
		while(true) {
			char temp = str1.charAt(curr1++);
			for(int i = 0;i < sum1;i++) {
				
				if(temp == 'Z') {
					temp = 'A';
				}
				else {
					temp++;
				}
			}
			builder1.append(temp);
			
			if(curr1 == str1.length()) {
			break;
			}
		}
		String newStr1 = builder1.toString();
		for(int i = 0;i < str2.length();i++) {
			char temp = str2.charAt(i);
			sum2 += indexMap.get(temp);
			
		}
		int curr2 = 0;
		StringBuilder builder2 = new StringBuilder();
		while(true) {
			char temp = str2.charAt(curr2++);
			for(int i = 0;i < sum2;i++) {
				if(temp == 'Z') {
					temp = 'A';
				}
				else {
					temp++;
				}
			}
			builder2.append(temp);
			
			if(curr2 == str2.length()) {
			break;
			}
		}
		String newStr2 = builder2.toString();
		
		
		String answer = merge(newStr1,newStr2,indexMap,opposite);
		return answer;
	}

	
	
	public static String merge(String newStr1, String newStr2, Map<Character, Integer> indexMap,
			Map<Integer, Character> opposite) {
		StringBuilder builder1 = new StringBuilder();
		int t;
		String lastStr = "";
		for(int i=0; i<newStr2.length(); i++) {
			t = indexMap.get(newStr2.charAt(i));
			builder1.append(opposite.get((indexMap.get(newStr1.charAt(i))+t)%26));
			
		}
		lastStr = builder1.toString();
		return lastStr;
	}
}
