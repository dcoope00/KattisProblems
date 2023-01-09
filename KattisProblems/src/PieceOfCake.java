
import java.util.Scanner;

public class PieceOfCake {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int h = scan.nextInt();
        int v = scan.nextInt();
        int thickness = 4;
        int volume = 0;
        int u = 0;
        int o = 0;
        
        int hDiff = n-h; //4-2 = 2
        int vDiff1 = n-v; //4-1 = 3
        int vDiff2 = n-vDiff1; //4-3 = 1
        if(hDiff > h) {
        u = hDiff;
        }
        else{
            u = h;
        }
        if(vDiff1 > v) {
            o = vDiff1;
        }else {
            o = v;
            
            
        }
        System.out.println(u*o*4);
        
    }

}