package Daily_Practise;
import java.util.*;
public class Morning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            int count = 1;
            int c = 4;
            int steps = 0;
            while(c-->0){
                int remR = n % 10;
                n = n /10;
                int remL = count==4 ? 1 : n % 10;
                if(remL==0){
                    remL = 10;
                }
                if(remR==0){
                    remR = 10;
                }
                int diff = remL - remR;
                if(diff<0){
                    diff = diff * (-1);
                }
                steps = steps + (diff+1);
                count++;
            }
            System.out.println(steps);
        }
    }
}
