package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Magical_Sticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            long sum = (n+1)/2;
            System.out.println(sum);
        }
    }
}
