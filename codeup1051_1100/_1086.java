package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long w = sc.nextLong();
        long h = sc.nextLong();
        long b = sc.nextLong();

        long answer = w * h * b; // bit
        float result = answer / 1024.0f / 1024.0f / 8.0f;
        System.out.printf("%.2f MB", result);
    }
}
