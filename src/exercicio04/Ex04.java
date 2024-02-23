package exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numFuncionario, horasTabalhada;
        double valorHora, salario;

        System.out.print("Digite o número do funcionario: ");
        numFuncionario = sc.nextInt();
        System.out.print("Digite quantidade de horas trabalhada: ");
        horasTabalhada = sc.nextInt();
        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        salario = horasTabalhada * valorHora;
        System.out.println("Number = " + numFuncionario);
        System.out.printf("Salary = R$ %.2f", salario);
    }
}
