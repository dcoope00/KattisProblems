import java.util.ArrayList;
import java.util.Scanner;

public class MusicalSales {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] array = { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" };
		String str = scan.nextLine();
		String newStr = str.replace(" ", "");
		ArrayList<ArrayList<String>> majors = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			ArrayList<String> list = new ArrayList<>();
			list.add(array[i]);
			int marker = i;
			// count = 0;
			for (int j = 0; j < 7; j++) {
				if (j == 0 || j == 1 || j == 3 || j == 4 || j == 5) {
					if (marker + 1 >= array.length) { // G# case
						marker = 1;
						list.add(array[marker]);

					} else if (marker + 2 >= array.length) { // G case
						marker = 0;
						list.add(array[marker]);

					} else {
						marker += 2;
						list.add(array[marker]);

					}
				}
				// move once
				else {
					if (marker + 1 >= array.length) { // G# case
						marker = 0;
						list.add(array[marker]);

					}

					else {
						marker++;
						list.add(array[marker]);

					}

				}

			}
			majors.add(list);
			//System.out.println(list);
		}
		String res = "";
		String note = "";
		boolean contains = false;
		for (ArrayList<String> list : majors) {
			contains = false;
			for (int i = 0; i < newStr.length();) {
				if (i < newStr.length() - 1 && newStr.charAt(i + 1) == '#') {
					note = newStr.substring(i, i + 2);
					i+=2;
				} else {
					
					note = newStr.charAt(i) + "";
					i++;
				}
				//System.out.println(note);
				if (list.contains(note)) {

					contains = true;
				} else {
					contains = false;
					break;

				}

			}
			if (contains == true) {
				//System.out.println("hi");

				if (res.length() == 0) {
					res += list.get(0);
				} else {
					res += " " + list.get(0);
				}
			}

		}

		if (res.length() == 0) {
			res = "none";
		}

		System.out.println(res);

	}

}
