package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Q59A_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a'){
                l++;
            }
        }
        int u = str.length() - l;
        if (l>=u){
            System.out.println(str.toLowerCase());
        }else {
            System.out.println(str.toUpperCase());
        }

    }
}
