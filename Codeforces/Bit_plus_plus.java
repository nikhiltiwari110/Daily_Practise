package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n-->0){
            String s = sc.next();
            if(s.contains("++")){
                x+=1;
            }else{
                x-=1;
            }
        }
        System.out.println(x);
    }
}
