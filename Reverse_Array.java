package Daily_Practise;
import java.util.*;
public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void reverse(int [] arr){
    int i = 0;
    int j = arr.length - 1;
    while(i<j){
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
        i++;
        j--;
    }
    }
}
