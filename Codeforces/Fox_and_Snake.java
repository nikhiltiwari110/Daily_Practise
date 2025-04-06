package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Fox_and_Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int star = m;
        int dot = m-1;
        int row = 1;
        while (row<=n){
            //star
            if (row%2!=0) {
                int i = 0;
                while (i < star) {
                    System.out.print("#");
                    i++;
                }
            }else {
                //dot
                int j = 0;
                while (j < dot) {
                    System.out.print(".");
                    j++;
                }
                if (row%4!=0){
                    System.out.print("#");
                }
            }
            //row change
            row++;
            System.out.println();
            if (row<=n && row%4==0){
                System.out.print("#");
            }
        }
    }
}
