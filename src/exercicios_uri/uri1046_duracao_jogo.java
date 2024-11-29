package exercicios_uri;

import java.util.Scanner;

public class uri1046_duracao_jogo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();

        int duracao;
        if(horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }else {
            duracao = 24 - horaFinal + horaInicial;
        }

        System.out.println("O JOGO DUROU " + duracao + "HORAS(S)");

        entrada.close();
    }
}
