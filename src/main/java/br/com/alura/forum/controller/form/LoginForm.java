package br.com.alura.forum.controller.form;

/**
 * @author george on 10/09/2019
 * @project forum
 */
public class LoginForm {

    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
