package aplicacao;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import persistencia.ListaDAO;

import java.util.ArrayList;


public class RepPessoas {

    private final ObservableList<Pessoa> pessoas;
    private final ListaDAO dao = new ListaDAO("Pessoas.txt");

    public RepPessoas() { this.pessoas = dao.carregar(); }

    public void add(Pessoa pessoa) {
        this.pessoas.add(pessoa);

        dao.salvar(this.pessoas);
    }

    public void salvar() {
        dao.salvar(this.pessoas);
    }

    public Pessoa getPessoa(String apelido) {
        var temp = new Pessoa("", apelido, "");
        for (var i : pessoas){
            if(temp.equals(i)){
                return i;
            }
        }
        return null;
    }

    public void remover(Pessoa pessoa) {
        this.pessoas.remove(pessoa);

        dao.salvar(this.pessoas);
    }

    public ObservableList<Pessoa> getPessoas() {
        return pessoas;
    }

    public ObservableList<String> getApelidos() {
        ArrayList<String> list = new ArrayList<String>();
        for(var i : this.pessoas) {
            list.add(i.getApelido());
        }
        ObservableList<String> temp = FXCollections.observableList(list);
        return temp;
    }

    public ObservableList<Pessoa> getList() {
        return pessoas;
    }
}
