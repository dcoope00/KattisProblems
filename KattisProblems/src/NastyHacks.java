
import java.util.Scanner;

public class NastyHacks {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        String str = "";
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            int r = scan.nextInt(); //revenue not advertising
            int e = scan.nextInt(); //revenue if advertising
            int c = scan.nextInt(); //cost of advertising
            
            if(r < e-c) {
                str = "advertise";
            }
            else if(r > e-c) {
                str = "do not advertise";
            }
            else {
                str = "does not matter";
            }
            System.out.println(str);
        }
    }

}