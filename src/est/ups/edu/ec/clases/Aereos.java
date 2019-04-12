/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.clases;

/**
 *
 * Esta clase instancia los atributos,getters y setters,constructores y metodos de la clase padre Aereos
 * 
 * @author José Quinde
 */
public abstract class Aereos extends Vehiculo {
    /**
    *Declaracion variables clase Aereos
    */
    private int numeroMotores;
    private int numeroAsientos;
    private double elevacionMaxima;
    private double cargaMaxima;
    
    /**
    *Constructor vacio clase Aereos
     */
    public Aereos() { //Constructor vacio
    }

    /**
    *Constructor atributo codigo de clase padre Vehiculo
     */
    public Aereos(int codigo) {
        super(codigo);
    }

    /**   
    *Constructor pide todos los atributos de la clase padre Vehiculo y tambien los atributos de Aereos
    */
    public Aereos(int numeroMotores, int numeroAsientos, double elevacionMaxima, double cargaMaxima, int codigo, String modelo, String matricula, String marca) {
        super(codigo, modelo, matricula, marca);
        this.numeroMotores = numeroMotores;
        this.numeroAsientos = numeroAsientos;
        this.elevacionMaxima = elevacionMaxima;
        this.cargaMaxima = cargaMaxima;
    }
    
    /*
    Getters y Setters atributos clase Aereos
     */
    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getElevacionMaxima() {
        return elevacionMaxima;
    }

    public void setElevacionMaxima(double elevacionMaxima) {
        this.elevacionMaxima = elevacionMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    
    /**
    *Este metodo nos indica que el Vehiculo aereo va ha despegar
    */
    public void despegar(){
        System.out.println("El vehiculo modelo "+this.getModelo()+" y numero de asientos "+this.getNumeroAsientos()+" va ha despegar");
    }
    /**
    *Este metodo nos indica que el Vehiculo aereo va ha aterrizar
    */
    public void aterrizar(){
        System.out.println("El vehiculo modelo "+this.getModelo()+" y numero de asientos "+this.getNumeroAsientos()+" va ha aterrizar");
    }
    /**
    *Este metodo nos indica que el Vehiculo aereo va ha disminuir Altura
    */
    public void disminuirAltura(){
        System.out.println("El vehiculo modelo "+this.getModelo()+" y numero de asientos "+this.getNumeroAsientos()+" va ha disminuir la altura");
    }
    /**
    *Declaracion metodo abstracto devuelve valor double
    */
    public abstract double tiempoDeVuelo();

    /**
    *to String imprime los datos clase padre Vehiculo y clase hija Aereos
     */
    @Override
    public String toString() {
        return super.toString()+"\nVehiculo Aereo\n" + 
                "Numero De Motores: " + numeroMotores + 
                "\nNumero De Asientos: " + numeroAsientos + 
                "\nElevacion Maxima: " + elevacionMaxima + " m"+
                "\nCarga Maxima: " + cargaMaxima+ " toneladas";
    }
    
    
}
