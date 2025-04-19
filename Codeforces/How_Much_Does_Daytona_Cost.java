package Daily_Practise.Codeforces;

import java.util.Scanner;

public class How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (isit(arr,k)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isit(int [] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                return true;
            }
        }
        return false;
    }
}
