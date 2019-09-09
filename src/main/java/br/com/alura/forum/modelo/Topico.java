package br.com.alura.forum.modelo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Topico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	private String titulo;
	private String mensagem;

	@ManyToOne
	private Curso curso;

	@ManyToOne
	private Usuario autor;

	@OneToMany(mappedBy = "topico")
	private List<Resposta> respostas = new ArrayList<>();
	@Enumerated(EnumType.STRING)
	private StatusTopico status = StatusTopico.NAO_RESPONDIDO;

	// construtor default exigido pela JPA
	protected Topico() {
	}

	// getters
	public Long getId() {
		return id;
	}

	public LocalDateTime getData() {
		return dataCriacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Curso getCurso() {
		return curso;
	}

	public Usuario getAutor() {
		return autor;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public StatusTopico getStatus() {
		return status;
	}

}
