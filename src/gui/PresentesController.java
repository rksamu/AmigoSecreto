package gui;

import aplicacao.Presente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PresentesController {

    @FXML
    private TextField categoria;

    @FXML
    private TextField preco;

    @FXML
    private TextField descricao;

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
    protected void btSorteioAction (ActionEvent e) {
        System.out.println("Botão Sorteio pressionado.");

        Main.changeScreen("sorteio");
    }

    @FXML
    protected void btSalvarAction (ActionEvent e) {
        System.out.println("Botão Salvar pressionado.");

        if(categoria != null && descricao != null && preco != null) {
            var pessoa = new Presente(
                    categoria.getText(),
                    descricao.getText(),
                    Float.parseFloat(preco.getText())
            );
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
