package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            int s1 = 0;
            int s2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i<3){
                    s1 += s.charAt(i);
                }else{
                    s2 += s.charAt(i);
                }
            }
            if (s1==s2){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
