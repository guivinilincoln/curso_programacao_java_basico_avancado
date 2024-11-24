package exercicios;

import java.util.Scanner;

public class uri1002_raio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area = sc.nextDouble();
		
		area = Math.PI * (area * 2);
		
		System.out.printf("A= %.4f%n", area);
		
		sc.close();
	}

}
