package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "codeforces";
        while (t-->0){
            String x = sc.next();
            int c = 0;
            for (int i = 0; i < 10; i++) {
                if (x.charAt(i)!=s.charAt(i)){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
