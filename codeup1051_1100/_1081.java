package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outerDice = sc.nextInt(); // 자주 바뀜
        int innerDice = sc.nextInt(); // 나중에 바뀜

        // 바깥쪽 3번
        // 안쪽 2번
        for (int j = 1; j <= outerDice; j++) {
            for (int i = 1; i <= innerDice; i++) { // 2면체 주사위
                System.out.printf("%d %d\n", j, i);
            }
        }
    }
}
