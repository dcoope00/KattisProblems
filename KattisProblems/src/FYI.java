import java.util.Scanner;

public class FYI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		int[] array = new int[7];
		while(n > 0) {
			array[count] = n%10; 
			n = n/10;
			count++;
		}
		
		if(array[4] == 5 && array[5] == 5 && array[6] == 5) {
			System.out.println(1);
		}
		else
			System.out.println(0);
		
	}

}
