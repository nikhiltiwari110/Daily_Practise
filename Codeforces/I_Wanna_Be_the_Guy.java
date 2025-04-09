package Daily_Practise.Codeforces;

import java.util.Scanner;

public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int p = sc.nextInt();
        while(p-->0){
            int x = sc.nextInt();
            arr[x-1] = 1;
        }
        int q = sc.nextInt();
        while(q-->0){
            int y = sc.nextInt();
            arr[y-1] = 1;
        }
        if (isitvalid(arr)){
            System.out.println("I become the guy.");
        }else {
            System.out.println("Oh, my keyboard!");
        }
    }
    public static boolean isitvalid(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
