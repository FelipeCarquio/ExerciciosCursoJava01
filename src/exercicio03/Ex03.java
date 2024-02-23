package exercicio03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, dif;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();
        System.out.print("Digite o quarto número: ");
        d = sc.nextInt();

        dif = a * b - c * d;
        System.out.println("Diferença = " + dif);
    }
}
