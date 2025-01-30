package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int [] arr = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            if (i<n){
            arr[i] = nums[i];
            }else {
                arr[i] = nums[i-n];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
