package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n+1; i < 9013; i++) {
            if (isitdistinct(i)) {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isitdistinct(int i){
        int a = i % 10;
        i = i / 10;
        int b = i % 10;
        i = i / 10;
        int c = i % 10;
        i = i / 10;
        int d = i % 10;
        i = i / 10;
        if(a==b || a==c || a==d || b == c || b == d || c == d){
            return false;
        }else {
            return true;
        }
    }
}
