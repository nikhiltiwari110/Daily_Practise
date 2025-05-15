package Daily_Practise.Codeforces.Cp31.Rating800;

import java.util.Scanner;

public class Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(isitsorted(arr)|| k>=2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isitsorted(int [] arr ){
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
