/**
 Classe responsável por apresentar notificações
 */

package com.example.mercadindofundao.More;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import java.util.Optional;

public class PopUp {


    public static void MostrarPopUp(String titulo, String cabecalho, String mensagem, Alert.AlertType tipo){

        Alert notificacao = new Alert(tipo);
        notificacao.setTitle(titulo);
        notificacao.setHeaderText(cabecalho);
        notificacao.setContentText(mensagem);
        notificacao.show();
    }

    public static Optional<ButtonType> mostrarConfirmacao(String titulo, String mensagem){
        Alert confirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        confirmacao.setTitle(titulo);
        confirmacao.setHeaderText(null);
        confirmacao.setContentText(mensagem);
        return confirmacao.showAndWait();
    }

}
