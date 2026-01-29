package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        int e1 = a*b*c;
        int e2 = a+b+c;
        max = Math.max(e1,e2);
        int e3 = a+b*c;
        int e4 = a*b+c;
        int e5 = (a+b)*c;
        int e6 = a*(b+c);
        max = Math.max(max,Math.max(e3,e4));
        max = Math.max(max,Math.max(e5,e6));
        System.out.println(max);
    }
}
