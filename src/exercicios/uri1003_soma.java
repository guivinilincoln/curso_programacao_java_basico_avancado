package exercicios;

import java.util.Scanner;

public class uri1003_soma {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();
	}
}