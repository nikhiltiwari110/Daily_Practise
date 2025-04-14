package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Plus_One_on_the_Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i]>max){
                    max = arr[i];
                }
                if (arr[i]<min){
                    min = arr[i];
                }
            }
            System.out.println(max-min);
        }
    }
}
