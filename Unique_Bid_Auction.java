package Daily_Practise;
import java.util.*;
public class Unique_Bid_Auction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Unique(arr));
        }
    }
    public static int Unique(int [] arr) {
        int ans = arr[0];
        int unique;
        for (int i = 0; i < arr.length; i++) {
            int freq = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq == 0) {
                unique = arr[i];
                ans = Math.min(ans, unique);
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==ans){
                return i+1;
            }
        }
        return -1;
    }
}
