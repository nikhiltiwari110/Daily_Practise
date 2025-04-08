package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = 0;
            int copy =n;
            while (copy>0){
                int r = copy % 10;
                if (r!=0){
                    k++;
                }
                copy = copy / 10;
            }
            System.out.println(k);
            int times = 0;
            while (n>0) {
                int rem = n % 10;
                if (times == 0 && rem != 0) {
                    System.out.print(rem+" ");
                }
                if (times != 0 && rem != 0) {
                    System.out.print(rem * (int)Math.pow(10, times)+" ");
                }
                n = n / 10;
                times++;
            }
        }
    }
}
