package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = b - a;
            System.out.println(min);
        }
    }
}
