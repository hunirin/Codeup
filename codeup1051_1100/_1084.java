package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int num = 0;

        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                for (int k = 0; k < blue; k++) {
                    System.out.printf("%d %d %d\n", i, j, k);
                    num++;
                }
            }
        }
        System.out.printf("%d", num);
    }
}
