package exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r, pi, a;
        pi = 3.14159;

        System.out.print("Digite o raio a ser calculado: ");
        r = sc.nextDouble();

        a = pi * (r * r);
        System.out.printf("A = %.4f", a);


    }
}
