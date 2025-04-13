package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Short_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            if (s.equals("cab")||s.equals("bca")){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
