package Codeforces;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] ar = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int el = ar[i][0];
            for (int j = 0; j < n; j++) {
                int el2 = ar[j][1];
                if (el == el2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
