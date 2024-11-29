package exercicios_uri;

import java.util.Scanner;

public class cond02_par_impar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
