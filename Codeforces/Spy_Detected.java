package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ele = arr[0];
            int c = 0;
            int idx = 0;
            for (int i = 1; i < n; i++) {
                if (ele!=arr[i]){
                    c++;
                    idx = i+1;
                }
            }
            if (c==1){
                System.out.println(idx);
            }else{
                System.out.println(1);
            }
        }
    }
}
