
package Dominio;

import java.io.Serializable;

/**
 *@autor Kevin Helle - Estudiante: 208084;
 *@autor  Renato Rios - Estudiante: 270586;
 */
public class Carga implements Serializable{
    
    //Tiene como atributos un Funcionario y un Articulo
    private Articulo articulo;
    private Funcionario funcionario;
    private int cantidadDeArticulos;
    private int codigoCarga;
    
    //Contructores
    public Carga(Articulo articulo, Funcionario funcionario, int cantidadDeArticulos, int codigoManual) {
        this.articulo = articulo;
        this.funcionario = funcionario;
        this.cantidadDeArticulos = cantidadDeArticulos;
        this.codigoCarga = codigoManual;
    }
    
    public Carga(){
        this.articulo = null;
        this.funcionario = null;
        this.cantidadDeArticulos = 0;
        this.codigoCarga = 0;
    }
    

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getCantidadDeArticulos() {
        return cantidadDeArticulos;
    }

    public void setCantidadDeArticulos(int cantidadDeArticulos) {
        this.cantidadDeArticulos = cantidadDeArticulos;
    }

    public int getCodigoManual() {
        return codigoCarga;
    }

    public void setCodigoCarga (int codigoManual) {
        this.codigoCarga = codigoManual;
    }

    @Override
    public String toString() {
        return "Articulo=" + articulo + ", funcionario=" + funcionario + ", cantidadDeArticulos=" + cantidadDeArticulos + ", codigoCarga=" + codigoCarga;
    }
    
}
