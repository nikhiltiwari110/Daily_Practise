package Daily_Practise;
import java.util.*;
public class Word_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            String[] arr1 = new String[n];
            for(int i = 0 ; i < n; i++){
                arr1[i]= sc.next();
            }
            String[] arr2 = new String[n];
            for(int i = 0 ; i < n; i++){
                arr2[i]= sc.next();
            }
            String[] arr3 = new String[n];
            for(int i = 0 ; i < n; i++){
                arr3[i]= sc.next();
            }
            int[] points1 = new int[n];
            int[] points2 = new int[n];
            int[] points3 = new int[n];
            int [] p1 = result(arr1,arr2,arr3,points1,n);
//            System.out.println(Arrays.toString(p1));
            int [] p2 = result(arr2,arr1,arr3,points2,n);
            int [] p3 = result(arr3,arr1,arr2,points3,n);
            int s1 = 0;
            int s2 = 0;
            int s3 = 0;
            for(int i = 0; i < n; i ++){
                s1 = s1 + p1[i];
                s2 = s2 + p2[i];
                s3 = s3 + p3[i];
            }
            System.out.println(s1+" "+s2+" "+s3);
        }
    }
        public static int [] result(String[] arr1 ,String[] arr2, String[] arr3, int[] points1 ,int n) {
            for (int i = 0; i < n; i++) {
                int a =0;
                if (search(arr1[i], arr2) == 1) {
                    a++;

                }  if (search(arr1[i], arr3) == 1) {
                    a++;
                }
                if(a==0){
                    points1[i]=3;
                } else if (a==1) {
                    points1[i]=1;
                }else {
                    points1[i]=0;
                }
            }
            return points1;
        }
        public static int search(String target, String[] arr){
            for (String s : arr) {
                if (target.equals(s)) {
//                    System.out.println("Found");
                    return 1;
                }
            }
//            System.out.println("404 Not Found");
            return 0;
        }
}
