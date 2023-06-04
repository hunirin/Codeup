package Codeup.codeup1101_;

import java.util.Scanner;

public class _1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String form = sc.next();

        String C = form.substring(1,2);
        String H = form.substring(3);

        int num1 = Integer.parseInt(C);
        int num2 = Integer.parseInt(H);

        System.out.println(num1*12+num2);
    }
}
