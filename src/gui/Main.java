package gui;

import aplicacao.RepGrupos;
import aplicacao.RepPessoas;
import aplicacao.RepPresentes;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    private static Stage stage;

    private static Scene mainScene;
    private static Scene pessoasScene;
    private static Scene gruposScene;
    private static Scene presentesScene;
    private static Scene sorteioScene;
    
    public static final RepPessoas repPessoas = new RepPessoas();
    public static final RepPresentes repPresentes = new RepPresentes();
    public static final RepGrupos repGrupos = new RepGrupos();


    @Override
    public void start(Stage primaryStage) throws Exception{

        var apelidos = new ArrayList<String>();

        stage = primaryStage;
        primaryStage.setTitle("Amigo Secreto");

        Parent fxmlMain = FXMLLoader.load(getClass().getResource("view/main.fxml"));
        mainScene = new Scene(fxmlMain, 640, 480);

        Parent fxmlPessoas = FXMLLoader.load(getClass().getResource("view/pessoas.fxml"));
        pessoasScene = new Scene(fxmlPessoas, 640, 480);

        Parent fxmlGrupos = FXMLLoader.load(getClass().getResource("view/grupos.fxml"));
        gruposScene = new Scene(fxmlGrupos, 640, 480);

        Parent fxmlPresentes = FXMLLoader.load(getClass().getResource("view/presentes.fxml"));
        presentesScene = new Scene(fxmlPresentes, 640, 480);

        Parent fxmlSorteio = FXMLLoader.load(getClass().getResource("view/sorteio.fxml"));
        sorteioScene = new Scene(fxmlSorteio, 640, 480);

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
            case "grupos":
                stage.setScene(gruposScene);
                stage.setTitle("Grupos");
                break;
            case "presentes":
                stage.setScene(presentesScene);
                stage.setTitle("Presentes");
                break;
            case "sorteio":
                stage.setScene(sorteioScene);
                stage.setTitle("Sorteio");
                break;
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
