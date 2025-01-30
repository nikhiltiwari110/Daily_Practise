package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Scanner;

public class Max_consecutive_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findmaxconsecutive(nums));
    }
    public static int findmaxconsecutive(int[] nums){
        int max = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                max ++;
            }else {
                max = 0;
            }
            ans = Math.max(max,ans);
        }
        return ans;
    }
}
