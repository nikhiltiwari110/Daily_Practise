package Daily_Practise.Codeforces;

import java.util.Scanner;
import java.util.Stack;

public class osumania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for (int i = 1; i <= n; i++) {
                    String s = sc.next();
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j)=='#'){
                        st.push(j+1);
                    }
                }
            }
            while (!st.isEmpty()){
                System.out.print(st.pop()+" ");
            }
            System.out.println();
        }
    }
}
