package entities;

import java.util.Scanner;
import application.Estudante;
import java.util.Locale;

public class EstudanteTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		Estudante estudante = new Estudante();
		System.out.println("Qual seu nome? ");
		estudante.setNome(leitor.nextLine());

		System.out.println("Qual sua idade? ");
		estudante.setIdade(leitor.nextInt());

		System.out.println("Digite suas notas abaixo:");
		estudante.setNota1(leitor.nextDouble());
		estudante.setNota2(leitor.nextDouble());
		estudante.setNota3(leitor.nextDouble());
		estudante.setNota4(leitor.nextDouble());
		System.out.println(estudante);
		if (estudante.tirarMedia() >= 7.0) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		leitor.close();
	}
}
