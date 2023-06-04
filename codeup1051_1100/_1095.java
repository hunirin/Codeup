package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] answer = new int[size];
        int idx = 0;
        int min = 23;

        for (int i = 0; i < size; i++) {
            answer[idx++] = sc.nextInt();
        }

        for(int i = 1; i < size; i++) {
            if(min > answer[i]) {
                min = answer[i];
            }

        }
        System.out.println(min);


    }
}
