package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import javax.swing.text.html.ImageView;

public class Controller {

    @FXML
    private Button boton;

    @FXML
    private TextArea texto;


    @FXML
    private void pulsarboton(){
        boton.setText("Finalizar");
        texto.setText("Nombre:");
    }

    @FXML
    private void pulsarbotonedit(){
        boton.isCancelButton();

    }



}
