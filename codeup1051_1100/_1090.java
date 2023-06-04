package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 1;

        while (cnt < n) {
            a *= d;
            cnt++;
        }
        System.out.println(a);
    }
}
