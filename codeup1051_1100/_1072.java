package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal = sc.nextInt();
        sc.nextLine();

        String[] str = sc.nextLine().split(" ");

        for(int i = 0; i < iVal; i++){
            System.out.println(str[i]);
        }
    }
}
