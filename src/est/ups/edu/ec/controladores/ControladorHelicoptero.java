/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.controladores;

import est.ups.edu.ec.clases.Helicoptero;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *El controlador de la clase hija Helicoptero que implementa el SortedSet y el TreeSet en el Crud
 * 
 * @author José Quinde
 */
public class ControladorHelicoptero {
    //Declaracion de variables
    private SortedSet<Helicoptero>listaOrdenada;
    private int codigo;
    /**
     * Constructor de la clase ControladorHelicoptero que declara el SortedSet como TreeSet y inicializa el codigo en 0
     * 
     */
    public ControladorHelicoptero() {
        listaOrdenada= new TreeSet<>();
        codigo=0;
    }
    /**
     * Este metodo crea un objeto de la clase hija Helicoptero y lo añade al SortedSet
     * 
     * @param helicoptero 
     */
            
    public void create(Helicoptero helicoptero){
        codigo++;
        helicoptero.setCodigo(codigo);
        listaOrdenada.add(helicoptero);
        System.out.println("Se a creado un Vehiculo con el codigo "+codigo);
    }
    /**
     * Este metodo pide el codigo de un objeto ya ingresado para despues mostrarlo
     * 
     * @param codigo
     * @return 
     */
    public Helicoptero read(int codigo){
        for (Helicoptero helicoptero : listaOrdenada) {
            if(helicoptero.getCodigo() == codigo){
                return helicoptero;
            }
        }
        return null;
    }
    /**
     * Este metodo actualiza un objeto ya ingresado a traves del codigo
     * 
     * @param helicoptero 
     */
    public void update(Helicoptero helicoptero){

            if(listaOrdenada.contains(helicoptero)){
                listaOrdenada.remove(helicoptero);
                listaOrdenada.add(helicoptero);
            }            
        
    }
    /**
     * Este metodo elimina un objeto ya creado con el codigo dado
     * 
     * @param codigo 
     */
    public void delete(int codigo){
        for (Helicoptero helicoptero:listaOrdenada) {
            if(helicoptero.getCodigo()==codigo){
                listaOrdenada.remove(helicoptero);
                break;
            }            
        }
    }
    /**
     * Este metodo lista todos los objetos dados de manera ordenada segun su Modelo
     * 
     */
    public void printAll(){
        System.out.println("LIsta ordenada por Modelo");
        for (Helicoptero helicoptero : listaOrdenada) {
            System.out.println("---------------------");
            System.out.println(helicoptero);           
        }
    }
}
