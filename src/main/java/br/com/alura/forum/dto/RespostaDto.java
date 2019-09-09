package br.com.alura.forum.dto;

import br.com.alura.forum.modelo.Resposta;

import java.time.LocalDateTime;

/**
 * @author george on 09/09/2019
 * @project forum
 */
public class RespostaDto {

    private Long id;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;

    public RespostaDto(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriacao = resposta.getData();
        this.nomeAutor = resposta.getDono().getNome();
    }

    public Long getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
}
