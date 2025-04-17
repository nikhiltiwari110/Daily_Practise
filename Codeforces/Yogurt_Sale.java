package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = 0;
            if (b>2*a){
                cost = n * a;
            }else{
                cost  = n/2 * b;
                cost += n%2 * a;
            }
            System.out.println(cost);
        }
    }
}
