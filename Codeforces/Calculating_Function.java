package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Calculating_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 0;
        if (n%2==0){
            System.out.println(n/2);
        }else {
            System.out.println(-(n-n/2));
        }

//        for (long i = 1; i <= n; i++) {
//            if (i % 2 != 0){
//                res = res - i;
//            }else {
//                res = res + i;
//            }
//        }
//        System.out.println(res);
    }
}
