package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListaDAO {

    private final String nomeDoArquivo;

    public ListaDAO(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }


    public ObservableList carregar() {
        System.out.println("Carregando " + nomeDoArquivo);

        try {
            var fis = new FileInputStream(nomeDoArquivo);

            try {
                var ois = new ObjectInputStream(fis);
                var arrayList = (ArrayList) ois.readObject();
                ois.close();

                System.out.println("Carregamento bem sucedido, conteúdo: " + arrayList + "\n");
                return FXCollections.observableArrayList(arrayList);
            }
            catch (IOException | ClassNotFoundException e) {
                System.out.println(String.format("Erro ao carregar %s, pode estar corrompido.",
                        nomeDoArquivo));
                e.printStackTrace();
                System.exit(-1);
                return null;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(nomeDoArquivo + " não existe, portanto nenhum dado foi carregado.");
            return FXCollections.observableArrayList();
        }
    }


    public void salvar(ObservableList obsList) {
        System.out.println("Salvando " + nomeDoArquivo);

        try {
            var fos = new FileOutputStream(nomeDoArquivo);
            var oos = new ObjectOutputStream(fos);
            oos.writeObject(new ArrayList(obsList));
            oos.flush();
            oos.close();
        }
        catch (IOException e) { e.printStackTrace(); }
    }
}