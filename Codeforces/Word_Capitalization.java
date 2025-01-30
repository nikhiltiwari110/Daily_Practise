package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char str2 = str1.charAt(0);
        String str3 = ""+str2;
        System.out.println(str3.toUpperCase()+str1.substring(1));
    }
}
