package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt()-1;
            }
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[arr[i]] = i;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(num[i] + 1 + " ");
            }
        }
    }
}
