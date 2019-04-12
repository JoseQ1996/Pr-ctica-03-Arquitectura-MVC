/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.clases;

/**
 *
 * @author José Quinde
 */
public class Vehiculo {
    /*
    Variables a declarar clase Vehiculo
    */
    private int codigo;
    private String modelo;
    private String matricula;
    private String marca;

    /*
    Constructor vacio clase Vehiculo
    */
    public Vehiculo() {
    }
    /*
    Constructor con atributo codigo  clase Vehiculo
    */
    public Vehiculo(int codigo) {
        this.codigo = codigo;
    }
    /*
    Constructor con todos los atribulos clase Vehiculo
    */
    public Vehiculo(int codigo, String modelo, String matricula, String marca) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.matricula = matricula;
        this.marca = marca;
    }
    
    /*
    getters y setters de clase Vehiculo
    */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    /*
    metodo que imprime un mensaje que el vehiculo esta prendido
    */
    public void encender(){
        System.out.println("El vehiculo de modelo "+this.getModelo()+" y marca "+ this.getMarca()+" esta encendido");
    }
    /*
    metodo que imprime un mensaje que el vehiculo esta apagado
    */
    public void apagar(){
        System.out.println("El vehiculo de modelo "+this.getModelo()+" y marca "+ this.getMarca()+" esta apagado");
    }
    /*
    metodo que imprime un mensaje qdel estado del auto 
    */
    public void estado(){
        System.out.println("El vehiculo de modelo "+this.getModelo()+" y marca "+ this.getMarca()+" esta condiciones optimas para su funcionamiento");
    }
    /*
    toString de la clase Vehiculo
    */
    @Override
    public String toString() {
        return "Vehiculo\n" 
                + "Codigo: " + codigo +
                "\nModelo: " + modelo + 
                "\nMatricula: " + matricula + 
                "\nMarca: " + marca;
    }
    
    
}
