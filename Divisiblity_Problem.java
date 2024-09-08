package Daily_Practise;
import java.util.*;
public class Divisiblity_Problem {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     int [] arr = new int[t];
     for(int i = 0; i < t;i++){
         int a = sc.nextInt();
         int b = sc.nextInt();
         arr[i] = moves(a,b);
     }
     for(int i = 0;i < t;i++){
         System.out.println(arr[i]);
     }
    }
    public static int moves(int a,int b){
        int move = 0;
        while(a%b!=0){
            move++;
            a++;
        }
        return move;
    }
}
