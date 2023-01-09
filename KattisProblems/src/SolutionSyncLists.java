import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionSyncLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		while(true) {
			int[] first = new int[n];
			int[] second = new int[n];
			Map<Integer,Integer> indexMap = new HashMap<>();
			
			
		for(int i = 0;i < n;i++) {
			int next = scan.nextInt();
			indexMap.put(next, i);
			first[i] = next;
			
		}
		System.out.println("Index map " );
		System.out.println(indexMap.toString());
		for(int i = 0;i < n;i++) {
			second[i] = scan.nextInt();
			
		}
		
		Arrays.sort(first);
		Arrays.sort(second);
		for(int i = 0;i < first.length;i++) {
			System.out.print(first[i] + ", ");
			
		}
		System.out.println();
		for(int i = 0;i < n;i++) {
			System.out.print(second[i] + ", ");
			
		}
		System.out.println();
		int[] newSecond = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Index map.get gives " + indexMap.get(first[i]));
			System.out.println();
			newSecond[indexMap.get(first[i])] = second[i];
		}
		for(int i = 0; i < newSecond.length;i++) {
		System.out.println(newSecond[i]);		
				
		}
		n = scan.nextInt();
		if(n == 0) {
			break;
		}
		else {
			System.out.println();
		}
			
		
		
		}
	}

}
