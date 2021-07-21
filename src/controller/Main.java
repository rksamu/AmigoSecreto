package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    private static Stage stage;

    private static Scene mainScene;
    private static Scene pessoasScene;



    @Override
    public void start(Stage primaryStage) throws Exception{

        var apelidos = new ArrayList<String>();

        stage = primaryStage;
        primaryStage.setTitle("Amigo Secreto");

        Parent fxmlMain = FXMLLoader.load(getClass().getResource("view/main.fxml"));
        mainScene = new Scene(fxmlMain, 640, 480);
        try {
            Parent fxmlPessoas = FXMLLoader.load(getClass().getResource("view/pessoas.fxml"));
            pessoasScene = new Scene(fxmlPessoas, 640, 480);
        }
		catch (IOException e) { e.printStackTrace(); }

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void changeScreen(String tela) {
        switch (tela) {
            case "main":
                stage.setScene(mainScene);
                stage.setTitle("Amigo Secreto");
                break;
            case "pessoas":
                stage.setScene(pessoasScene);
                stage.setTitle("Pessoas");
                break;
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
