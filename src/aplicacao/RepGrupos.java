package aplicacao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import persistencia.ListaDAO;

import java.util.ArrayList;


public class RepGrupos {

    private final ObservableList<Grupo> grupos;
    private final ListaDAO dao = new ListaDAO("Grupos.txt");

    public RepGrupos() { this.grupos = dao.carregar(); }

    public void add(Grupo grupo) {
        this.grupos.add(grupo);

        dao.salvar(this.grupos);
    }

    public void salvar() {
        dao.salvar(this.grupos);
    }

    public Grupo getGrupo(String nome) {
        var temp = new Grupo(nome, null);
        for (var i : grupos){
            if(temp.equals(i)){
                return i;
            }
        }
        return null;
    }

    public void remover(Grupo grupo) {
        this.grupos.remove(grupo);

        dao.salvar(this.grupos);
    }

    public ObservableList<Grupo> getGrupos() {
        return grupos;
    }

    public ObservableList<String> getNomes() {
        ArrayList<String> list = new ArrayList<String>();
        for(var i : this.grupos) {
            list.add(i.getNome());
        }
        ObservableList<String> temp = FXCollections.observableList(list);
        return temp;
    }

    public ObservableList<Grupo> getList() {
        return grupos;
    }
}
