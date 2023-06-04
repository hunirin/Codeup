package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int day = 1;

        while (day % A != 0 || day % B != 0 || day % C != 0) {
            day++;
        }
        System.out.println(day);
    }
}
