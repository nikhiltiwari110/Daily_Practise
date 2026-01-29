package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Theater_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long x = n/a;
        long y = m/a;
        if (n%a != 0){
            x++;
        }
        if (m%a != 0){
            y++;
        }
        System.out.println(x*y);
    }
}
