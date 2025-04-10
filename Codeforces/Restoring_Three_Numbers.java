package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long x2 = sc.nextLong();
        long x3 = sc.nextLong();
        long x4 = sc.nextLong();
        long sum = x1+x2+x3+x4;
        long abc = sum/3;
        if (abc-x1!=0){
            System.out.println(abc-x1);
        }
        if (abc-x2!=0){
            System.out.println(abc-x2);
        }
        if (abc-x3!=0){
            System.out.println(abc-x3);
        }
        if (abc-x4!=0){
            System.out.println(abc-x4);
        }
    }
}
