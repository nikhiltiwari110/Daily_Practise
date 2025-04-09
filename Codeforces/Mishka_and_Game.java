package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mi = 0;
        int ch = 0;
        while (n-->0){
            int m = sc.nextInt();
            int c = sc.nextInt();
            if (m>c){
                mi++;
            }
            if(m<c){
                ch++;
            }
        }
        if (mi>ch){
            System.out.println("Mishka");
        } else if (mi == ch) {
            System.out.println("Friendship is magic!^^");
        }else {
            System.out.println("Chris");
        }
    }
}
