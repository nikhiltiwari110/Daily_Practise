package Daily_Practise;
import java.util.*;
public class Find_first_and_last_position_of_element_in_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        //[5,7,7,8,8,10]
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchRange(nums,target));
    }
    public static ArrayList<Integer> searchRange(int [] nums, int target){
        ArrayList<Integer> list = new ArrayList<>();
        int lo = 0;
        int hi = nums.length - 1;
        boolean found = false;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target){
                list.add(mid);
                if(nums[mid-1]<target){
                    lo = mid + 1;
                }else{
                    hi = mid - 1;
                }
            }else if(nums[mid]>target){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return list;

    }
}
