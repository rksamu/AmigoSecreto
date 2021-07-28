package aplicacao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.util.ArrayList;

public class Pessoa implements Serializable {

    private String nome;
    private String apelido;
    private String senha;
    private ArrayList<Presente> desejos;

    public Pessoa(String nome, String apelido, String senha) {
        this.nome = nome;
        this.apelido = apelido;
        this.senha = senha;
        this.desejos = new ArrayList<Presente>();
    }

    public String getApelido() {
        return apelido;
    }

    public ObservableList <String> getDesejos() {
        var temp = new ArrayList<String>();
        for (var i : this.desejos) {
            temp.add(i.getCategoria());
        }
        return FXCollections.observableList(temp);
    }

    public void addPresente(Presente presente) {
        this.desejos.add(presente);
    }

    public void removePresente(Presente presente) {
        Presente temp = null;
        for(var i : desejos){
            if(i.equals(presente)){
                temp = i;
            }
        }
        desejos.remove(temp);
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
