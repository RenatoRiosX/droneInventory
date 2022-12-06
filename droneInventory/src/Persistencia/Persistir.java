package Persistencia;
import java.io.*;
import Dominio.Sistema;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *@autor Kevin Helle - Estudiante: 208084;
 *@autor  Renato Rios - Estudiante: 270586;
 */

public class Persistir {
    
    public void almacenarDatos(Sistema elSistema) throws FileNotFoundException  {       
                   
        try {
            
            FileOutputStream archivo = new FileOutputStream("almacenSistema");
            ObjectOutputStream out = new ObjectOutputStream(archivo);
            
            out.writeObject(elSistema);
            out.close();
            
        } catch(FileNotFoundException e){
            //Si el archivo no fue encontrado, entonces se lo crea
            FileOutputStream archivo = new FileOutputStream("almacenSistema");
            
        } catch (IOException e) {
            
            //No se puede acceder al archivo. Se termina la ejecucion           
            System.exit(0);
            
        }

    }

    public Sistema recuperarDatos(Sistema sistema) throws FileNotFoundException  {     

        try {
            
            FileInputStream archivo = new FileInputStream("almacenSistema");
            ObjectInputStream in = new ObjectInputStream(archivo);
            
            sistema = (Sistema) in.readObject();
            in.close();
            
        } catch(FileNotFoundException e) {
            //Se crea un archivo nuevo
            FileOutputStream archivo = new FileOutputStream("almacenSistema");      
            
        } catch (IOException|ClassNotFoundException e) {
            
            //No se puede acceder al archivo.
        } 
            
        return sistema;
    }
    
    
}
