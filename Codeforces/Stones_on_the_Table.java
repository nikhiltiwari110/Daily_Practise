package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)==s.charAt(i-1)){
                c++;
            }
        }
        System.out.println(c);
    }
}
