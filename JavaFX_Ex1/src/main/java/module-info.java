module br.dev.henrique.javafx_ex1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.dev.henrique.javafx_ex1 to javafx.fxml;
    exports br.dev.henrique.javafx_ex1;
}
