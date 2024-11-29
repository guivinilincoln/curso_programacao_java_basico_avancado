package exercicios_uri;

import java.util.Scanner;

public class cond01_negativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();

        if (a < 0) {
            System.out.println("Negativo");
        }else if(a >= 0) {
            System.out.println("Não Negativo");
        }
    }
}
