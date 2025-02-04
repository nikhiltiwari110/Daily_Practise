package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Scanner;

public class Longest_strictly_increasing_or_strictly_decreasing_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int c = 1;
        int k = 1;
        int max_k = 1;
        int max_c = 1;
        for (int i = 0; i < n-1; i++) {
            if (nums[i]<nums[i+1]){
                k++;
                c = 1;
            }else if (nums[i]>nums[i+1]){
                k=1;
                c++;
            }
            max_k = Math.max(max_k,k);
            max_c = Math.max(max_c,c);
        }
        System.out.println(Math.max(max_c,max_k));
    }
}
