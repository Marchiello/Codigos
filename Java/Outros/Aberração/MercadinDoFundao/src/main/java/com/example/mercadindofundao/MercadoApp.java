/**
 Classe que executa o programa do mercado
 */

package com.example.mercadindofundao;

import com.example.mercadindofundao.More.Produto;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MercadoApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MercadinDoFundao.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1290, 768);
        stage.setTitle("Mercadin do Fundão KKKKK");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}