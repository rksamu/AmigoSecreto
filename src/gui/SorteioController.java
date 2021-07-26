package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SorteioController {

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
