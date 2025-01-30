package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            if(s.length()<11){
                System.out.println(s);
            }else {
                char ch = s.charAt(0);
                char l = s.charAt(s.length()-1);
                int length = s.length()-2;
                System.out.println(""+ch+length+l);
            }
        }
    }
}
