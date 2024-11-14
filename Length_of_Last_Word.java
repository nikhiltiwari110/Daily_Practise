package Daily_Practise;
import java.util.*;
public class Length_of_Last_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String [] arr = s.split("\s+");
        int n = arr.length - 1;
        String ans = "";
        ans = ans + arr[n];
        return ans.length();
    }
}
