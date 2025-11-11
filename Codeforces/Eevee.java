package Daily_Practise.Codeforces;

import java.util.*;

public class Eevee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 6) {
            System.out.println("espeon");
        } else if (n == 8) {
            System.out.println("vaporeon");
        } else {
            String str = sc.next();
            List<String> word = new ArrayList<>();
            String[] p = {"jolteon", "flareon", "umbreon", "leafeon", "glaceon", "sylveon"};
            for (int i = 0; i < p.length; i++) {
                word.add(p[i]);
            }
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i)!='.'){
                    int j = 0;
                    while (j<word.size()){
                        if (str.charAt(i)!=word.get(j).charAt(i)){
                            word.remove(word.get(j));
                        }else{
                            j++;
                        }
                    }
                }
            }
            System.out.println(word.get(0));
        }
    }
}
