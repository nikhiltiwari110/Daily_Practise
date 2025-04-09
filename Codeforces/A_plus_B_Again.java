package Daily_Practise.Codeforces;

import java.util.Scanner;

public class A_plus_B_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int sum = 0;
            while (n>0){
                int rem = n % 10;
                n = n / 10;
                sum = sum + rem;
            }
            System.out.println(sum);
        }
    }
}
