package Daily_Practise;
import java.util.*;
public class Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String s = sc.next();
            char y = s.charAt(0);
            char x = s.charAt(1);
            for(char i = 'a';i < 'i'; i++){
                if(s.charAt(0)!=i){
                    System.out.print(i);
                    System.out.println(x);
                }
            }
            for(char i = '1'; i < '9'; i++){
                if (s.charAt(1)!=i) {
                    System.out.print(y);
                    System.out.println(i);
                }
            }
        }
    }
}
