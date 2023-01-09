import java.util.ArrayList;
import java.util.Scanner;

public class ANewAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l",
//							"m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		ArrayList<String> alphabet = new ArrayList<>();
		for (char i = 'a'; i <= 'z'; i++) {
			alphabet.add(i + "");

		}
		String[] newAlphabet = { "@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]",
				"0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2" };

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			String temp = str.charAt(i) + "";
			temp = temp.toLowerCase();
			if (!alphabet.contains(temp)) {
				res += temp;
			} else {
				int index = alphabet.indexOf(temp);
				res += newAlphabet[index];
			}
		}
		System.out.println(res);

	}

}

