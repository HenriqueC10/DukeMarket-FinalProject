package br.dev.henrique.dukemarket.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menuPrincipal"), 640, 480);
        stage.setScene(scene);

        stage.setTitle("DukeMarket");

        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        String caminho = "/br/dev/henrique/dukemarket/javafx/" + fxml + ".fxml";
        URL url = App.class.getResource(caminho);

        if (url == null) {
            throw new IOException("FXML nao encontrado no caminho: " + caminho);
        }

        FXMLLoader fxmlLoader = new FXMLLoader(url);
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}