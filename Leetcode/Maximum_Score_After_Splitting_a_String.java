package Daily_Practise.Leetcode;

import java.util.Scanner;

public class Maximum_Score_After_Splitting_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0,i);
            String right = s.substring(i);
//            System.out.println(left+" "+right);
            ans = no_of_zero(left)+no_of_ones(right);
//            System.out.println(ans);
            max = Math.max(ans,max);
        }
        System.out.println(max);
    }

    public static int no_of_zero(String left){
        int cz = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i)=='0'){
                cz++;
            }
        }
        return cz;
    }
    public static int no_of_ones(String right){
        int co = 0;
        for (int i = 0; i < right.length(); i++) {
            if (right.charAt(i) == '1') {
                co++;
            }
        }
        return co;
    }
}
