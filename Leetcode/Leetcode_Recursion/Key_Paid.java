package Daily_Practise.Leetcode.Leetcode_Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class Key_Paid {
    static String []letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();
        ArrayList<String> ll = new ArrayList<>();
        Combinations(digits,"",ll);
        System.out.println(ll);
    }
    public static void Combinations(String digits,String ans, ArrayList<String> ll){
        if (digits.length()==0){
            ll.add(ans);
            return;
        }
        int c =digits.charAt(0) -'0';
        for (int i = 0; i < letters[c].length(); i++) {
            Combinations(digits.substring(1),ans + letters[c].charAt(i),ll);
        }
    }
}
