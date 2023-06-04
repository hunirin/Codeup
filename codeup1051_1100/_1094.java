package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] answer = new int[size];
        int idx = 0;

        for (int i = 0; i < size; i++) {
            answer[idx++] = sc.nextInt();
        }

//      System.out.println(Arrays.toString(arr)); // 배열에 잘 들어 갔는지 확인
        for(int i = size - 1; i >= 0; i--) {
            System.out.printf("%d ", answer[i]);
        }

    }
}
