package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Count_vowel_strings_in_ranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] word = new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = sc.next();
        }
        int q = sc.nextInt();
        int [][] query = new int[q][2];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                query[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(word));
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(query[i][j]+" ");
            }
            System.out.println();
        }
        boolean [] no_of_vowels = new boolean[word.length];
        boolean [] ans = vowels(no_of_vowels,word);
//        for (int i = 0; i < q; i++) {
//
//        }

//        int [] ans = new int[query.length];
//        for (int i = 0; i < q; i++) {
//            int st = query[i][0];
//            int lst = query[i][1];
//            ans[i] = no_of_vowels(st,lst,word);
//        }
//        System.out.println(Arrays.toString(ans));
    }
//    public static int no_of_vowels(int st,int lst,String [] word){
//        int count = 0;
//        for (int i = st; i <= lst; i++) {
//            if(is_it_vowel(word[i])){
//                System.out.println(word[i]);
//                count++;
//            }
//        }
//        return count;
//    }
//    public static boolean is_it_vowel(String str){
//        char ch = str.charAt(0);
//        char ls = str.charAt(str.length()-1);
//        if ((ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')&&(ls =='a' || ls == 'e' || ls == 'i' || ls == 'o' || ls == 'u')){
//            return true;
//        }
//        return false;
//    }
public static boolean [] vowels(boolean [] no_of_vowels,String [] word){
        for (int i = 0; i <= word.length; i++) {
            if(is_it_vowel(word[i])){
                System.out.println(word[i]);
                no_of_vowels[i] = true;
            }
        }
        return no_of_vowels;
    }
    public static boolean is_it_vowel(String str){
        char ch = str.charAt(0);
        char ls = str.charAt(str.length()-1);
        if ((ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')&&(ls =='a' || ls == 'e' || ls == 'i' || ls == 'o' || ls == 'u')){
            return true;
        }
        return false;
    }
}
