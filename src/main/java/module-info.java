module org.example.erp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.naming;
    requires lombok;
    requires jakarta.persistence;


    opens org.example.erp to javafx.fxml;
    exports org.example.erp;
    exports org.example.erp.controller;
    opens org.example.erp.controller to javafx.fxml;
}
