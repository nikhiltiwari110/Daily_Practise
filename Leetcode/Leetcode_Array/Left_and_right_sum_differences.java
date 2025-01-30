package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Scanner;

public class Left_and_right_sum_differences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
            int [] left = new int[nums.length];
            int [] right = new int[nums.length];
            left[0] = 0;
            for (int i = 1; i < nums.length; i++) {
                left[i] = nums[i-1]+left[i-1];
            }
            right[nums.length-1] = 0;
            for (int i = nums.length - 2; i >= 0 ; i--) {
                right[i] = nums[i+1]+right[i+1];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Math.abs(left[i]-right[i]);
            }
    }
}
