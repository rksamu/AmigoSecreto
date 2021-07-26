package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GruposController {

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
        System.out.println("Botão cancelar pressionado.");

        Main.changeScreen("main");
    }

    @FXML
    protected void btSalvarAction (ActionEvent e) {
        System.out.println("Botão salvar pressionado.");



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



    }

    @FXML
    protected void btDelAction (ActionEvent e) {
        System.out.println("Botão Del pressionado.");



    }

    @FXML
    protected void btSalvarPessoasAction (ActionEvent e) {
        System.out.println("Botão Salvar (Presentes das Pessoas) pressionado.");



    }
}
