package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = n/5;
        if (n%5!=0){
            steps++;
        }
        System.out.println(steps);
    }
}
