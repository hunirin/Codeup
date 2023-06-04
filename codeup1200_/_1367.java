package Codeup.codeup1200_;

import java.util.Scanner;

public class _1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i-- ) {

            for (int j = 0; j < i-1; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.printf("*");
            }

            System.out.println("");
        }
    }
}
