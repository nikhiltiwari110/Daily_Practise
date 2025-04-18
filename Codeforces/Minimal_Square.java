package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Minimal_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int side = 0;
            int area = 0;
            if (a==b){
                side = 2*a;

            }else if (a>b){
                if (2*b>a) {
                    side = 2 * b;
                }else{
                    side = a;
                }
            }else {
                if (2*a>b){
                    side = 2*a;
                }else{
                    side = b;
                }
            }
            area = side * side;
            System.out.println(area);
        }
    }
}
