package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int time = (24 - h)*60;
            System.out.println(time - m);
        }
    }
}
