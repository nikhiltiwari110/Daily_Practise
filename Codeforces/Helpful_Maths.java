package Daily_Practise.Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length() / 2 + 1;
        int[] ar = new int[len];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!='+'){
                ar[j] = s.charAt(i) - '0';
                j++;
            }
        }
        j = 0;
        Arrays.sort(ar);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!='+'){
                System.out.print(ar[j]);
                j++;
            }else{
                System.out.print("+");
            }
        }
    }

}
