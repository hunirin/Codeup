package Codeup.codeup1001_1050;

import java.util.Scanner;

public class _1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] str = sc.nextLine().toCharArray();

        for (int i = 0; i < str.length; i++) {
            System.out.printf("\'%c\'\n", str[i]);
        }
    }
}
