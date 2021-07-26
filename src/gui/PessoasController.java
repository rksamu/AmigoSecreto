package gui;

import aplicacao.Pessoa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
        var pessoa = new Pessoa(
                nomeCompleto.getText(),
                apelido.getText(),
                senha.getText()
        );


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
