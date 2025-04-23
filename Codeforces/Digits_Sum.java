package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Digits_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-->0) {
            int x = sc.nextInt();
            int x_1 = x + 1;
            if (x_1 > 9) {
                System.out.println(x_1 / 10);
            } else {
                System.out.println(0);
            }
        }
    }
}
