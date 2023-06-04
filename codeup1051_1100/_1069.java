package Codeup.codeup1051_1100;

import java.util.Scanner;

public class _1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);
        int num = (int)ch;

        switch (num) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");

        }
    }
}
