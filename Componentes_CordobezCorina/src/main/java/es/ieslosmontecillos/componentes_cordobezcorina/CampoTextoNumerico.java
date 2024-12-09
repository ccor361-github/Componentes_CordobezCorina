package es.ieslosmontecillos.componentes_cordobezcorina;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CampoTextoNumerico extends TextField
{
final Label label = new Label();

    public CampoTextoNumerico()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Componentes/CampoTextoNumerico.fxml"));
        fxmlLoader.setRoot(this);
    }

    @Override
    public void replaceText(int start, int end, String text)
    {
        if (!text.matches("[a-z, A-Z]"))
        {
            super.replaceText(start, end, text);
        }
        label.setText("Introduce una valor númerico");
    }
    @Override
    public void replaceSelection(String text)
    {
        if (!text.matches("[a-z, A-Z]"))
        {
            super.replaceSelection(text);
        }
    }

}