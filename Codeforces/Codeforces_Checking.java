package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "codeforces";
        while(t-->0){
            char c = sc.next().charAt(0);
            if (s.contains(c+"")){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
