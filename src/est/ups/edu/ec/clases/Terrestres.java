/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.clases;

/**
 *
 *Esta clase instancia los atributos,getters y setters,constructores y metodos de la clase padre Terrestres
 *
 * @author José Quinde
 */
public abstract class Terrestres extends Vehiculo{
    
    /**
    *Declaracion variables clase Terrestres tambien hereda los datos de la clase Vehiculo
    */
    private int numeroNeumaticos;
    private String tipoTransmision;
    private String tipoTransporte;
    private double velocidadMaxima;
    /**
    *Constructor vacio clase Terrestres
    */
    public Terrestres() {
    }
    /**
    *Constructor atributo codigo de clase padre Vehiculo
    */
    public Terrestres(int codigo) {
        super(codigo);
    }
    /**
    *Constructor pide todos los atributos de la clase padre Vehiculo y tambien los atributos de Terrestres
    */
    public Terrestres(int numeroNeumaticos, String tipoTransmision, String tipoTransporte, double velocidadMaxima, int codigo, String modelo, String matricula, String marca) {
        super(codigo, modelo, matricula, marca);
        this.numeroNeumaticos = numeroNeumaticos;
        this.tipoTransmision = tipoTransmision;
        this.tipoTransporte = tipoTransporte;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    /**
    *Getters y Setters de la clase Terrestres
     */
    public int getNumeroNeumaticos() {
        return numeroNeumaticos;
    }

    public void setNumeroNeumaticos(int numeroNeumaticos) {
        this.numeroNeumaticos = numeroNeumaticos;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    /**
    *este metodo nos dice si el vehiculo terrestre va arrancar
    */
    public void arrancar(){
        System.out.println("El vehiculo de modelo "+this.getModelo()+" y tipo de transmision "+this.getTipoTransmision()+" va ha arrancar"); 
    }
    /**
    *este metodo nos dice si el vehiculo terrestre va frenar
    */
    public void frenar(){
        System.out.println("El vehiculo de modelo "+this.getModelo()+" y tipo de transmision "+this.getTipoTransmision()+" va frenar"); 

    }
    /**
    *este metodo nos dice si el vehiculo terrestre va ha disminuir la velocidad
    */
    public void desminuirVelocidad(){
         System.out.println("El vehiculo de modelo "+this.getModelo()+" y tipo de transmision "+this.getTipoTransmision()+" esta disminuyendo la velocidad"); 

    }
    /**
    *declaracion metodo abstract a implementar en clases hijas devuelve un double
    */
    public abstract double nivelConsumo();
    /**
    *to String imprime los datos clase padre Vehiculo y clase hija Terrestres
    */
    @Override
    public String toString() {
        return super.toString()+"\nVehiculo Terrestre\n" 
                + "Numero De Neumaticos: " + numeroNeumaticos + 
                "\nTipo De Transmision: " + tipoTransmision + 
                "\nTipo De Transporte: " + tipoTransporte + 
                "\nVelocidad Maxima: " + velocidadMaxima +" km/h";
    }
    
    
}

