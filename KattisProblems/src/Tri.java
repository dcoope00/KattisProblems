import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String str = "";
		if(a+b == c) {
			str = (a+"+" + b + "=" + c);
		}
		else if(a*b == c) {
			str = a+"*"+b+ "=" + c;
		}
		else if(a-b == c) {
			str = a +"-" + b + "=" + c;
		}
		else if(a/b == c) {
			str = a + "/" + b + "=" + c;
		}

		else if(a == b+c) {
			
		}
		System.out.println(str);
		
		
		
	}

}
