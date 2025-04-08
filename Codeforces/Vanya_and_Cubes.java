package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int lvl = 1;
        while (n>0){
            n = n - a;
            if (n>0){
                lvl++;
                a+=lvl;
            }
        }
        if (n<0){
            System.out.println(lvl-1);
        }else {
            System.out.println(lvl);
        }
    }
}
