package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();

        long answer = h * b * c * s; // bit
        float result = answer / 1024.0f / 1024.0f / 8.0f;
        System.out.printf("%.1f MB", result);

    }
}
