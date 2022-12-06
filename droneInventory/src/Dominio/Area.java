package Dominio;

import java.io.Serializable;

/**
 * @autor Kevin Helle - Estudiante: 208084;
 * @autor Renato Rios - Estudiante: 270586;
 */
public class Area implements Serializable {

    private String idArea;
    public Carga area[][];
    
    public Area(String idArea) {
        
        this.idArea = idArea;
        area = new Carga [12][10];

    }

    public String getIdArea() {
        return idArea;
    }
    
    public Carga [][] getArea() {
        return area;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }
}
