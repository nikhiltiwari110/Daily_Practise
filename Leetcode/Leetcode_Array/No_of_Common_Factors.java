package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Scanner;

public class No_of_Common_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a,b);
        int count = 0;
        for (int i = 1; i <= min; i++) {
            if (a%i==0&&b%i==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
