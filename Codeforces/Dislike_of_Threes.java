package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Dislike_of_Threes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int k = sc.nextInt();
            int i = 1;
            while (k>0){
                if (i%3!=0 && i%10!=3){
                    k--;
                    i++;
                }else{
                    i++;
                }
            }
            System.out.println(i-1);
        }
    }
}
