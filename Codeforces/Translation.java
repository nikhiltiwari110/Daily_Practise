package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(isitrev(s,t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static boolean isitrev(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }
        int i = 0;
        int j = s.length()-1;
        while(i<s.length()&&j>=0){
            if (s.charAt(i)!=t.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
