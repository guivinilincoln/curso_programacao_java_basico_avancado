package exercicios_uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1008_horas_trabalhadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idFuncionario = entrada.nextInt();
        double horasTrabalhadas = entrada.nextDouble();
        double salarioHora = entrada.nextDouble();

        double salarioBruto =  salarioHora * horasTrabalhadas;

        System.out.println("NUMBER = " + idFuncionario);
        System.out.printf(Locale.US, "SALARY = U$ %.2f%n", salarioBruto);

        entrada.close();

    }
}
