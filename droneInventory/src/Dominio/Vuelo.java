package Dominio;

import java.io.Serializable;
import java.util.*;

/**
 * @autor Kevin Helle - Estudiante: 208084;
 * @autor Renato Rios - Estudiante: 270586;
 */
public class Vuelo implements Serializable {

    private String IdArea;
    private int nroDeFila;
    private ArrayList<Integer> listaDeCodigos;
    private String nombreDeArchivo;
    private boolean VueloExitoso;
    private int cantidadDeCargas;
    private int coincidencias;
    private int diferencias;

    public Vuelo(String IdArea, int fila, ArrayList lstCodigos, String nombreDeArchivo, boolean esExitoso,
            int coincidencias, int diferencias,int cantidadDeCargas) {
        this.IdArea = IdArea;
        this.nroDeFila = fila;
        this.listaDeCodigos = lstCodigos;
        this.nombreDeArchivo = nombreDeArchivo;
        this.VueloExitoso = esExitoso;
        this.coincidencias = coincidencias;
        this.diferencias = diferencias;
        this.cantidadDeCargas = cantidadDeCargas;
    }

    //Metodos Get
    public String getArea() {
        return IdArea;
    }

    public int getNroDeFila() {
        return nroDeFila;
    }

    public String getNombreDeArchivo() {
        return nombreDeArchivo;
    }

    public ArrayList<Integer> getListaDeCodigos() {
        return listaDeCodigos;
    }

    public String getIdArea() {
        return IdArea;
    }

    public boolean getVueloExitoso() {
        return VueloExitoso;
    }

    public int getCantidadDeCargas() {
        return cantidadDeCargas;
    }

    public int getCoincidencias() {
        return coincidencias;
    }

    public int getDiferencias() {
        return diferencias;
    }
    
    //Metodos Set
    public void setArea(String area) {
        this.IdArea = area;
    }

    public void setIdArea(String IdArea) {
        this.IdArea = IdArea;
    }

    public void setVueloExitoso(boolean VueloExitoso) {
        this.VueloExitoso = VueloExitoso;
    }

    public void setNroDeFila(int nroDeFila) {
        this.nroDeFila = nroDeFila;
    }

    public void setListaDeCodigos(ArrayList<Integer> listaDeCodigos) {
        this.listaDeCodigos = listaDeCodigos;
    }

    public void setNombreDeArchivo(String nombreDeArchivo) {
        this.nombreDeArchivo = nombreDeArchivo;
    }

    public void setCantidadDeCargas(int cantidadDeCargas) {
        this.cantidadDeCargas = cantidadDeCargas;
    }
    public void setCoincidencias(int coincidencias) {
        this.coincidencias = coincidencias;
    }
    
    public void setDiferencias(int diferencias) {
        this.diferencias = diferencias;
    }

}
