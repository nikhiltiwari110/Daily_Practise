package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Blank_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i]==0){
                    max++;
                }else{
                    max=0;
                }
                ans = Math.max(max,ans);
            }
            System.out.println(ans);
        }
    }
}
