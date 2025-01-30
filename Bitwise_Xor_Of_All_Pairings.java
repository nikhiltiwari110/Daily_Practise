package Daily_Practise;

import java.util.Scanner;

public class Bitwise_Xor_Of_All_Pairings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] nums1 = new int[n];
        int [] nums2 = new int[m];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        //for XOR 1 ,
        // if m is even // xor1 = 0, else xor1 = xor of nums1 element
        int xor1 = 0;
        if(nums2.length%2!=0){
            for (int i = 0; i < nums1.length; i++) {
                xor1 = nums1[i] ^ xor1;
            }
        }
        int xor2 = 0;
        if(nums1.length%2!=0){
            for (int i = 0; i < nums2.length; i++) {
                xor2 = nums2[i] ^ xor2;
            }
        }
        System.out.println(xor1^xor2);
    }
}
