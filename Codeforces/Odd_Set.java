package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Odd_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int o_c = 0;
           for (int i = 0; i < 2*n;i++){
                int x = sc.nextInt();
                if (x%2!=0){
                    o_c++;
                }
            }
            if (o_c==n){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
