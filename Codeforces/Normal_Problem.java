package Daily_Practise.Codeforces;
import java.util.Scanner;
public class Normal_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            int j = a.length()-1;
            String b = "";
            for (int k = j; k >=0 ; k--) {
                if (a.charAt(k)=='p'){
                    b+="q";
                } else if (a.charAt(k)=='q') {
                    b+="p";
                }else{
                    b+="w";
                }
            }
            System.out.println(b);
        }
    }
}
