import java.util.Scanner;

public class JointJogJam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x1 = scan.nextInt(); 
		int y1 = scan.nextInt(); 
		int x2 = scan.nextInt(); 
		int y2 = scan.nextInt(); 
		int xx1 = scan.nextInt(); 
		int yy1 = scan.nextInt(); 
		int xx2 = scan.nextInt(); 
		int yy2 = scan.nextInt(); 
		
	
		double max = 0;
		for(int i = 0;i < 3;i++) {
			double temp = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
			if(temp > max) {
				max = temp;
			}
			x1 = xx1;
			x2 = xx2;
			y1 = yy1;
			y2 = yy2;
			
			
		}
		
		System.out.println(max);
	}

}
