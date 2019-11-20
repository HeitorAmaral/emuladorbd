package br.com.fatec.emuladorbd;

import java.util.Scanner;

import br.com.fatec.emuladorbd.service.Registro;

public class Main {

	public static void main(String[] args) {

		int option = 0;
		Registro registro = new Registro();
		Scanner scanner = new Scanner(System.in);
		while (option != 5) {
			System.out.println("*************************");
			System.out.println("1 - Inserir novo registro");
			System.out.println("2 - Exibir registros salvos");
			System.out.println("3 - Editar um registro");
			System.out.println("4 - Excluir um registro");
			System.out.println("5 - Finalizar o programa");
			System.out.println("*************************\n");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				try {
					registro.save();
					System.out.println("Time salvo com sucesso!");
				} catch (Exception e) {
					e.getMessage();
				}
				break;

			case 2:
				System.out.println("Exibindo dados!");
				break;

			case 3:
				System.out.println("Atualizando dados!");
				break;

			case 4:
				System.out.println("Deletando dados");
				break;

			case 5:
				System.out.println("Encerrando aplicação");
				break;

			default:
				System.out.println("Caractere invalido!");
			}
		}
	}
}