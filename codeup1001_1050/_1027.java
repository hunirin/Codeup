package Codeup.codeup1001_1050;

import java.util.Scanner;

public class _1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = sc.next().split("\\.");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
