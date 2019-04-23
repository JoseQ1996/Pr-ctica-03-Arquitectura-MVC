/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.controladores;


import est.ups.edu.ec.clases.Avion;

import java.util.HashSet;
import java.util.Set;

/**
 *El controlador de la clase hija Avion que implementa el Set y el HashSet en el Crud
 * 
 * @author José Quinde
 */
public class ControladorAvion {
    //Declarar variables
    private  Set<Avion> lista;
    int codigo;
    
    /**
     * Constructor de la clase ControladorAvion que declara la lista como HashSet y inicializa el codigo en 0
     * 
     */
    public ControladorAvion() {
        lista = new HashSet<>();
        codigo=0;
    }
    /**
     * Este metodo crea un objeto de la clase hija Avion y lo añade al Set
     * 
     * @param avion 
     */
    
    public void create(Avion avion){
        codigo++;
        avion.setCodigo(codigo);
        lista.add(avion);
        System.out.println("Se ha creado un Vehiculo con codigo "+codigo);
    }
    /**
     * Este metodo pide el codigo de un objeto ya ingresado para despues mostrarlo
     * 
     * @param codigo
     * @return 
     */
    
    public Avion read(int codigo){
        for (Avion auto : lista) {
            if(auto.getCodigo() == codigo){
                return auto;
            }
        }
        return null;
    }
    /**
     * Este metodo actualiza un objeto ya ingresado a traves del codigo
     * 
     * @param avion 
     */
    public void update(Avion avion){

            if(lista.contains(avion)){
                lista.remove(avion);
                lista.add(avion);
            }            
        
    }
    /**
     * Este metodo elimina un objeto ya creado con el codigo dado
     * 
     * @param codigo 
     */
    public void delete(int codigo){
        for (Avion avion:lista) {
            if(avion.getCodigo()==codigo){
                lista.remove(avion);
                break;
            }            
        }
    }
    /**
     * Este metodo lista todos los objetos ingresados
     */
    public void printAll(){
        for (Avion avion:lista) {
            System.out.println("---------------------------");
            System.out.println(avion);
        }
    }
}
            