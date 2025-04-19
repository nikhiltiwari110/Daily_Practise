package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            int j = s.length()-1;
            int c = 0;
            while (i<j){
                if (s.charAt(i)!=s.charAt(j)){
                    c+=2;
                }else{
                    break;
                }
                i++;
                j--;
            }
            if (c<s.length()) {
                System.out.println(s.length() - c);
            }else{
                System.out.println(0);
            }
        }
    }
}
