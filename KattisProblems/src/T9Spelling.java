import java.util.Scanner;

public class T9Spelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int caseCount = 1;
		String[] array = {"", "", "abc",
				         "def","ghi","jkl",
				         "mno","pqrs","tuv",
				         "wxyz"};
		String built = "";
		boolean bool = false;
		char nextChar = 'a';
		for(int i = 0; i < n;i++) {
			if(i == 0) {
			scan.nextLine();
			}
			String tmpWord = scan.nextLine();
			built = "";
			for(int j = 0;j < tmpWord.length();j++) {
				bool = false;
				char tmpChar = tmpWord.charAt(j);
				if(j <  tmpWord.length()-1) {
					nextChar = tmpWord.charAt(j+1);
					}
				if(tmpChar == ' ') {
					built+="0";
					if(tmpChar == nextChar) {
					built+= " ";
					}
				}
				
				
				
				
				for(int k = 0;k < array.length;k++) {
					//System.out.println(array[k].length()); length of cells
					
					if(array[k].contains(tmpChar + "")) {
						if(j < tmpWord.length()-1) {
							if(array[k].contains(tmpChar + "") && array[k].contains(nextChar + "")) {
								bool = true;
							}
						}
						for(int l = 0; l < array[k].length();l++) {
							
							if(array[k].charAt(l) != tmpChar) {
							built += k;
							}
							if(array[k].charAt(l) == tmpChar) {
								built+=k;
								break;
							}
						
						}//end l loop
						
					}
					
				}//end k loop
				
				if(bool == true) {
				built+= " ";
				}
				
			}//end j loop
			System.out.println("Case #" +caseCount++ + ": " + built);	
		}//end of i loop
		
	}

}
