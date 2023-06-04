package Codeup.codeup1001_1050;

import java.util.Scanner;

public class _1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = sc.next().split(":");
        int hour = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[1]);
        int sec = Integer.parseInt(str[2]);

        System.out.println(min);
    }
}
