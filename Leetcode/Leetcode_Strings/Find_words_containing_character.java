package Daily_Practise.Leetcode.Leetcode_Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_words_containing_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        char x =sc.next().charAt(0);
        List<Integer> ll = new ArrayList<>();
        System.out.println(search(words,x,ll));
    }
    public static List<Integer> search(String[] words, char x, List<Integer> ll){
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(x+"")){
                ll.add(i);
            }
        }

        return ll;
    }
}
