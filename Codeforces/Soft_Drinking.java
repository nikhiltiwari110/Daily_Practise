package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        //for one friend no of toasts;
        int td = k*l; // total drink
        int ts = (c*d)/n; // toasts:total slices/1
        int t1 = td/nl; // toasts :total drink/needed drink
        int t2 = p/np; // toasts : total salt/needed salt
        // for n friends
        int f1 = t1/n;
        int f2 = t2/n;
        int f3 = Math.min(f1,f2);
        int f4 = Math.min(f3,ts);
        System.out.println(f4);

    }
}
