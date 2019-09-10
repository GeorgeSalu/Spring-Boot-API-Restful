package br.com.alura.forum.dto;

/**
 * @author george on 10/09/2019
 * @project forum
 */
public class TokenDto {

    private String token;
    private String tipo;

    public TokenDto(String token, String tipo) {
        this.token = token;
        this.tipo = tipo;
    }

    public String getToken() {
        return token;
    }

    public String getTipo() {
        return tipo;
    }
}
