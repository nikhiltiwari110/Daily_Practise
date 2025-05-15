package Codeforces;

import java.util.Scanner;

public class Black_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        String str = sc.next();
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            int z = str.charAt(i) - '1';
            total = total + arr[z];
        }
        System.out.println(total);
    }
}
