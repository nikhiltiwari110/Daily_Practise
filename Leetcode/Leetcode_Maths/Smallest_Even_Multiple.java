package Daily_Practise.Leetcode.Leetcode_Maths;

import java.util.Scanner;

public class Smallest_Even_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n);
        }else{
            System.out.println(n*2);
        }
    }
}
