package Daily_Practise;
import java.util.*;
public class Clock_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String s = sc.next();
            String[] arr = s.split(":");
            int x = Integer.parseInt(arr[0]);
            if(x>12){
                if(x<=21) {
                    System.out.print(0);
                }
                System.out.print(x-12);
                System.out.println(":"+arr[1]+" PM");
                } else if (x==0){
                System.out.println(12+":"+arr[1]+" AM");
            } else if (x==12) {
                System.out.println(s+" PM");
            } else {
                System.out.println(s+" AM");
            }
        }
    }
}
