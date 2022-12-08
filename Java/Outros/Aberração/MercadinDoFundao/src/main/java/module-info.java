module com.example.mercadindofundao {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mercadindofundao to javafx.fxml;
    exports com.example.mercadindofundao;
}