package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a+b+c;
            if (sum>=2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
