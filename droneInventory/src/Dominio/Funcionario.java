
package Dominio;

import java.io.Serializable;

/**
 *@autor Kevin Helle - Estudiante: 208084;
 *@autor  Renato Rios - Estudiante: 270586;
 */
public class Funcionario implements Serializable,Comparable<Funcionario>{
    private String nombre;
    private int edad;
    private int numeroFuncionario;
    
    //constructor

    public Funcionario(String nombre, int edad, int numeroFuncionario) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroFuncionario = numeroFuncionario;
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }
    
    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public int getEdad() {
        return edad;
    }
    
    //setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public String toString() {
        return this.nombre ;
    }
    
    
    @Override
    public int compareTo(Funcionario fun){
        Funcionario funcionario = (Funcionario) fun;
        return funcionario.getNombre() .compareTo( this.getNombre());
    }
    
}

