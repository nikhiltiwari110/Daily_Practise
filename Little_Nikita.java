package Daily_Practise;
import java.util.*;
public class Little_Nikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<=t; i++){
            int moves=sc.nextInt();
            int cubes=sc.nextInt();
            if(cubes%2!=0){
                if(moves>=cubes && moves % 2 != 0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            } else{
                if(moves>=cubes && moves % 2 == 0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
