package es.ieslosmontecillos.componentes_cordobezcorina;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private final static Label mensaje = new Label();

    @Override
    public void start(Stage stage)
    {
        /*GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);



        final Label dollar = new Label("$");
        GridPane.setConstraints(dollar, 0, 0);
        grid.getChildren().add(dollar);

        final CampoTextoNumerico ctn = new CampoTextoNumerico();
        ctn.setPrefColumnCount(10);
        GridPane.setConstraints(ctn, 1, 0);
        grid.getChildren().add(ctn);

        Button enviar = new Button("Submit");
        GridPane.setConstraints(enviar, 2, 0);
        grid.getChildren().add(enviar);

        GridPane.setConstraints(mensaje, 0, 1);
        GridPane.setColumnSpan(mensaje, 3);
        grid.getChildren().add(mensaje);

        enviar.setOnAction((ActionEvent e) ->
        {
            mensaje.setText("Valor ingresado: $" + ctn.getText());
        });

         */
        StackPane root = new StackPane();
        Temporizador temporizador = new Temporizador();
        temporizador.iniciar();
        root.getChildren().add(temporizador);

        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);
        stage.setTitle("Campo Texto Númerico");
        stage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}