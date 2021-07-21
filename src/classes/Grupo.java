package classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Grupo {

    private String nome;
    private LocalDate dataSorteio;
    private ArrayList<Amigo> participantes;

    public Grupo(String nome, LocalDate dataSorteio) {
        this.nome = nome;
        this.dataSorteio = dataSorteio;
        this.participantes = new ArrayList<Amigo>();
    }

    public void adicionarPessoa(Amigo pessoa) {
        participantes.add(pessoa);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataSorteio() {
        return dataSorteio;
    }

    public ArrayList<Amigo> getParticipantes() {
        return participantes;
    }
}
