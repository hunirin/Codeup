package Codeup.codeup1001_1050;

import java.util.Scanner;

public class _1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        int octal = Integer.parseInt(num, 8);
        System.out.printf("%d", octal);
    }
}
