import java.util.ArrayList;
import java.util.Scanner;

public class BoundingRobots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int w = -1;
		int l = -1;
		int xThinks = 0;
		int yThinks = 0;
		int xActual = 0;
		int yActual = 0;
		while ( w!= 0 || l != 0) {

			 w = scan.nextInt();
			 l = scan.nextInt();
			 if(w == 0 && l == 0) {
				 break;
			 }
			int num = scan.nextInt();
			scan.nextLine();
			ArrayList<String> list = new ArrayList<>();

			for (int i = 0; i < num; i++) {
				list.add(scan.nextLine());
			}

			 xThinks = 0;
			 yThinks = 0;
			 xActual = 0;
			 yActual = 0;
			
			for (int i = 0; i < list.size(); i++) {
				String temp = list.get(i);
				String[] line = temp.split(" ");
				int coord = Integer.parseInt(line[1]);
				if (line[0].equals("u")) {

					xThinks += coord;
					if (xActual + coord < l) {
						xActual += coord;
					} else {
						xActual = l-1;
					}

				}
				if (line[0].equals("d")) {
					xThinks -= coord;
					if (xActual - coord >= 0) {
						xActual -= coord;
					} else {
						xActual = 0;
					}
				}
				if (line[0].equals("r")) {
					yThinks += coord;
					if (yActual + coord < w) {
						yActual += coord;
					} else {
						yActual = w-1;
					}

				}
				if (line[0].equals("l")) {
					yThinks -= coord;
					if (yActual - coord >= 0) {
						yActual -= coord;
					} else {
						yActual = 0;
					}
				}
			}
			System.out.println("Robot thinks " + yThinks + " " + xThinks);
			System.out.println("Actually at " + yActual + " " + xActual);
		}
		

	}

}
