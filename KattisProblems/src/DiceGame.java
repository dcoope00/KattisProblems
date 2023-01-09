import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int gunnar = 0;
		for(int i = 0;i < 4;i++) {
			gunnar+=scan.nextInt();
			
			
		}
		int emma = 0;
		for(int i = 0;i < 4;i++) {
			emma+=scan.nextInt();
		}
		
		int max = gunnar;
		if(emma > gunnar) {
			max = emma;
		}
		

		if(gunnar == emma) {
			System.out.println("Tie");
		}
		else if(max == emma) {
			System.out.println("Emma");
		}
		else if(max == gunnar) {
			System.out.println("Gunnar");
		}
		
		
		
	}

}
