package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==b){
                System.out.println(0);
            }
            else{
                int diff = Math.abs(a-b);
                int move = diff/10;
                if (diff%10 != 0){
                    move++;
                }
                System.out.println(move);
            }

        }
    }
}
