
package laboratorio1;

import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import javafx.scene.control.Label;

/**
 *
 * @author Nicole
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML private Label frutaInicial;
    @FXML private ComboBox seleccionarFruta;
    @FXML private ComboBox operacion;
    @FXML private Label resultado;
    
    public static ArrayList<String> listaFrutas = new ArrayList<>();
    
    @FXML private void aplicarOperacion(ActionEvent event) {
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       seleccionarFruta.setValue("Seleccione una futa");
       seleccionarFruta.getItems().addAll(Frutas.Manzana , Frutas.Pera, Frutas.Limón, Frutas.Melón, Frutas.Naranja);
     
       operacion.setValue("Seleccione operación");
       operacion.getItems().add("Suma");
       
       Hashtable<String,String> a = new Hashtable<>();
       
        
    }   
    
    
}
