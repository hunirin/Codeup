package Codeup.codeup1200_;

import java.util.Scanner;

public class _1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while (num >= 10) { // 자릿수 합이 1이 되기 전까지 반복
            sum = 0;
            while (num > 0) { // 각 자리수의 합 구하기
                sum += num % 10;
                num /= 10;
            }
            num = sum; // 다음 자릿수의 합으로 갱신
        }

        System.out.println(num); // 자릿수 합 출력
    }
}