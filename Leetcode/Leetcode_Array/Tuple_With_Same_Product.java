package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Scanner;

public class Tuple_With_Same_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(no_of_tuples(arr));
    }
    public static int no_of_tuples(int [] arr){
        int count = 0;
        int p1 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                p1 = arr[i]*arr[j];
                if (exists(p1,arr,i,j)){
                    count+=4;
                }
            }

        }
        return count;
    }
    public static boolean exists(int p1, int [] arr, int idx,int idx2){
        for (int i = 0; i < arr.length; i++) {
            if (i==idx || i==idx2){
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]*arr[j]==p1){
                    return true;
                }
            }
        }
        return false;
    }
}
