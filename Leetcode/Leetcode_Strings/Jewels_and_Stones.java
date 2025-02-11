package Daily_Practise.Leetcode.Leetcode_Strings;

import java.util.Scanner;

public class Jewels_and_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.next();
        String stones = sc.next();
        System.out.println(count_jewels(jewels,stones));
    }
    public static int count_jewels(String jewels, String stones){
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            String s = ""+stones.charAt(i);
            if (jewels.contains(s)){
                count++;
            }
        }
        return count;
    }
}
