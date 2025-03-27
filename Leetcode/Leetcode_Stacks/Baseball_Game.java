package Daily_Practise.Leetcode.Leetcode_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Baseball_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ops = new String[n];
        for (int i = 0; i < n; i++) {
            ops[i] = sc.next();
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (ops[i].equals("C")) {
                System.out.println("C");
                st.pop();
            }
            else if (ops[i].equals("D")) {
                //double Stack
                System.out.println("D");
                int a = 2*st.peek();
                st.push(a);
            }
            else if (ops[i].equals("+")) {
                //add two Stack
                System.out.println("+");
                int j = st.pop();
                int k = st.peek();
//                st.push(k);
                st.push(j);
                st.push(j + k);
            } else {
                //add Stack(st,ops[i])
                System.out.println("ELSE");
                //int x = ops[i].charAt(0) - '0';
                st.push(Integer.parseInt(ops[i]));
            }
            System.out.println(st);
        }
        int sum = 0;
        int s = st.size();
        for (int i = 0; i < s; i++) {
            sum+=st.pop();
        }
        System.out.println(sum);
    }
}