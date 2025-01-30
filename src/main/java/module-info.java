module com.example.game2d {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.game2d to javafx.fxml;
    exports com.example.game2d;
}