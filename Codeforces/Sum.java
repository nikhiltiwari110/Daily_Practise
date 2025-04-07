package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int sum = 0;
            int max = -1;
            int a = sc.nextInt();
            if (a>max){
                max = a;
            }
            sum+=a;
            int b = sc.nextInt();
            if (b>max){
                max = b;
            }
            sum+=b;
            int c = sc.nextInt();
            if (c>max){
                max = c;
            }
            sum+=c;
            if (max==sum-max){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
