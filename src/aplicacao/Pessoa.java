package aplicacao;

import java.io.Serializable;
import java.util.ArrayList;

public class Pessoa implements Serializable {

    private String nome;
    private String apelido;
    private String senha;
    private ArrayList<Presente> desejos;
    //private Pessoa amigoSecreto;

    public Pessoa(String nome, String apelido, String senha) {
        this.nome = nome;
        this.apelido = apelido;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public boolean equals(Pessoa pessoa) {
        if (this == pessoa) { return true; }
        if (pessoa == null) { return false; }
        if (pessoa.getApelido().equals(this.apelido)) { return true; }
        return false;
    }

    @Override
    public String toString() {
        return String.format("{Pessoa: nome=\"%s\", apelido=\"%s\", senha=\"%s\"}", nome, apelido, senha);
    }
}
