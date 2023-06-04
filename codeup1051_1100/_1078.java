package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= iVal; i++) {
            if (i%2 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);
    }
}
