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
public class Jogador implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private List<Habilidade> listHabilidades;

	@Override
	public String toString() {
		return nome + "\n"
			+ "             Habilidades = " + listHabilidades + "\n           ";
	}
}
