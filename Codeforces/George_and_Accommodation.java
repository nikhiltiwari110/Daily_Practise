package Daily_Practise.Codeforces;

import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int room = 0;
        while (n-->0){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (q-p>=2){
                room++;
            }
        }
        System.out.println(room);
    }
}
