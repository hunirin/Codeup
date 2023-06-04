package Codeup.codeup1001_1050;

import java.util.Scanner;

public class _1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d\n", a + b);
        System.out.printf("%d\n", a - b);
        System.out.printf("%d\n", a * b);
        System.out.printf("%d\n", a / b);
        System.out.printf("%d\n", a % b);

        float c = a;
        float d = b;
        System.out.printf("%.2f\n", c / d);

    }
}

