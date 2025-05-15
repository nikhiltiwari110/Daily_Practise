package Daily_Practise.Codeforces;

import java.util.Arrays;
//import java.util.HashMap;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            //My approach
//            HashMap<Integer,Integer> map = new HashMap<>();
//            for (int v: arr){
//                if (!map.containsKey(v)){
//                    map.put(v,1);
//                }else{
//                    map.put(v, map.get(v)+1);
//                }
//            }
//            int size = map.size();
//            System.out.println(isit(size,map,arr));

            //codeforces approach
            //sort the array
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = i+1; j < arr.length; j++) {
//                    if (arr[i]>arr[j]){
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
            Arrays.sort(arr);
            System.out.println(isit2(arr));
        }

    }
//    public static int isit(int size,HashMap<Integer,Integer> map , int [] arr){
//        for (int v:arr){
//            if (map.get(v)>=3){
//                return (v);
//            }
//        }
//        return -1;
//    }

    public static int isit2(int [] arr){
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i]==arr[i+1]&&arr[i]==arr[i+2]){
                return (arr[i]);
            }
        }
        return -1;
    }
}
