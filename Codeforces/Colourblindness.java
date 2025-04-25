package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Colourblindness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            boolean flag = true;
            s1 = s1.replace('B','G');
            s2 = s2.replace('B','G') ;
            for (int i = 0; i < n; i++){
                if (s1.charAt(i)!=s2.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
