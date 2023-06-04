package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] answer = new int[23 + 1]; // 0

        for (int i = 0; i < size; i++) {
            answer[sc.nextInt()]++; // 이걸 할수 있는지
        }

        for (int i = 1; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
