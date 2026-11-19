module com.ccasais.anchorthis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ccasais.anchorthis to javafx.fxml;
    exports com.ccasais.anchorthis;
}