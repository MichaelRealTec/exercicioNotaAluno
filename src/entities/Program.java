package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Programa para calcular duas notas de um aluno
		Double nota1;
		Double nota2;
		Double media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		while(nota1 < 0 || nota1 > 10) {
			System.out.print("Valor inválido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		while(nota2 < 0 || nota2 > 10) {
			System.out.print("Valor inválido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}
		media = (nota1 + nota2) / 2.00;
		System.out.printf("MEDIA = %.2f%n", media);
		
			
		sc.close();
	}

}
