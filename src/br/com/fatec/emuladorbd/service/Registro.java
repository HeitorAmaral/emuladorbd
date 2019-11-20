package br.com.fatec.emuladorbd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fatec.emuladorbd.domain.Habilidade;
import br.com.fatec.emuladorbd.domain.Jogador;
import br.com.fatec.emuladorbd.domain.Time;

public class Registro {

	Boolean adicionarJogador = true;
	Boolean adicionarHabilidade = true;
	/*
	 * int contador = 0;
	 */
	Scanner scanner = new Scanner(System.in);

	public void save() {
		Time time = new Time();
		List<Jogador> listJogadores = new ArrayList();

		System.out.println("Insira o nome do time que deseja inserir (No máximo 50 caracteres):");
		time.setNome(scanner.nextLine());

		System.out.println("****Jogadores do Time****");

		String option = "";
		while (!option.equalsIgnoreCase("N")) {
			Jogador jogador = new Jogador();
			List<Habilidade> listHabilidades = new ArrayList();

			System.out.println("Insira o nome do jogador do time (No máximo 30 caracteres):");
			jogador.setNome(scanner.nextLine());

			System.out.println("****Habilidades do " + jogador.getNome() + "****");
			while (!option.equalsIgnoreCase("N")) {
				Habilidade habilidade = new Habilidade();
				System.out.println("Insira as habilidades do " + jogador.getNome() + " (No máximo 10 caracteres):");
				habilidade.setNome(scanner.nextLine());
				listHabilidades.add(habilidade);

				System.out.println("Você deseja inserir mais habilidades? (N para NÃO, S para SIM):");
				option = scanner.nextLine();
			}
			jogador.setListHabilidades(listHabilidades);
			listJogadores.add(jogador);
			System.out.println("Você deseja inserir mais um jogador? (N para NÃO, S para SIM):");
			option = scanner.nextLine();
		}
		time.setListJogadores(listJogadores);
		System.out.println(time.toString());
	}
}
