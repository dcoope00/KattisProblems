import java.util.Scanner;

public class DeathKnightHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		int res = 0;
		boolean bool = false;
		for(int i = 0;i < n;i++) {
			String str = scan.nextLine();
			bool = false;
			for(int j = 0;j  < str.length()-1;j++) {
				
				if(str.charAt(j) == 'C' && str.charAt(j+1) == 'D') {
					bool = true;
					
				}
				
			}
			if(bool == false) {
				res++;
			}
			
			
			
		}
		System.out.println(res);
	}

}
