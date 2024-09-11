package Daily_Practise;
import java.util.*;
public class Elevator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T>0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int s1 = a-1;
                int s2 = c-b;
                if(s2<0){
                    s2=s2*(-1);
                }
                s2 = s2 + (c-1);
                if(s1==s2){
                    System.out.println(3);
                }else if(s1<s2){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
                T--;
            }
        }
}
