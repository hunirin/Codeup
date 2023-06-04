package Codeup.codeup1051_1100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _1084_2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                String line = "";
                for (int k = 0; k < blue; k++) {
                    line += i + " " + j + " " + k + "\n";
                    cnt += 1;
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(cnt);
    }
}