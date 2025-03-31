package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        s= s.toLowerCase();
        t = t.toLowerCase();
        int a = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)<t.charAt(i)){
                System.out.println(-1);
                a = 1;
                break;
            } else if (s.charAt(i)>t.charAt(i)) {
                System.out.println(1);
                a = 1;
                break;
            }
        }
        if (a==0) {
            System.out.println(0);
        }
    }
}
