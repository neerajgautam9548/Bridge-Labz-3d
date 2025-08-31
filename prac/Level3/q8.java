package prac.Level3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q8 {
    static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    static boolean checkUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);
        return set.size() == arr.length;
    }

    public static void main(String[] args) {
        int[] otpArr = new int[10];
        for (int i = 0; i < 10; i++) otpArr[i] = generateOTP();
        System.out.println("Generated OTPs: " + Arrays.toString(otpArr));
        System.out.println("Are OTPs Unique? " + checkUnique(otpArr));
    } 
}
