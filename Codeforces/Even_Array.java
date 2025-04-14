package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int odd = 0;
            int even = 0;
            for (int i = 0; i < n; i++) {
                if (i%2==0 && arr[i]%2!=0){
                    odd++;
                }
                if (i%2!=0 && arr[i]%2==0){
                    even++;
                }
            }
            if (even==odd){
                System.out.println(even);
            }else {
                System.out.println(-1);
            }
        }
    }
}
