package javaa.levelone.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _1002 {
    private static final double pi = 3.14159;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double area = pi * (raio*raio);
        System.out.printf(Locale.ENGLISH,"A=%.4f\n",area);
    }
}
