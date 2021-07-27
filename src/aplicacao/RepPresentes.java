package aplicacao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import persistencia.ListaDAO;

import java.util.ArrayList;


public class RepPresentes {

    private final ObservableList<Presente> presentes;
    private final ListaDAO dao = new ListaDAO("Presentes.txt");

    public RepPresentes() {
        this.presentes = dao.carregar();
    }

    public void add(Presente presente) {
        this.presentes.add(presente);

        dao.salvar(this.presentes);
    }

    public void salvar() {
        dao.salvar(this.presentes);
    }

    public void remover(Presente presente) {
        this.presentes.remove(presente);

        dao.salvar(this.presentes);
    }

    public Presente getPresente(String categoria) {
        for (var i : presentes) {
            if (i.getCategoria() == categoria){
                return i;
            }
        }
        return null;
    }

    public ObservableList<Presente> getPresentes() {
        return presentes;
    }

    public ObservableList<String> getCategorias() {
        ArrayList<String> list = new ArrayList<String>();
        for(var i : this.presentes) {
            list.add(i.getCategoria());
        }
        ObservableList<String> temp = FXCollections.observableList(list);
        return temp;
    }

    public ObservableList<Presente> getList() {
        return presentes;
    }
}
