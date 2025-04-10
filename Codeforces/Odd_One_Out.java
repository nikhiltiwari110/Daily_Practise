package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Odd_One_Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a!=b && a!=c){
                System.out.println(a);
            }
            if (a!=b && b!=c) {
                System.out.println(b);
            }
            if (a!=c && c!=b){
                System.out.println(c);
            }
        }
    }
}
