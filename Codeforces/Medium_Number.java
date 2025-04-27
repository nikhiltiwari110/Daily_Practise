package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Medium_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int [] arr = new int[3];
            int sum = 0;
            int min = 21;
            int max = 0;
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                if (arr[i]<min){
                    min = arr[i];
                }
                if (arr[i]>max){
                    max = arr[i];
                }
                sum+=arr[i];
            }
            System.out.println(sum-max-min);
        }
    }
}
