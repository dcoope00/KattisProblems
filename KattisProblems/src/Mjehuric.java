import java.util.Scanner;

public class Mjehuric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0;i < array.length;i++) {
			array[i] = scan.nextInt();
		}
		
		while(array[0] != 1 || array[1] != 2 || array[2] != 3 || array[3] != 4 || array[4] != 5) {
		
		for(int i = 0;i < array.length-1;i++) {
			if(array[i] > array[i+1] && i==0) {
				int tmp = array[i];
				array[i] = array[i+1];
				array[i+1] = tmp;
				printArray(array);
			}
			if(array[i] > array[i+1] && i==1) {
				int tmp = array[i];
				array[i] = array[i+1];
				array[i+1] = tmp;
				printArray(array);
			}
			if(array[i] > array[i+1] && i==2) {
				int tmp = array[i];
				array[i] = array[i+1];
				array[i+1] = tmp;
				printArray(array);
			}
			if(array[i] > array[i+1] && i==3) {
				int tmp = array[i];
				array[i] = array[i+1];
				array[i+1] = tmp;
				printArray(array);
			}
			
		}
		}
		
	}
	
	public static void printArray(int[] array) {
		for(int i = 0;i < array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
