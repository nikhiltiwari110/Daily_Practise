package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int d = 0;
        int l = 0;
        int r = n-1;
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                if (arr[l]>arr[r]){
                    s+=arr[l];
                    l++;
                }else{
                    s+=arr[r];
                    r--;
                }
            }else{
                if (arr[l]>arr[r]){
                    d+=arr[l];
                    l++;
                }else{
                    d+=arr[r];
                    r--;
                }

            }
        }
        System.out.println(s+" "+d);
    }
}
