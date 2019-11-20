package br.com.fatec.emuladorbd.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Habilidade implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;

	@Override
	public String toString() {
		return nome;
	}

}
