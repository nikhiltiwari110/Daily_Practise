package Daily_Practise;
import java.util.*;
public class Divisiblity_Problem {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     for(int i = 0; i < t;i++){
         int a = sc.nextInt();
         int b = sc.nextInt();
         if(a%b == 0){
             System.out.println(0);
         } else{
             System.out.println((b-(a%b)));

         }
        }
    }
}
