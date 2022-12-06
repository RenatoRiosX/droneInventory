
package Dominio;

import java.io.Serializable;
import java.util.*;

/**
 *@autor Kevin Helle - Estudiante: 208084;
 *@autor  Renato Rios - Estudiante: 270586;
 */
public class Dron implements Serializable{
    private String identificacion;
    private String modeloDron;
    private int tipoDeCamara;
    private ArrayList<Vuelo> listaVuelos;

    public Dron(String identificacion, String modelo, int tipoDeCamara) {        
        this.identificacion = identificacion;
        this.modeloDron = modelo;
        this.tipoDeCamara = tipoDeCamara;
        this.listaVuelos = new ArrayList<>();
    }
    
    //getters
    public String getIdentificacion() {
        return identificacion;
    }

     public int getTipoDeCamara() {
        return tipoDeCamara;
    }

    public String getModelo() {
        return modeloDron;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }
    
     public void setVuelo(Vuelo vuelo ) {
        this.listaVuelos.add(vuelo);
    }

    //setters
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public void setTipoDeCamara(int tipoDeCamara) {
        this.tipoDeCamara = tipoDeCamara;
    }
    
    public void setModelo(String modelo) {
        this.modeloDron = modelo;
    }
    
    @Override
    public String toString(){
        return "Identificacion: "+this.identificacion+", Modelo: "+this.modeloDron;
    }
    
}
