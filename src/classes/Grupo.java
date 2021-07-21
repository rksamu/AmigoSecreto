package classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Grupo {

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

    public ArrayList<Pessoa> getParticipantes() {
        return participantes;
    }
}
