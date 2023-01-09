import java.util.ArrayList;
import java.util.Scanner;

public class Zoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =  new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < n;i++) {
			int num = scan.nextInt();
			list.add(num);
		}
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = k;i < list.size()+1;i+=k) {
			res.add(list.get(i-1));
			
		}
		for(int i = 0;i < res.size();i++) {
			System.out.print(res.get(i) + " ");
		}
	}

}
