package es.ieslosmontecillos.componentes_cordobezcorina;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

import java.io.IOException;

public class Temporizador extends HBox {

    @FXML
    private Label lbTiempoRest;

    @FXML
    private Label lbTiempo;

    @FXML
    private Label lbUnidad;


    Timeline timeline;
    private IntegerProperty tiempo = new SimpleIntegerProperty(60);
    ObjectProperty<EventHandler<ActionEvent>> onFinished;

    public Temporizador() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("temporizador.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        tiempo.addListener((observable, oldValue, newValue) -> {
            System.out.println("Segundos: " + newValue);
        });
        lbTiempo.textProperty().bind(tiempo.asString());

        onFinished = new SimpleObjectProperty<>();

        onFinished.set(actionEvent -> {
            System.out.println("El contador ha finalizado." + tiempo);
        });
    }


    public void setTiempo(int t) {
        this.tiempo.set(t);
    }

    public int getTiempo() {
        return tiempo.get();
    }

    public IntegerProperty tiempoProperty() {
        return tiempo;
    }

    public void iniciar(){
        timeline = new Timeline();
        KeyValue kv = new KeyValue(tiempo,0);
        KeyFrame kf = new KeyFrame(Duration.seconds(tiempo.get()), kv);
        timeline.getKeyFrames().add(kf);
        System.out.println("Segundos: " + tiempo.get());
        timeline.play();
    }
}