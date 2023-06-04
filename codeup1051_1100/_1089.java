package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 1;

        while (cnt < n) {
            a += d;
            cnt++;
        }
        System.out.println(a);
    }
}
