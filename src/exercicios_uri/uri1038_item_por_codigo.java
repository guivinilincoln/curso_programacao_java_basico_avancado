package exercicios_uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1038_item_por_codigo{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigoDoItem = entrada.nextInt();
        int quantidadeSaidaItem = entrada.nextInt();
        double valorTotal = 0;

        if(codigoDoItem == 1){
            valorTotal = quantidadeSaidaItem * 4.00;
        }else if(codigoDoItem == 2){
            valorTotal = quantidadeSaidaItem * 4.50;
        }else if(codigoDoItem == 3){
            valorTotal = quantidadeSaidaItem * 5.00;
        }else if(codigoDoItem == 4){
            valorTotal = quantidadeSaidaItem * 2.00;
        }else if(codigoDoItem == 5){
            valorTotal = quantidadeSaidaItem * 1.50;
        }

        System.out.printf(Locale.US, "Total: R$ %.2f", valorTotal);


        entrada.close();
    }
}
