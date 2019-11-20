package br.com.fatec.emuladorbd.domain;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Time implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private List<Jogador> listJogadores;

	@Override
	public String toString() {
		return "Nome do Time = " + nome + ",\n"
			 + "Jogadores = " + listJogadores;
	}

}
