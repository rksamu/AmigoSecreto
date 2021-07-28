package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class SorteioController {

    @FXML
    private ChoiceBox<String> choiceBoxGrupo = new ChoiceBox<String>();

    @FXML
    private ChoiceBox<String> choiceBoxPessoa = new ChoiceBox<String>();

    @FXML
    protected void btPessoasAction (ActionEvent e) {
        System.out.println("Botão pessoas pressionado.");

        Main.changeScreen("pessoas");
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
    protected void btSortearAction (ActionEvent e) {
        System.out.println("Botão Realizar sorteio pressionado.");


    }

}
