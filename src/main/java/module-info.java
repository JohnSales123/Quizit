module com.example.quizit {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires lombok;


    opens com.example.quizit to javafx.fxml;
    opens com.example.quizit.controller to javafx.fxml;

    exports com.example.quizit;
}