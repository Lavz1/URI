package javaa.levelone.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _1005 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int prod = num1 * num2;
        System.out.println("PROD = " + prod);
    }
}
