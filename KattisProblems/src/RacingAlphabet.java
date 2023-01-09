import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RacingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] alphabet =  {"A","B","C","D","E","F","G","H","I",
		                                "J","K","L","M","N","O","P","Q","R","S",
		                                "T","U","V","W","X","Y","Z"," ","'"};
		
		
		double tileLength = (2*Math.PI*30)/28;
		System.out.println(tileLength);
		Map<String, Integer> indexMap = new HashMap<>();
		for(int i = 1; i < alphabet.length+1;i++) {
			indexMap.put(alphabet[i-1], i);
			
			
		}
		int tempDist = 0;
		while(n != -1) {
			String temp = scan.nextLine();
			
			for(int i = 0;i < temp.length()-1;i++) {
			char temp1 = temp.charAt(i);
			char temp2 = temp.charAt(i+1);
			System.out.println(indexMap.get(temp1 + ""));
			System.out.println(indexMap.get(temp2+ ""));	
			tempDist = tempDist + Math.abs(indexMap.get(temp1 + "")-indexMap.get(temp2 + ""));
			
			System.out.println((tempDist));
			
					
					
			}
		}
		
		
		
		
	}

}
