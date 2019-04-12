/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.clases;

import est.ups.edu.ec.interfaces.Acciones;

/**
 *
 * @author José Quinde
 */
public final class Avion extends Aereos implements Acciones {
    /*
    Declaracion variables Avion
    */
    private String aerolinea;
    private int numeroFilas;
    private double tiempoDespegue;
    private double espacioAterrizaje;
    
    /*
    Constructor vacio clase Avion
    */
    public Avion() {
    }

    /*
    Constructor con atributo codigo de la clase abuelo Vehiculo
     */
    public Avion(int codigo) {
        super(codigo);
    }

    /*
    Constructor con los atributos de la clase abuelo Vehiculo, de la clase padre Aereos y de la clase hija Avion
     */
    public Avion(String aerolinea, int numeroFilas, double tiempoDespegue, double espacioAterrizaje, int numeroMotores, int numeroAsientos, double elevacionMaxima, double cargaMaxima, int codigo, String modelo, String matricula, String marca) {
        super(numeroMotores, numeroAsientos, elevacionMaxima, cargaMaxima, codigo, modelo, matricula, marca);
        this.aerolinea = aerolinea;
        this.numeroFilas = numeroFilas;
        this.tiempoDespegue = tiempoDespegue;
        this.espacioAterrizaje = espacioAterrizaje;
    }

    /*
    Getters y Setters clase Avion
     */
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getNumeroFilas() {
        return numeroFilas;
    }

    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }

    public double getTiempoDespegue() {
        return tiempoDespegue;
    }

    public void setTiempoDespegue(double tiempoDespegue) {
        this.tiempoDespegue = tiempoDespegue;
    }

    public double getEspacioAterrizaje() {
        return espacioAterrizaje;
    }

    public void setEspacioAterrizaje(double espacioAterrizaje) {
        this.espacioAterrizaje = espacioAterrizaje;
    }
    /*
    Metodo que indica que tiene disponibilidad el avion
    */
    public void disponibilidad(){
        System.out.println("El avion de modelo "+this.getModelo()+" perteneciente a la Aerolinea "+this.getAerolinea()+" tiene disponibilidad en su vuelo");
    }
    /*
    Metodo que indica que el vuelo tiene escalas
    */
    public void vueloConEscala(){
        System.out.println("El avion de modelo "+this.getModelo()+" perteneciente a la Aerolinea "+this.getAerolinea()+" es un vuelo que tiene algunas escalas");
    }
    /*
    Metodo que indica que el vuelo no tiene escalas
    */
    public void vueloSinEscala(){
        System.out.println("El avion de modelo "+this.getModelo()+" perteneciente a la Aerolinea "+this.getAerolinea()+" es un vuelo que va directo a su destino sin escalas");
    }
    /*
    Metodo abstracto que indica el promedio de tiempo de vuelo de un avion devuelve un valor 17,15 es el valor que devuelde ya que es un double
     */
    @Override
    public double tiempoDeVuelo() {
        return 17.15;
    }
    /*
    Metodo de la clase interface que indica si gira a la derecha
    */
     @Override
    public void girarDerecha() {
        System.out.println("El Avion con modelo "+this.getModelo()+" esta girando a la derecha");
    }
    /*
    Metodo de la clase interface que indica que gira a la izquierda
     */
    @Override
    public void girarIzquierda() {
        System.out.println("El avion con modelo "+this.getModelo()+" esta girando a la izquierda");
    }

    /*
    ToString que imprime los atributos de la clase abuelo Vehiculo,de la calase padre Aereos y de la clase hija Avion
     */
    @Override
    public String toString() {
        return super.toString()+"\nAvion\n" 
                + "Aerolinea: " + aerolinea + 
                "\nNumero De Filas: " + numeroFilas + "\n Tiempo De Despegue:" + tiempoDespegue + " s" +
                "\nEspacio De Aterrizaje: " + espacioAterrizaje + " m";
    }
    
}
