package Daily_Practise;
import java.sql.SQLOutput;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        while(n>0){
//            int temp = a + b;
//            a = b;
//            b = temp;
//            n--;
//        }
//        System.out.println(a);
        int fact = 1;
        int count = 0;
        while(n>0){
            fact = n * fact;
            n--;
        }
        System.out.println(fact);
        while(fact%10==0){
            count++;
            fact = fact / 10;
        }
        System.out.println(count);
    }

}
