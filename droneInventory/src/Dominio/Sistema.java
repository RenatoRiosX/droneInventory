package Dominio;

import Interfaz.IngresoManual;
import java.io.Serializable;
import java.util.*;
import java.io.*;

/**
 * @autor Kevin Helle - Estudiante: 208084;
 * @autor Renato Rios - Estudiante: 270586;
 */
public class Sistema extends Observable implements Serializable {

    private ArrayList<Articulo> listaArticulos;
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<Dron> listaDrones;
    private Area listaAreas[];
    private HashMap<Integer,Integer> funcionarios;
    private HashMap<String,Integer> articulos;
    private HashMap<Integer,Integer> codigosDeCarga;
    
    private static final long serialVersionUID = 123456789;

    public Sistema() {
        
        listaArticulos = new ArrayList<>();
        listaFuncionarios = new ArrayList<>();
        listaDrones = new ArrayList<>();
        listaAreas = new Area[5];
        funcionarios = new HashMap();
        articulos = new HashMap();
        codigosDeCarga = new HashMap();
        
        String idAreas[] = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < 5; i++) {
            Area area = new Area(idAreas[i]);
            listaAreas[i] = area;

        }
        
        
    }
    
    public void notificarObservers(){
        //Por el patron observer
        setChanged();
        notifyObservers();
    }
    //Metodos para agregar objetos a su correspondiente lista
    public void agregarArticulo(Articulo unArticulo) {
        listaArticulos.add(unArticulo);
        notificarObservers();
    }

    public void agregarFuncionario(Funcionario unFuncionario) {
        listaFuncionarios.add(unFuncionario);
        notificarObservers();
    }

    public void agregarDron(Dron unDron) {
        listaDrones.add(unDron);
        notificarObservers();
    }

    //Metodos Get
    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public ArrayList<Dron> getListaDrones() {
        return listaDrones;
    }

    public Area[] getListaAreas() {
        return listaAreas;
    }

    public HashMap<Integer, Integer> getFuncionarios() {
        return funcionarios;
    }


    public HashMap<String, Integer> getArticulos() {
        return articulos;
    }

    public HashMap<Integer, Integer> getCodigosDeCarga() {
        return codigosDeCarga;
    }

    //Metodos Set
    public void setCodigosDeCarga(HashMap<Integer, Integer> codigosDeCarga) {
        this.codigosDeCarga = codigosDeCarga;
        notificarObservers();
    }
    
    public void setFuncionarios(HashMap<Integer, Integer> funcionarios) {
        this.funcionarios = funcionarios;
        notificarObservers();
    }
    
    public void setArticulos(HashMap<String, Integer> articulos) {
        this.articulos = articulos;
        notificarObservers();
    }
    
    public void setListaAreas(Area[] listaAreas) {
        this.listaAreas = listaAreas;
        notificarObservers();
    }
    
    public void crearArticulo(String nombre, String descripcion){
        Articulo articulo = new Articulo(nombre, descripcion);
        this.agregarArticulo(articulo);
    }
    
    public void crearDron (String identificacion, String modeloDron, int tipoDeCamara){
        Dron dron = new Dron(identificacion, modeloDron, tipoDeCamara);
        this.agregarDron(dron);
    }
    
    public void crearFuncionario(String nombre, int edad, int numeroDeFuncionario){
        Funcionario funcionario = new Funcionario(nombre, edad, numeroDeFuncionario);
        agregarFuncionario(funcionario);
    }
    
    public void crearVuelo(String idDron, String idArea, int fila,ArrayList<Integer> codigosVueloArchivo,String nombreArchivo,boolean vueloExitoso,int coincidencias,int diferencias,int cantidadDeCargas){
        Vuelo vuelo = new Vuelo(idArea,fila,codigosVueloArchivo,nombreArchivo,vueloExitoso,coincidencias,diferencias,cantidadDeCargas);
        this.cargarVueloDron(vuelo,idDron);
    }
    
    private void cargarVueloDron(Vuelo vuelo, String idDron){
        
        for (int i = 0; i < this.getListaDrones().size(); i++) {
            
            Dron dron = this.getListaDrones().get(i);
            if(dron.getIdentificacion().equals(idDron)){
                dron.setVuelo(vuelo);
            }
        }
        
    }
    
    public ArrayList<Funcionario> funcionariosSinCarga(){
        //Recorro la lista de funcionarios
            //Por cada funcionario recorro todas las areas
                //Si el funcionario no esta en ningun area, entonces lo guardo en funcionarios sin carga
        ArrayList<Funcionario> funcionariosSinCarga = new ArrayList();
        for (int i = 0; i < this.listaFuncionarios.size(); i++) {
           
            Funcionario fun = this.listaFuncionarios.get(i);
            int nroFun = fun.getNumeroFuncionario();
            boolean tieneCarga = false;
            
            for (int i2 = 0; i2 < this.listaAreas.length; i2++) {
                
                Carga matrizArea [][]= listaAreas[i2].getArea();
                
                for (int j = 0; j < matrizArea.length; j++) {
                    for (int k = 0; k < matrizArea[0].length; k++) {
                        
                        if( matrizArea[j][k] != null){
                            Funcionario funEnArea =  matrizArea[j][k].getFuncionario();
                        
                            if(funEnArea.getNumeroFuncionario()== nroFun){
                                tieneCarga = true;
                            }
                        }
                        
                    }
                    
                }
                
            
            }
            
            if(!tieneCarga){
                funcionariosSinCarga.add(fun);
            }
        }
        
        return funcionariosSinCarga;
    }
}
