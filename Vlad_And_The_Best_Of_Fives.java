package Daily_Practise;
import java.util.*;
public class Vlad_And_The_Best_Of_Fives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String s = sc.next();
            int A = 0;
            for(int i = 0; i < 5; i ++){
                if(s.charAt(i)=='A'){
                    A++;
                }
            }
            int D = 5 - A;
            if(A>D){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }
    }
}
