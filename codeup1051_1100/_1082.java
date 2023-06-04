package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자 inputVal를 16진수로 변형 -> iHaxVal
        String inputVal = sc.next();
        int iHaxVal = Integer.parseInt(inputVal, 16);

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%s*%X=%X\n", inputVal, i, iHaxVal * i);

        }
    }
}
