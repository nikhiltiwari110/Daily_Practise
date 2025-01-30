package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Scanner;

public class Xor_operation_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ nums[i];
        }
        System.out.println(xor);
    }
}
