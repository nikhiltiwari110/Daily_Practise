package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//number
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            int rem = n % 10;
            if (rem == 0) {
                n = n / 10;
            }else {
                n = n - 1;
            }
        }
        System.out.println(n);
    }
}
