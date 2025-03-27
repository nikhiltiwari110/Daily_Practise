package Daily_Practise.Leetcode.Leetcode_Strings;

import java.util.Scanner;

public class Valid_Paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(is_valid(s));
    }
    public static boolean is_valid(String s){
        if (s.length()%2!=0){
            return false;
        }else{
            s=s.replace("}","{");
            s=s.replace(")","(");
            s=s.replace("]","[");
        }
        int[] arr = new int[3];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                arr[0]++;
            } else if (s.charAt(i)=='{') {
                arr[1]++;
            }else{
                arr[2]++;
            }
        }
        if (arr[0]%2==0 && arr[1]%2==0 && arr[2]==0){
            if(rev(s)){
                return true;
            }
            else {
                return false;
            }
        }else {
            return false;
        }
    }
    public static boolean rev(String s){
        String copy = "";
        for (int i = s.length()-1; i>=0; i--) {
            copy= copy+s.charAt(i);
        }
        if (s.equals(copy)){
            return true;
        }else {
            return false;
        }
    }
}
