package Daily_Practise;
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b==c){
                System.out.println("Yes");
            } else if (a+c==b) {
                System.out.println("Yes");
            } else if (b+c==a) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
