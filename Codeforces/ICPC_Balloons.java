package Daily_Practise.Codeforces;

import java.util.Scanner;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int [] arr = new int[26];
            int n = sc.nextInt();
            String s = sc.next();
            int balloons = 0;
            for (int i = 0; i < s.length(); i++) {
                int x = s.charAt(i) - 'A';
                if (arr[x]==0){
                    balloons+=2;
                    arr[x] = 1;
                }else{
                    balloons++;
                }
            }
            System.out.println(balloons);
        }
    }
}
