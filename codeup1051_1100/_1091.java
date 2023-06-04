package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 1;

        while (cnt < n) {
            a = a * m + d;
            cnt++;
        }
        System.out.println(a);
    }
}
