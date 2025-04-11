package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        int S = 0;
        for (int i = 0; i < n; i++) {
            S = S + max - arr[i];
        }
        System.out.println(S);
    }
}
