package Daily_Practise.Leetcode.Leetcode_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Transform_Array_by_Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        operation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void operation(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                nums[i] = 0;
            }else {
                nums[i] = 1;
            }
        }
    Arrays.sort(nums);
    }

}
