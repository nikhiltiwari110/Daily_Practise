package Daily_Practise;
import java.util.*;
public class Stair_Peak_None {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a<b && b<c){
                System.out.println("STAIR");
            } else if (b>a && b>c) {
                System.out.println("PEAK");
            }else {
                System.out.println("NONE");
            }
        }
    }
}
