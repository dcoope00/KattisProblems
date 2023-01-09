import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ptice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		ArrayList<String> names = new ArrayList<>();
		String str = scan.nextLine();
		char[] answers = str.toCharArray();
		char[] arr1 = new char[n];
		char[] arr2 = new char[n];
		char[] arr3 = new char[n];
		String str1 = "ABC";
		String str2 = "BABC";
		String str3 = "CCAABB";
		
		int arrCount = 0;
		for(int i = 0;i < n;i++) {
			arr1[i] = str1.charAt(arrCount++);
			if(arrCount >= str1.length()) {
				arrCount = 0;
			}
		}
		
		arrCount = 0;
		for(int i = 0;i < n;i++) {
			arr2[i] = str2.charAt(arrCount++);
			if(arrCount >= str2.length()) {
				arrCount = 0;
			}
		}
		
		arrCount = 0;
		for(int i = 0;i < n;i++) {
			arr3[i] = str3.charAt(arrCount++);
			if(arrCount >= str3.length()) {
				arrCount = 0;
			}
		}
		int max = 0;
		int tempMax = 0;
		String best = "";
		for(int i = 0;i < answers.length;i++) {
			if(answers[i] == arr1[i]) {
				tempMax++;
			}
		
		}
		if(tempMax > max) {
			max = tempMax;
			
		}
		tempMax = 0;
		for(int i = 0;i < answers.length;i++) {
			if(answers[i] == arr2[i]) {
				tempMax++;
				
			}
		
		}
		if(tempMax > max) {
			max = tempMax;
		}
		tempMax = 0;
		for(int i = 0;i < answers.length;i++) {
			if(answers[i] == arr3[i]) {
				tempMax++;
			}
		
		}
		if(tempMax > max) {
			max = tempMax;
		}
		tempMax = 0;

		for(int i = 0;i < answers.length;i++) {
			if(answers[i] == arr1[i]) {
				tempMax++;
			}
		
		}
		if(tempMax == max) {
			names.add("Adrian");
		}
		tempMax = 0;
		
		for(int i = 0;i < answers.length;i++) {
			if(answers[i] == arr2[i]) {
				tempMax++;
			}
		
		}
		if(tempMax == max) {
			names.add("Bruno");
		}
		tempMax = 0;
		
		for(int i = 0;i < answers.length;i++) {
			if(answers[i] == arr3[i]) {
				tempMax++;
			}
		
		}
		if(tempMax == max) {
			names.add("Goran");
		}
		tempMax = 0;
		System.out.println(max);
		for(int i = 0;i < names.size();i++) {
			System.out.println(names.get(i));
		}
	}

}
