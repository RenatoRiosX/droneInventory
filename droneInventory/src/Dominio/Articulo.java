
package Dominio;

import java.io.Serializable;

/*
 *@autor Kevin Helle - Estudiante: 208084;
 *@autor  Renato Rios - Estudiante: 270586;
 */
public class Articulo implements Serializable{
    
    private String nombre;
    private String descripcion;
    
    
    //Constructor
    public Articulo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        
    }

    //Metodos Get y Set
    public String getNombre() {
        return nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  nombre;
    }
     
    
}
