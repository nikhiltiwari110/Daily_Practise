package Daily_Practise;
import java.util.*;
public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Product_Subarray(nums,k));
    }
    public static int Product_Subarray(int [] arr, int k){
        int c = 0;
        int n = arr.length;
        int i = 0;
        int j = 0;
        int product = 1;
        while(i<n){
            product = product * arr[j];
            if(product<k){
                c++;
                j++;
                if(j==n){
                    i++;
                    j = i;
                    product = 1;
                }
            }else{
                i++;
                j = i;
                product = 1;
            }
        }
//        for(int i = 0; i<n; i++){
//            int product = 1;
//            for(int j = i; j < n; j++){
//                product = product * arr[j];
//                if(product<k){
//                    c++;
//
//                }else{
//                    break;
//                }
//            }
//        }
        return c;
    }

}
