package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal = sc.nextInt();
        int answer = 0;

        for (int i = 1; i <= iVal; i++) {
            answer = answer + i;
            if (answer >= iVal) {
                System.out.println(i);
                break;
            }
        }

    }
}
