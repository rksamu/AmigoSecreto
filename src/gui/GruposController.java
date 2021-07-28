package gui;

import aplicacao.Grupo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

import static gui.Main.*;

public class GruposController {

    @FXML
    private TextField nome;

    @FXML
    private DatePicker data;

    @FXML
    private Label aviso;

    @FXML
    private ChoiceBox<String> choiceBox = new ChoiceBox<String>();

    @FXML
    private ListView<String> listaPessoas = new ListView();

    @FXML
    private ListView<String> listaPessoasGrupo = new ListView();


    @FXML
    protected void btCancelarAction (ActionEvent e) {
        System.out.println("Botão cancelar pressionado.");

        Main.changeScreen("main");
    }

    @FXML
    private void initialize() {
        choiceBox.setItems(repGrupos.getNomes());
        choiceBox.setOnAction(this::attList);
        listaPessoas.setItems(repPessoas.getApelidos());
    }

    private void attList(ActionEvent e) {
        if(choiceBox.getValue() != null) {
            listaPessoasGrupo.setItems(repGrupos.getGrupo(choiceBox.getValue()).getPessoas());
        }
    }

    @FXML
    protected void btSalvarAction (ActionEvent e) {
        System.out.println("Botão salvar pressionado.");
        if(this.nome != null && this.data != null) {
            var grupo = new Grupo(nome.getText(), data.getValue());
            var doIt = true;
            for(var i : repGrupos.getGrupos()){
                if(i.equals(grupo)){
                    doIt = false;
                    break;
                }
            }
            if(doIt){
                repGrupos.add(grupo);
                this.initialize();
            }
            else {
                System.out.println("Nome em uso.");
            }
        }



    }

    @FXML
    protected void btPessoasAction (ActionEvent e) {
        System.out.println("Botão pessoas pressionado.");

        Main.changeScreen("pessoas");
    }

    @FXML
    protected void btPresentesAction (ActionEvent e) {
        System.out.println("Botão Presentes pressionado.");

        Main.changeScreen("presentes");
    }

    @FXML
    protected void btSorteioAction (ActionEvent e) {
        System.out.println("Botão Sorteio pressionado.");

        Main.changeScreen("sorteio");
    }

    @FXML
    protected void btAddAction (ActionEvent e) {
        System.out.println("Botão Add pressionado.");
        if(choiceBox.getValue() != null) {
            var grupo = repGrupos.getGrupo(choiceBox.getValue());
            var pessoa = repPessoas.getPessoa(listaPessoas.getSelectionModel().getSelectedItem());
            var doIt = true;
            for (var i : grupo.getPessoas()) {
                if(i.equals(pessoa.getApelido())) {
                    doIt = false;
                    break;
                }
            }
            if (pessoa != null && grupo != null && doIt) {
                grupo.addPessoa(pessoa);
            }
        }
        this.attList(e);
    }

    @FXML
    protected void btDelAction (ActionEvent e) {
        System.out.println("Botão Del pressionado.");
        if(choiceBox.getValue() != null) {
            var grupo = repGrupos.getGrupo(choiceBox.getValue());
            var pessoa = repPessoas.getPessoa(listaPessoasGrupo.getSelectionModel().getSelectedItem());
            if (pessoa != null) {
                System.out.println(1);
                grupo.removePessoa(pessoa);
            }
        }
        this.attList(e);
    }

    @FXML
    protected void btSalvarPessoasAction (ActionEvent e) {
        System.out.println("Botão Salvar (Pessoas em grupo) pressionado.");
        repGrupos.salvar();
    }
}
