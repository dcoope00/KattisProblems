import java.util.ArrayList;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int limit = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}
		int sum = 0;
		int res = 0;
		for(int i = 0;i < list.size();i++) {
			sum+=list.get(i);
			res++;
			if(sum > limit) {
				res--;
				break;
			}
		}
		System.out.println(res);
		
	}

}
