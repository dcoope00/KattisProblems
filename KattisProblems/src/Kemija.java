
import java.util.ArrayList;
import java.util.Scanner;

public class Kemija {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan= new Scanner(System.in);
        
        String str = scan.nextLine();
        String strPart = "";
        ArrayList<String> list = new ArrayList<>();
        list.add(str);
        
        String[] array = str.split(" ");
        
        for(int i = 0;i < array.length;i++) {
            strPart = array[i];
            int n = 0;

            
            while(n < strPart.length()) {
                if(strPart.charAt(n) == 'a' || strPart.charAt(n) == 'e' || strPart.charAt(n) == 'i' || strPart.charAt(n) == 'o' || strPart.charAt(n) == 'u') {
                    n+=2;
            }
                System.out.print(strPart.charAt(n));
            
            n++;
            }
            System.out.print(" ");
             
            
        }
    }

}