import java.util.Scanner;

public class NumberFun {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            
            
            if(a+b == c || b+a == c || a-b == c || b-a == c ||  a*b == c || b*a == c || a/b == c && a%b==0 || b/a == c && b%a==0)
                System.out.println("Possible");
            
            else
                System.out.println("Impossible");
                
        }
    }

}