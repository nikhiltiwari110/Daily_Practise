package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Short_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String b = sc.next();
            String a = "";
            for (int i = 0; i < b.length(); i+=2) {
                a = a+b.charAt(i);
            }
            a+=b.charAt(b.length()-1);
            System.out.println(a);
        }
    }
}
