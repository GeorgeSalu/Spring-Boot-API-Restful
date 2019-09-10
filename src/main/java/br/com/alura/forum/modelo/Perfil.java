package br.com.alura.forum.modelo;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil implements GrantedAuthority {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	// construtor default exigido pela JPA
	protected Perfil() {
	}

	public Perfil(String nome) {
		this.nome = nome;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String getAuthority() {
		return nome;
	}
}
