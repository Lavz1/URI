package javaa.levelone.iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _1006 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        final double[] peso = {2, 3, 5};

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double media = ((num1*peso[0])+(num2*peso[1])+(num3*peso[2]))/(Arrays.stream(peso).sum());
        System.out.printf(Locale.ENGLISH,"MEDIA = %.1f\n",media);
    }
}
