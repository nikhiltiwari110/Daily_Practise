package Daily_Practise.Codeforces;

import java.util.Scanner;

public class A_plus_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            int x = s.charAt(0) - '0';
            int y = s.charAt(2) - '0';
            System.out.println(x + y);
        }
    }
}
