package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c_1 = 0;
        int c_0 = 0;
        int c_max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1'){
                c_0 = 0;
                c_1++;
            }
            else{
                c_1 = 0;
                c_0++;
            }
            c_max = Math.max(c_max,Math.max(c_0,c_1));
        }
        if (c_max>=7) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
