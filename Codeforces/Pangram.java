package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (isit(n,s)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean isit(int n,String s){
        if (n<26){
            return false;
        }
        int [] arr = new int[26];
        s = s.toLowerCase();
        for (int i = 0; i < n; i++) {
            int x = s.charAt(i) - 'a';
            arr[x]++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
