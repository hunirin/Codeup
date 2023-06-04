package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a % 2 == 0) {
            if(a >= 0) {
                System.out.println("plus");
            } else {
                System.out.println("minus");
            }
            System.out.println("even");

        } else {
            if(a >= 0) {
                System.out.println("plus");
            } else {
                System.out.println("minus");
            }
            System.out.println("odd");
        }
    }
}
