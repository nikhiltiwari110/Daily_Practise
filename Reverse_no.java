package Daily_Practise;
import java.sql.SQLOutput;
import java.util.*;
public class Reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rev = 0;
        while(x!=0){
            int rem = x % 10;
            rev = rem+rev*10;
            x = x / 10;
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            System.out.println(0);
        }else {
        System.out.println(rev);
        }
    }
}
