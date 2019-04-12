/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.clases;

import est.ups.edu.ec.interfaces.Acciones;

/**
 *
 * Esta clase instancia los atributos,getters y setters,constructores y metodos de la clase hija Helicoptero
 *
 * @author José Quinde
 */
public final class Helicoptero extends Aereos implements Acciones {
    /**
    *Declaracion variables clase Helicoptero
    */
    private double velocidadHelice;
    private int numeroRotores;
    private int numeroHelices;
    private double anchoCabina;
    
    /**
    *Constructor vacio clase Helicoptero
    */
    public Helicoptero() {
    }

    /**
    *Constructor con atributo codigo de la clase abuelo Vehiculo
     */
    public Helicoptero(int codigo) {
        super(codigo);
    }

    /**
    *Constructor con los atributos de la clase abuelo Vehiculo, de la clase padre Aereos y de la clase hija Helicoptero
     */
    public Helicoptero(double velocidadHelice, int numeroRotores, int numeroHelices, double anchoCabina, int numeroMotores, int numeroAsientos, double elevacionMaxima, double cargaMaxima, int codigo, String modelo, String matricula, String marca) {
        super(numeroMotores, numeroAsientos, elevacionMaxima, cargaMaxima, codigo, modelo, matricula, marca);
        this.velocidadHelice = velocidadHelice;
        this.numeroRotores = numeroRotores;
        this.numeroHelices = numeroHelices;
        this.anchoCabina = anchoCabina;
    }

    /**
    *Getters y Setters clase Helicoptero
     */
    public double getVelocidadHelice() {
        return velocidadHelice;
    }

    public void setVelocidadHelice(double velocidadHelice) {
        this.velocidadHelice = velocidadHelice;
    }

    public int getNumeroRotores() {
        return numeroRotores;
    }

    public void setNumeroRotores(int numeroRotores) {
        this.numeroRotores = numeroRotores;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    public double getAnchoCabina() {
        return anchoCabina;
    }

    public void setAnchoCabina(double anchoCabina) {
        this.anchoCabina = anchoCabina;
    }
    /**
    *Metodo que indica si e helicoptero esta en movimiento
    */
    public void enMovimiento(){
        System.out.println("El Helicoptero de modelo "+this.getModelo()+" con el numero de rotores de "+this.getNumeroRotores()+" esta en movimiento");
    }
    /**
    *Metodo que indica si e helicoptero esta en reposo
    */
     public void enReposo(){
        System.out.println("El Helicoptero de modelo "+this.getModelo()+" con el numero de rotores de "+this.getNumeroRotores()+" esta en reposo");
    }
    /**
    *Metodo abstracto que indica el promedio de tiempo de vuelo de un helicoptero devuelve un valor 14,16 es el valor que devuelde ya que es un double
     */
    @Override
    public double tiempoDeVuelo() {
        return 14.16;
    }
    /**
    *Metodo de la clase interface que indica si gira a la derecha
    */
     @Override
    public void girarDerecha() {
        System.out.println("El Helicoptero de modelo "+this.getModelo()+" esta girando a la derecha");
    }
    /**
    *Metodo de la clase interface que indica que gira a la izquierda
     */
    @Override
    public void girarIzquierda() {
        System.out.println("El Helicoptero de modelo "+this.getModelo()+" esta girando a la izquierda");
    }

    /**
    *ToString que imprime los atributos de la clase abuelo Vehiculo,de la calase padre Aereos y de la clase hija Helicoptero
     */
    @Override
    public String toString() {
        return super.toString()+"\nHelicoptero\n" + 
                "Velocidad De La Helice: " + velocidadHelice +" km/h"+
                "\nNumero De Rotores: " + numeroRotores + 
                "\nNumero De Helices: " + numeroHelices + 
                "\nAncho De Cabina: " + anchoCabina + " m";
    }
    
}
