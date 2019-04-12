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
public final class Moto extends Terrestres implements Acciones{
    /*
    Declaracion de variables clase Moto 
    */
    private boolean limitador;
    private double alturaMaxima;
    private int capacidadSillin;
    private boolean luces;
    
    /*
    Constructor vacio clase Moto
    */
    
    public Moto() {
    }
    
    /*
    Constructor atributo codigo clase abuelo Vehiculo
    */
    
    public Moto(int codigo) {
        super(codigo);
    }

    /*
    Contructor con todos los atributos de la clase abuelo Vehiculo, de la clase padre Terrestres y la clase hija Moto
     */
    public Moto(boolean limitador, double alturaMaxima, int capacidadSillin, boolean luces, int numeroNeumaticos, String tipoTransmision, String tipoTransporte, double velocidadMaxima, int codigo, String modelo, String matricula, String marca) {
        super(numeroNeumaticos, tipoTransmision, tipoTransporte, velocidadMaxima, codigo, modelo, matricula, marca);
        this.limitador = limitador;
        this.alturaMaxima = alturaMaxima;
        this.capacidadSillin = capacidadSillin;
        this.luces = luces;
    }

    /*
    Getters y Setters clase Moto
     */
    public boolean isLimitador() {
        return limitador;
    }

    public void setLimitador(boolean limitador) {
        this.limitador = limitador;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getCapacidadSillin() {
        return capacidadSillin;
    }

    public void setCapacidadSillin(int capacidadSillin) {
        this.capacidadSillin = capacidadSillin;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }
    
    /*
    metodo que indica si la moto esta en una pista de carrera
    */
    public void enPista(){
        System.out.println("La moto de modelo "+this.getModelo()+"y de altura maxima "+this.getAlturaMaxima()+" esta en pista");
    }
    /*
    metodo que indica si la moto esta en carretera normal
    */
    public void enCarretera(){
        System.out.println("La moto de modelo "+this.getModelo()+"y de altura maxima "+this.getAlturaMaxima()+" esta en carretera noraml");
    }
    /*
    Metodo abstracto que devuele el consumo de la Moto sin ningun parametro nos devuelme el consumo promedio de una moto  2,7 litros en 100km 
    */
    @Override
    public double nivelConsumo() {
        return 2.7;
    }
     /*
    Metodo de la clase interface que indica que gira a la derecha
     */
    @Override
    public void girarDerecha() {
        System.out.println("La Moto con modelo "+this.getModelo()+" esta girando a la derecha");
    }
    /*
    Metodo de la clase interface que indica que gira a la izquierda
     */
    @Override
    public void girarIzquierda() {
        System.out.println("La Moto con modelo "+this.getModelo()+" esta girando a la izquierda");
    }

    /*
    ToString que imprime todos los atributos de la clase abuela Vehiculo, la clase Padre Terrestres y la clase hija Moto
     */
    @Override
    public String toString() {
        return super.toString()+"\nMoto\n" + 
                "\nLimitador: " + limitador + 
                "\nAltura Maxima: " + alturaMaxima + " m"+ 
                 "\nCapacidad del Sillin:" +capacidadSillin+" personas"+
                "\nLuces:" + luces;
    }
    
    
}
