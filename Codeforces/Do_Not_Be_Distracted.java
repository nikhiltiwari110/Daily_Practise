package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int [] words = new int[26];
            if(isitsus(words,s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isitsus(int [] words, String s){
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1)!=s.charAt(i)){
                int x = s.charAt(i-1) - 'A';
                if (words[x]==0) {
                    words[x]++;
                }else{
                    return false;
                }
            }
        }
        int y = s.charAt(s.length()-1)-'A';
        if (words[y]!=0){
            return false;
        }else{
            return true;
        }
    }
}
