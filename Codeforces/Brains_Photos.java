package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Brains_Photos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][] ch = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ch[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(color(ch));
    }
    public static String color(char ch [][]){
        String s = "#Color";
        String t = "#Black&White";
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                if (ch[i][j]=='C'||ch[i][j]=='M'||ch[i][j]=='Y'){
                    return s;
                }
            }
        }
        return t;
    }
}
