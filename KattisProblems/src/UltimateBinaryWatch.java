import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UltimateBinaryWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
Scanner scan= new Scanner(System.in);
		String str = scan.next();
		int[] bits = { 1, 2, 4, 8 };
		String[] arr1 = { ".", ".", ".", "." };
		String[] arr2 = { ".", ".", ".", "." };
		String[] arr3 = { ".", ".", ".", "." };
		String[] arr4 = { ".", ".", ".", "." };

		boolean arr1full = false;
		boolean arr2full = false;
		boolean arr3full = false;
		boolean arr4full = false;

			for (int h = 0; h < 4; h++) {
				int temp = Integer.parseInt(str.charAt(h) + "");
				for (int i = 0; i < bits.length; i++) {
					boolean full;
					//check if temp equals any number in bits array
					for(int k = 0;k < bits.length;k++) {
						if(temp == bits[k]) {
							if(h == 0) {
								arr1[k] = "*";
							}
							if(h == 1) {
								arr2[k] = "*";
							}if(h == 2) {
								arr3[k] = "*";
							}if(h == 3) {
								arr4[k] = "*";
							}
						}
						
						
					}
					if (temp == 0) {
						i++;
					} else {
						if (bits[i] == temp && h == 0) {
							arr1[i] = "*";
							arr1full = true;
						
						}
						if (bits[i] == temp && h == 1) {
							arr2[i] = "*";
							arr2full = true;


						}
						if (bits[i] == temp && h == 2) {
							arr3[i] = "*";
							arr3full = true;

						}
						if (bits[i] == temp && h == 3) {
							arr4[i] = "*";
							arr4full = true;

						}

					}
				}
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {

						if (bits[j] + bits[k] == temp && h == 0 && arr1full == false) {
							arr1[j] = "*";
							arr1[k] = "*";
						}

					}
				}

				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {

						if (bits[j] + bits[k] == temp && h == 1 && arr2full == false ) {	
							
							arr2[j] = "*";
							arr2[k] = "*";
						}

					}
				}

				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {

						if (bits[j] + bits[k] == temp && h == 2 && arr3full == false) {
							arr3[j] = "*";
							arr3[k] = "*";
							
						}

					}
				}
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {

						if (bits[j] + bits[k] == temp && h == 3 && arr4full == false) {
							
							arr4[j] = "*";
							arr4[k] = "*";
						}

					}
				}

			}

		
		String temp1 = Arrays.toString(arr1);
		String temp2 = Arrays.toString(arr2);
		String temp3 = Arrays.toString(arr3);
		String temp4 = Arrays.toString(arr4);
		for (int i = temp1.length() - 1; i >= 0; i--) {
			if (temp1.charAt(i) != ',' && temp1.charAt(i) != '[' && temp1.charAt(i) != ']') {
				if(i == temp1.length()-1) {
					System.out.print(temp1.charAt(i));
					System.out.print(temp2.charAt(i));
					System.out.print(temp3.charAt(i));
					System.out.println(temp4.charAt(i));
				}
				else
				System.out.print(temp1.charAt(i) + " ");
				System.out.print(temp2.charAt(i) + "   ");
				System.out.print(temp3.charAt(i) + " ");
				System.out.println(temp4.charAt(i) + "  ");
			}
		}

		System.out.println();

	}
}
