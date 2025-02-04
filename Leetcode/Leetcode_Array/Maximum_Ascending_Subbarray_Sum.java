package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Scanner;

public class Maximum_Ascending_Subbarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
        }
        int sum = nums[0];
        int max_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]<nums[i]){
                sum = sum + nums[i];
            }else {
                sum = nums[i];
            }
            max_sum = Math.max(sum,max_sum);
        }
        System.out.println(max_sum);
    }
}
