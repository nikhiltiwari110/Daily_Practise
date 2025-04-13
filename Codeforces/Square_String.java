package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Square_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            if (isitsquare(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isitsquare(String s){
        if (s.length()%2!=0){
            return false;
        }else{
            int x = s.length()/2;
            for (int i = 0; i < x; i++) {
                if (s.charAt(i)!=s.charAt(x+i)){
                    return false;
                }
            }
            return true;
        }
    }
}
