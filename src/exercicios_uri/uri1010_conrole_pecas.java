package exercicios_uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1010_conrole_pecas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] codigoProduto = new int[2];
        int[] quantidadeEstoque = new int[2];
        double[] precoUnitario = new double[2];
        double[] valorTotalItem = new double[2];

        for( int i = 0; i < 2 ; i++){
            codigoProduto[i] = entrada.nextInt();
            quantidadeEstoque[i] = entrada.nextInt();
            precoUnitario[i] = entrada.nextDouble();
            valorTotalItem[i] = precoUnitario[i] * quantidadeEstoque[i];
        }

        double valotTotal = valorTotalItem[0] + valorTotalItem[1];

        System.out.printf(Locale.US, "VALOR TOTAL: R$ %.2f%n", valotTotal);


        entrada.close();

    }
}
