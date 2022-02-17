package javaa.levelone.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _1001 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("src/javaa/levelone/arquivos/_1001.txt"));

//        File file = new File(args.length > 0 ? args[0] : "src/javaa/levelone/arquivos/_1001.txt");
//        Scanner scanner = new Scanner(file);

        Scanner input = new Scanner(System.in);

        int soma = input.nextInt();
        soma += input.nextInt();
        System.out.println("X = " + soma);
    }
}
