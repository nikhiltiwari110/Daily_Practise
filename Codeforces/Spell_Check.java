package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Spell_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            if(isvaild(s,n)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isvaild(String s, int n){
        String test = "Timur";
        if(n!=5){
            return false;
        }
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='T'){
                a++;
            }
            if (s.charAt(i)=='i'){
                b++;
            }
            if (s.charAt(i)=='m'){
                c++;
            }
            if (s.charAt(i)=='u'){
                d++;
            }
            if (s.charAt(i)=='r') {
                e++;
            }
        }
        if (a==1&&b==1&&c==1&&d==1&&e==1){
            return true;
        }else {
            return false;
        }
    }
}
