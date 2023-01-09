import java.util.Scanner;

public class SimonSays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] array = new String[n+1];
        for(int i = 0;i <= n; i++) {
            String str = scan.nextLine();
            array[i] = str;
        }
        
        for(int i = 0;i < array.length;i++) {
            if(array[i].contains("Simon says")) {
                String newStr = array[i].substring(array[i].indexOf("says")+5);
                System.out.println(newStr);

            }
        }
        
    }

}