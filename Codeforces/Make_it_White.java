package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Make_it_White {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int start = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='B'){
                    start = i;
                    break;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='B'){
                    end = i;
                }
            }
            System.out.println(end-start+1);
        }
    }
}
