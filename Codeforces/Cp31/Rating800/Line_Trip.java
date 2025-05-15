package Daily_Practise.Codeforces.Cp31.Rating800;

import java.util.Scanner;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                 arr[i] = sc.nextInt();
            }
            int max_d = Math.max(arr[0],2*(x-arr[arr.length-1]));
            for (int i = 0; i < n-1; i++) {
                int d = arr[i+1]-arr[i];
                if (d>max_d){
                    max_d = d;
                }
            }
            System.out.println(max_d);
        }
    }
}
