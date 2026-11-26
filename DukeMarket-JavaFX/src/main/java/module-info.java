module br.dev.henrique.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires java.sql;
    
    opens br.dev.henrique.dukemarket.javafx to javafx.fxml;
    opens br.dev.henrique.dukemarket.javafx.controller to javafx.fxml;
    opens br.dev.henrique.dukemarket.javafx.model to javafx.base;
    
    exports br.dev.henrique.dukemarket.javafx;
    exports br.dev.henrique.dukemarket.javafx.controller;
    exports br.dev.henrique.dukemarket.javafx.DAO;
    exports br.dev.henrique.dukemarket.javafx.model;
    exports connection;
    
    requires mysql.connector.java;
}
