package javaa.levelone.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _1007 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int diferenca = num1 * num2 - num3 * num4;
        System.out.println("DIFERENCA = " + diferenca);
    }
}
