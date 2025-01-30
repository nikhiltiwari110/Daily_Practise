package Daily_Practise.Leetcode.Leetcode_Array;

import java.util.Scanner;

public class final_value_of_variable_after_performing_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] operations = new String[n];
        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].contains("++")){
                x = x + 1;
            }else{
                x = x - 1;
            }
        }
        System.out.println(x);
    }
}
