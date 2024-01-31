module org.cymbaled.skrybadesktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens org.cymbaled.skrybadesktop to javafx.fxml;
    exports org.cymbaled.skrybadesktop;
}