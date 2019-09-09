package br.com.alura.forum.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String categoria;

	// construtor default exigido pela JPA
	protected Curso() {
	}


	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSubcategoria() {
		return categoria;
	}

}
