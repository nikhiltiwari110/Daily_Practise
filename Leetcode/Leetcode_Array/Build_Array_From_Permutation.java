package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Build_Array_From_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int [] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
