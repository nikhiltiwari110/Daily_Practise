package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int police = 0;
        while(n-->0) {
            int x = sc.nextInt();
            police = police + x;
            if (police<0&&x<0){
                police =0;
                count++;
            }
        }
        System.out.println(count);
    }
}
