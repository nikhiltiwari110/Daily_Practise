package Daily_Practise;
import java.util.*;
public class Yogurt_sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <= T;i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum1 = n*a;
            int sum2 = (n / 2 * b) + (n % 2 * a);
            if(sum1<sum2){
                System.out.println(sum1);
            } else {
                System.out.println(sum2);
            }

        }
    }
}
