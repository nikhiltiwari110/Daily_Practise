package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Q1030A_EasyProblem {
    public static void main(String[] args) {
        //In Search of an Easy Problem
        // 3
        // 0 0 1
        //HARD
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n-->0){
            int a = sc.nextInt();
            if(a==1){
                count++;
            }
        }
        if (count == 0) {
            System.out.println("EASY");
        }else {
            System.out.println("HARD");
        }
    }
}
