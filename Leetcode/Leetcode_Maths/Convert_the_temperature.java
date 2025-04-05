package Daily_Practise.Leetcode.Leetcode_Maths;

import java.util.Arrays;
import java.util.Scanner;

public class Convert_the_temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        double [] arr = new double[2];
        arr[0] = c + 273.15000;
        arr[1] = c * 1.80 + 32.00000;
        System.out.println(Arrays.toString(arr));
    }
}
