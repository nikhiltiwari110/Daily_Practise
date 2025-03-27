package Daily_Practise.Leetcode.Leetcode_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Paranthese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<Character>();
        String s = sc.next();
        System.out.println(isit(s,st));

    }
    public static boolean isit(String s,Stack<Character> st ) {
        for (int i = 0; i < s.length(); i++) {
            //round
            if (s.charAt(i) == ')' && st.peek() == '(') {
                st.pop();

            } else if (s.charAt(i) == ']' && st.peek() == '[') {
                st.pop();
            } else if (s.charAt(i) == '}' && st.peek() == '{') {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
