package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Magnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int group = 1;
        for (int i = 1; i < n; i++) {
            if (!arr[i-1].equals(arr[i])){
                group++;
            }
        }
        System.out.println(group);
    }
}
