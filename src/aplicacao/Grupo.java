package aplicacao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Grupo implements Serializable {

    private String nome;
    private LocalDate dataSorteio;
    private ArrayList<Pessoa> participantes;

    public Grupo(String nome, LocalDate dataSorteio) {
        this.nome = nome;
        this.dataSorteio = dataSorteio;
        this.participantes = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        participantes.add(pessoa);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataSorteio() {
        return dataSorteio;
    }

    public void addPessoa(Pessoa pessoa) {
        this.participantes.add(pessoa);
    }

    public void removePessoa(Pessoa pessoa) {
        Pessoa temp = null;
        for(var i : participantes){
            if(i.equals(pessoa)){
                temp = i;
            }
        }
        participantes.remove(temp);
    }

    public ArrayList<Pessoa> getParticipantes() {
        return participantes;
    }

    public ObservableList<String> getPessoas() {
        var temp = new ArrayList<String>();
        for (var i : this.participantes) {
            temp.add(i.getApelido());
        }
        return FXCollections.observableList(temp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;
        Grupo grupo = (Grupo) o;
        return getNome().equals(grupo.getNome());
    }

}
