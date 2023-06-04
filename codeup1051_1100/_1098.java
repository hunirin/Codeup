package Codeup.codeup1051_1100;

import java.util.Arrays;
import java.util.Scanner;

public class _1098 {
    // OOP를 활용해서 풀이
    private int[][] arr;

    public _1098(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int l, int d, int x, int y) { // 나무막대를 놓겠다
        for (int i = 0; i < l; i++) {
            if (d == 0) { // 가로 (d: direction)
                arr[x - 1][y + i - 1] = 1;
            } else { // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rowCnt = sc.nextInt();
        int colCnt = sc.nextInt();
        _1098 c1098 = new _1098(rowCnt, colCnt);
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            c1098.setBeam(l, d, x, y);

        }
//
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//        }

    }
}
