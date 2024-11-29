package exercicios_uri;

import java.util.Scanner;

public class uri1044_multipos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("SÃO MULTIPOS");
        }else {
            System.out.println("NÃO SÃO MULTIPOS");
        }
    }
}
