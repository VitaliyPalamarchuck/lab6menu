module org.example.lab6menu {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab6menu to javafx.fxml;
    exports org.example.lab6menu;
}