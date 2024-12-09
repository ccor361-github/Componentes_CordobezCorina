module es.ieslosmontecillos.componentes_cordobezcorina {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.componentes_cordobezcorina to javafx.fxml;
    exports es.ieslosmontecillos.componentes_cordobezcorina;
}