package gui;

import aplicacao.Pessoa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import static gui.Main.repPessoas;

public class PessoasController {

    @FXML
    private TextField nomeCompleto;

    @FXML
    private TextField senha;

    @FXML
    private TextField apelido;

    @FXML
    private Label aviso;

    @FXML
    private ChoiceBox<String> choiceBox = new ChoiceBox<String>(repPessoas.getApelidos());

    @FXML
    protected void btCancelarAction (ActionEvent e) {
        System.out.println("Botão Cancelar pressionado.");

        Main.changeScreen("main");
    }

    @FXML
    protected void btGruposAction (ActionEvent e) {
        System.out.println("Botão Grupos pressionado.");

        Main.changeScreen("grupos");
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
            }
            else {
                System.out.println(" Apelido em uso.");
            }
        }

    }

    @FXML
    protected void btAddAction (ActionEvent e) {
        System.out.println("Botão Add pressionado.");



    }

    @FXML
    protected void btDelAction (ActionEvent e) {
        System.out.println("Botão Del pressionado.");



    }

    @FXML
    protected void btSalvarPresentesAction (ActionEvent e) {
        System.out.println("Botão Salvar (Presentes das Pessoas) pressionado.");



    }

}
