package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of tram's stops
        int cap = 0;
        int curr = 0;
        while (n-->0){
            int exit = sc.nextInt();
            int entry = sc.nextInt();
            curr = curr + entry - exit;
            cap = Math.max(curr,cap);
        }
        System.out.println(cap);
    }
}
