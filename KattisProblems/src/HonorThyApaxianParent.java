import java.util.Scanner;

public class HonorThyApaxianParent {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        String[] names = str.split(" ");
        String y = names[0];
        String p = names[1];
        
        String extend = "";
        String tmpExtend = "";
        //System.out.println(y.substring(y.length()-2,y.length()));
        if(y.charAt(y.length()-1) == 'e') {
            extend = y + 'x'+p;
        }
        
        else if(y.charAt(y.length()-1) == 'a' || y.charAt(y.length()-1) == 'i' || y.charAt(y.length()-1) == 'o' || y.charAt(y.length()-1) =='u'){
            tmpExtend = y.substring(0, y.length()-1);
            extend = tmpExtend+"ex"+p;
        }
        else if(y.charAt(y.length()-2) == 'e' && y.charAt(y.length()-1) == 'x') {
            extend = y+p;
        }
        else {
            extend = y + "ex"+p;
        }
        System.out.println(extend);
        
    }

}