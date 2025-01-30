package Daily_Practise;

import java.util.Scanner;

public class number_of_ways_to_split_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(ways(nums));
    }
    public static int ways(int [] arr){
        int c = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(isvalid(i,arr)){
                c++;
            }
        }
        return c;
    }
    public static boolean isvalid(int i, int [] arr){
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < i; j++) {
            sum1 = sum1 + arr[j];
        }
        for (int j = i+1; j < arr.length; j++) {
            sum2 = sum2 + arr[j];
        }
        if(sum1>=sum2){
            return true;
        }else {
            return false;
        }
    }
}
