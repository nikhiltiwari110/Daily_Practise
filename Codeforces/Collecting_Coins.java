package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Collecting_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int [] arr = new int[3];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                if (arr[i]>max){
                    max = arr[i];
                }
            }
            int x = sc.nextInt();
            int diff = 0;
            for (int i = 0; i < 3; i++){
                diff = diff+ max - arr[i];
            }
            x -= diff;
            if (x%3==0 && x>=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
