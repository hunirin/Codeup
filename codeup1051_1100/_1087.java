package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num;) {
            sum += i;
            i++;
            if (sum >= num) {
                break;
            }

        }
        System.out.println(sum);
    }
}
