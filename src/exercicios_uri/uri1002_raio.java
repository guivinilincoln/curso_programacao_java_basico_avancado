package exercicios_uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1002_raio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area = sc.nextDouble();
		
		area = Math.PI * (area * 2);
		
		System.out.printf(Locale.US, "A= %.4f%n", area);

		sc.close();
	}

}
