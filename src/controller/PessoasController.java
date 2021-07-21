package controller;

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
        System.out.println("Botão cancelar pressionado.");

        Main.changeScreen("main");
    }

    @FXML
    protected void btSalvarAction (ActionEvent e) {
        System.out.println("Botão salvar pressionado.");


    }

}
