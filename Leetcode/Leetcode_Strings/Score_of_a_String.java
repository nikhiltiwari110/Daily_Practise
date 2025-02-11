package Daily_Practise.Leetcode.Leetcode_Strings;

import java.util.Scanner;

public class Score_of_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(score_count(s));
    }
    public static int score_count(String s){
        int sum = 0;
        int diff = 0;
        for (int i = 1; i < s.length(); i++) {
            diff = Math.abs(s.charAt(i-1) - s.charAt(i));
            sum+=diff;
        }
        return sum;
    }
}
