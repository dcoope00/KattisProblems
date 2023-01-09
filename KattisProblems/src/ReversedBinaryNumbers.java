import java.util.Scanner;

public class ReversedBinaryNumbers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String binary = Integer.toBinaryString(a);
		String reversed = "";
		int binaryReverse = 0;

		for (int i = binary.length() - 1; i >= 0; i--) {
			reversed += binary.charAt(i) + "";
		}
		binaryReverse = Integer.parseInt(reversed, 2);
		System.out.println(binaryReverse);
	}

}
