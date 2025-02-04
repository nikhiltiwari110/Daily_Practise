package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int A = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                A++;
            }
        }
        int D = n -A;
        if (A > D) {
            System.out.println("Anton");
        } else if (D>A) {
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }
    }
}
