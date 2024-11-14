package Daily_Practise;
import java.util.*;
import java.util.Arrays;
public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            int [] arr1 = new int[26];
            int [] arr2 = new int[26];
            for(int i = 0; i < s.length(); i++){
                int x = (int)s.charAt(i)-97;
                arr1[x]++;
                int y = (int)t.charAt(i)-97;
                arr2[y]++;
            }
            if(Arrays.equals(arr1, arr2)){
                return true;
            }else{
                return false;
            }
        }
    }
}
