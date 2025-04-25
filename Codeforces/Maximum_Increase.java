package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Maximum_Increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int max = 1;
        int c = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i-1]<arr[i]){
                c++;
            }else{
                c = 1;
            }
            max = Math.max(max,c);
        }
        System.out.println(max);
    }
}
