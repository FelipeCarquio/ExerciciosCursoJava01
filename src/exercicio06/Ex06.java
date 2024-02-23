package exercicio06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, pi, tri, cir, tra, qua, ret;
        pi = 3.14159;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        c = sc.nextDouble();

        tri = a * c /2;
        cir = pi * ( c * c);
        tra = (a+b)*c/2;
        qua = b * b;
        ret = a * b;
        System.out.printf("Triangulo = %.3f\n", tri);
        System.out.printf("Circulo = %.3f\n", cir);
        System.out.printf("Trapézio = %.3f\n", tra);
        System.out.printf("Quadrado = %.3f\n", qua);
        System.out.printf("Retangulo = %.3f\n", ret);

    }
}
