package Codeup.codeup1001_1050;

import java.util.Scanner;

public class _1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("%d\n", a + b + c);

        float d = a;
        float e = b;
        float f = c;
        System.out.printf("%.1f\n", (d + e + f)/3);


    }
}

