package Daily_Practise;
import java.util.*;
public class Power_of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Power(n));
    }
    public static boolean Power(int n){
        if(n==1){
            return true;
        }
        Power(n);
        return false;
    }
}
