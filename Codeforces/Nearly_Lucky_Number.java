package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (isit(n)){
        System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean isit(long n){
        int lucky_digits = 0;
        while (n>0){
            long rem = n % 10;
            if (rem==7){
                lucky_digits++;
            } else if (rem == 4) {
                lucky_digits++;
            }
            n = n / 10;
        }
        if (lucky_digits == 4 || lucky_digits == 7){
        return true;}
        else {
            return false;
        }
    }
}
