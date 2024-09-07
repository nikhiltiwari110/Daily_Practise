package Daily_Practise;
import java.util.*;
public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int [] nums,int k){
        int count = nums.length;
        k = k % count;
        while(k>0){
            int item = nums[count-1];
            for(int i = count - 2;i >= 0; i--){
                nums[i+1] = nums[i];
            }
            k--;
            nums[0] = item;
        }
    }
}
