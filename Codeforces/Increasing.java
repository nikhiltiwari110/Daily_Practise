package Daily_Practise.Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            boolean flag = true;
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (map.containsKey(x)){
                    flag = false;
                    map.put(x,map.get(x)+1) ;
                }else{
                    map.put(x,1);
                }
            }
            if (flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
