package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double vol = 0;
        double total_vol = n;
        while(n-->0){
            double a = sc.nextInt();
            vol = vol + (a/100);
        }
        System.out.printf("%.12f",vol/total_vol*100);
    }
}
