package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Brr_Brr_Patapim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [][] per = new int[n][n];
            int [] arr = new int[2*n];
            int sum = 2*n*(2*n+1)/2;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    per[i][j] = sc.nextInt();
                    if (arr[i+j+1]==0) {
                        sum -= per[i][j];
                        arr[i + j + 1] = per[i][j];
                    }
                }
            }
            arr[0] = sum;
            for (int i = 0; i < 2*n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
