package gui;

import aplicacao.Pessoa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static gui.Main.repPessoas;
import static gui.Main.repPresentes;

public class PessoasController { //implements Initializable {

    @FXML
    private TextField nomeCompleto;

    @FXML
    private TextField senha;

    @FXML
    private TextField apelido;

    @FXML
    private Label aviso;

    @FXML
    private ChoiceBox<String> choiceBox = new ChoiceBox<String>();

    @FXML
    private ListView<String> listaPresentes = new ListView();

    @FXML
    private ListView<String> listaPresentesPessoa = new ListView();

    @FXML
    private void initialize() {
        choiceBox.setItems(repPessoas.getApelidos());
        choiceBox.setOnAction(this::attList);
        listaPresentes.setItems(repPresentes.getCategorias());
    }

    private void attList(ActionEvent e) {
        if(choiceBox.getValue() != null) {
            listaPresentesPessoa.setItems(repPessoas.getPessoa(choiceBox.getValue()).getDesejos());
        }
    }

    @FXML
    protected void btCancelarAction (ActionEvent e) {
        System.out.println("Botão Cancelar pressionado.");

        Main.changeScreen("main");
    }

    @FXML
    protected void btPresentesAction (ActionEvent e) {
        System.out.println("Botão Presentes pressionado.");

        Main.changeScreen("presentes");
    }

    @FXML
    protected void btGruposAction (ActionEvent e) {
        System.out.println("Botão Grupos pressionado.");

        Main.changeScreen("grupos");
    }

    @FXML
    protected void btSorteioAction (ActionEvent e) {
        System.out.println("Botão Sorteio pressionado.");

        Main.changeScreen("sorteio");
    }

    @FXML
    protected void btAtualizarAction (ActionEvent e) {
        System.out.println("Botão Atualizar pressionado.");

        this.initialize();
    }

    @FXML
    protected void btSalvarAction (ActionEvent e) {
        System.out.println("Botão Salvar pressionado.");
        if (nomeCompleto != null && apelido != null && senha!=null) {
            var pessoa = new Pessoa(
                    nomeCompleto.getText(),
                    apelido.getText(),
                    senha.getText()
            );
            var doIt = true;
            for (Pessoa i : repPessoas.getPessoas()) {
                if (pessoa.equals(i)) {
                    doIt = false;
                    break;
                }
            }
            if (doIt) {
                repPessoas.add(pessoa);
                this.initialize();
            }
            else {
                System.out.println("Apelido em uso.");
            }
        }

    }

    @FXML
    protected void btAddAction (ActionEvent e) {
        System.out.println("Botão Add pressionado.");
        if(choiceBox.getValue() != null) {
            var pessoa = repPessoas.getPessoa(choiceBox.getValue());
            var presente = repPresentes.getPresente(listaPresentes.getSelectionModel().getSelectedItem());
            var doIt = true;
            for (var i : pessoa.getDesejos()) {
                if(i.equals(presente.getCategoria())) {
                    doIt = false;
                    break;
                }
            }
            if (presente != null && doIt) {
                pessoa.addPresente(presente);
            }
        }
        this.attList(e);
    }

    @FXML
    protected void btDelAction (ActionEvent e) {
        System.out.println("Botão Del pressionado.");
        if(choiceBox.getValue() != null) {
            var pessoa = repPessoas.getPessoa(choiceBox.getValue());
            var presente = repPresentes.getPresente(listaPresentesPessoa.getSelectionModel().getSelectedItem());
            if (presente != null) {
                System.out.println(1);
                pessoa.removePresente(presente);
            }
        }
        this.attList(e);
    }

    @FXML
    protected void btSalvarPresentesAction (ActionEvent e) {
        System.out.println("Botão Salvar (Presentes das Pessoas) pressionado.");
        repPessoas.salvar();
    }

}
