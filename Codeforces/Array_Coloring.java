package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            int n_o = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i]%2!=0){
                    n_o++;
                }
            }
            if (n_o%2!=0){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }

        }
    }
}
