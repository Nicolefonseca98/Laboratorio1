
package laboratorio1;

import static Lista.ListaFrutas.listaFrutas;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Nicole
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML private Label frutaInicial;
    @FXML private ComboBox seleccionarFruta;
    @FXML private ComboBox operacion;
    @FXML private Label resultado;
    @FXML private TextField recibeNombreFruta;
    @FXML private Label mensaje;
    @FXML private ImageView imagenNaranja;
    @FXML private ImageView imagenLimon;
    @FXML private ImageView imagenSandia;
    
    
    @FXML private void aplicarOperacion(ActionEvent event) {
        Logica logica = new Logica();
        Frutas resultadoSuma = logica.sumarFrutas(Frutas.valueOf(frutaInicial.getText()), Frutas.valueOf(seleccionarFruta.getValue().toString()));
        resultado.setText(resultadoSuma.toString());
        
        /*Cuando se determina el primer resultado 
        * este pasa a ser la primera fruta para la suma
        */
        frutaInicial.setText(resultadoSuma.toString());
    }
  
    @FXML private void agregaFrutas(ActionEvent event) {
         listaFrutas.add(recibeNombreFruta.toString());
         mensaje.setText("Fruta Agregada");
         System.out.println(listaFrutas.toString());
         recibeNombreFruta.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        Image naranja = new Image("/imagen/naranja.png");
        imagenNaranja.setImage(naranja);
        Image sandia = new Image("/imagen/sandia.png");
        imagenSandia.setImage(sandia);
        Image limon = new Image("/imagen/limon.png");
        imagenLimon.setImage(limon);
        
        //Primer fruta al azar
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            Frutas randomFrutas = Frutas.values()[random.nextInt(Frutas.values().length)];
            System.out.println(randomFrutas);
            frutaInicial.setText(randomFrutas.toString());
            
        }
        
       seleccionarFruta.setValue("Seleccione una fruta");
       //Agrega los 5 tipos de frutas al ComboBox para que el usuario elija la segunda fruta para la suma
       seleccionarFruta.getItems().addAll(Frutas.MANZANA , Frutas.PERA, Frutas.LIMÓN, Frutas.MELÓN, Frutas.NARANJA);
     
       operacion.setValue("Seleccione operación");
       operacion.getItems().add("Suma");
       
        listaFrutas.add(Frutas.MANZANA.toString());
        listaFrutas.add(Frutas.PERA.toString());
        listaFrutas.add(Frutas.LIMÓN.toString());
        listaFrutas.add(Frutas.MELÓN.toString());
        listaFrutas.add(Frutas.NARANJA.toString());
        System.out.println(listaFrutas.toString());
    }   
   
    

}
