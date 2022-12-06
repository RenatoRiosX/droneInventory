
package Dominio;
import Interfaz.*;
import Persistencia.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *@autor Kevin Helle - Estudiante: 208084;
 *@autor  Renato Rios - Estudiante: 270586;
 */
public class ControlDeIntentario {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Sistema sistema = new Sistema();
        Persistir persistir = new Persistir();
        
        //Se recupera los datos al momento de cargar la ventana del menu  
        sistema = persistir.recuperarDatos(sistema);
        
        Menu ventanaPrincipal = new Menu(sistema);
        ventanaPrincipal.setVisible(true);
        
    }

}
