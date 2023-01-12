import java.util.Scanner;

public class PervasiveHeartMonitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		//ArrayList<String> list = new ArrayList<>();
		while(scan.hasNext()) {
			String str = scan.nextLine();
			String[] line = str.split(" ");
			String name = "";
			double sum = 0;
			double avg =0;
			int count = 0;
			for(int i = 0;i < line.length;i++) {
				if(!line[i].contains("1") && !line[i].contains("2") && !line[i].contains("3") && 
						!line[i].contains("4") && !line[i].contains("5") && !line[i].contains("6") && !line[i].contains("7")
						&& !line[i].contains("8") && !line[i].contains("9")) {
					name+= line[i] + " ";
				}
				else {
					count++;
					sum +=Double.parseDouble(line[i]);
				}
			}
			avg = sum/count;
			System.out.println(avg + " " + name);
			
			
		}
		
	}

}
