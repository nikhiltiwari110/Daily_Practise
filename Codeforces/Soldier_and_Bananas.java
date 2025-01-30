package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int total_money =0;
        for (int i = 1; i <= w; i++) {
            total_money = total_money + (k*i);
        }
        int money_to_borrow = 0;
        if (n < total_money) {
            money_to_borrow = total_money - n;
        }
        System.out.println(money_to_borrow);
    }
}
