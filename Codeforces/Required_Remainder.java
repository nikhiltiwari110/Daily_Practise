package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int v = n % x;
            if(v>=y){
                int d = v - y;
                System.out.println(n-d);
            }else{
                int di = v + (x-y);
                System.out.println(n - di);
            }
        }
    }
}
