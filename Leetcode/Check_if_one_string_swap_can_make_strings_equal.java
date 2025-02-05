package Daily_Practise.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Check_if_one_string_swap_can_make_strings_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isvalid(s1,s2));
    }
    public static boolean isvalid(String s1,String s2){
        if (s1.equals(s2)){
            return true;
        }
        List<Integer> ll = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i)){
                k++;
                ll.add(i);
            }
        }
        if (k==2) {
            int i1 = ll.get(0);
            int i2 = ll.get(1);
            if (s1.charAt(i1)==s2.charAt(i2)&&s1.charAt(i2)==s2.charAt(i1)) {
                return true;
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }
}
