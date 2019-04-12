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
public final class Auto extends Terrestres implements Acciones{
    /*
    Declaracion variables clase Auto
    */
    private String tipoTranccion;
    private int numeroPuertas;
    private int cilindraje;
    private boolean descapotable;
    
    /*
    Constructor vacio clase Terrestres
    */  
    public Auto() {
    }
    /*
    Constructor con atributo codigo de la clase abuelo Vehiculo
     */
    public Auto(int codigo) {
        super(codigo);
    }
    
    /*
    Constructor con todos los atributos clase abuelo Vehiculo, clase padre Terrestres y clase hija Auto
    */
    public Auto(String tipoTranccion, int numeroPuertas, boolean descapotable, int numeroNeumaticos, String tipoTransmision, String tipoTransporte, double velocidadMaxima, int codigo, String modelo, String matricula, String marca) {
        super(numeroNeumaticos, tipoTransmision, tipoTransporte, velocidadMaxima, codigo, modelo, matricula, marca);
        this.tipoTranccion = tipoTranccion;
        this.numeroPuertas = numeroPuertas;
        this.descapotable = descapotable;
    }

    /*
    Getters y Setters clase Auto
     */
    public String getTipoTranccion() {
        return tipoTranccion;
    }

    public void setTipoTranccion(String tipoTranccion) {
        this.tipoTranccion = tipoTranccion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
    
    /*
    Metodo que indica si el auto esta reproducciendo musica
    */
    public void reproduceMusica(){
        System.out.println("El Auto de modelo "+this.getModelo()+" y con traccion "+this.getTipoTranccion()+" esta reproducciendo musica");  
    }
    /*
    Metodo que indica si el auto esta en Reversa
    */
    public void deReversa(){
        System.out.println("El Auto de modelo "+this.getModelo()+" y con traccion "+this.getTipoTranccion()+" esta de reversa");  
    }
    /*
    *Metodo abstracto que calculo el nivel de consume de acuero al cilindraje si es Auto de 4 cilindros 1.6 litro en carretera,
    *Auto de 6 cilindros 2,4 litro en carretera ,Auto de 3.2 litro en carretera 
    */
    @Override
    public double nivelConsumo() {
        if(cilindraje==4){
            return 1.6;
        }else if(cilindraje==6){
            return 2.4;
        }else if (cilindraje==8){
            return 3.2;
        }
        return 4.5;
    }

    /*
    Metodo de la clase interface que indica que gira a la derecha
     */
    @Override
    public void girarDerecha() {
        System.out.println("El auto con modelo "+this.getModelo()+" esta girando a la derecha");
    }
    /*
    Metodo de la clase interface que indica que gira a la izquierda
     */
    @Override
    public void girarIzquierda() {
        System.out.println("El auto con modelo "+this.getModelo()+" esta girando a la izquierda");
    }
    /*
    toString imprime todos los atributos clase abuelo Vehiculo clase padre Terrestres y clase hija Auto
     */
    @Override
    public String toString() {
        return super.toString()+"\nAuto\n" + 
                "Tipo De Tranccion:" + tipoTranccion + 
                "\nNumero De Puertas: " + numeroPuertas + 
                "Cilindraje: " + cilindraje + 
                "\nDescapotable: " + descapotable;
    }
    
}
