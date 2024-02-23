package exercicio05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numPeca1, qntPeca1, numPeca2, qntPeca2;
        double valorPeca1, valorPeca2, totPg;

        System.out.print("Digite o código da primeira peça: ");
        numPeca1 = sc.nextInt();
        System.out.print("Digite a quantidade de peças: ");
        qntPeca1 = sc.nextInt();
        System.out.print("Digite o valor da peça: ");
        valorPeca1 = sc.nextDouble();
        System.out.print("Digite o código da Segunda peça: ");
        numPeca2 = sc.nextInt();
        System.out.print("Digite a quantidade de peças: ");
        qntPeca2 = sc.nextInt();
        System.out.print("Digite o valor da peça: ");
        valorPeca2 = sc.nextDouble();

        totPg = (qntPeca1 * valorPeca1) + (qntPeca2 * valorPeca2);
        System.out.printf("Valor a pagar = R$ %.2f", totPg);

    }
}
