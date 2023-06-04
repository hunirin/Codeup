package Codeup.codeup1001_1050;

import java.util.Scanner;

public class _1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num[] = sc.next().split("\\.");
        int first = Integer.parseInt(num[0]);
        int second = Integer.parseInt(num[1]);
        System.out.printf("%d\n%d", first, second);
    }
}
