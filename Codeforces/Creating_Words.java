package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Creating_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String a = sc.next();
            String b = sc.next();
            System.out.print(b.charAt(0)+a.substring(1)+" ");
            System.out.println(a.charAt(0)+b.substring(1)+" ");
        }
    }
}
