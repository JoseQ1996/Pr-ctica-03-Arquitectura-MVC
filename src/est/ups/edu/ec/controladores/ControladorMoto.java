/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.controladores;

import est.ups.edu.ec.clases.Moto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 *El controlador de la clase hija Mot que implementa el Map y el HashMap en el Crud
 * 
 * @author Jose Quinde
 */
public class ControladorMoto {
   //Declaracion de variables
   private int codigo;
   private Map<Integer,Moto> lista;

    /**
     * Constructor de la clase ControladorMoto que declara el Map como HashMap y inicializa el codigo en 0
     * 
     */
    public ControladorMoto() {
        lista = new HashMap<Integer,Moto>();
        codigo=0;
    }
    /**
     * Este metodo crea un objeto de la clase hija Moto y lo añade al Map
     * 
     * @param moto
     */
     public void create(Moto moto){
        codigo++;
        moto.setCodigo(codigo);
        lista.put(codigo,moto);
        System.out.println("Se a creado un Vehiculo con el codigo "+codigo);
    }
    /**
     * Este metodo nos lee un objeto con el codigo dado
     * 
     * @param codigo
     * @return 
     */
    public Moto read(int codigo){       
        return (Moto)lista.get(codigo);
    }
    /**
     * Este metodo nos actualiza a un objeto con el codigo dado
     * 
     * @param moto
     */
    public void update(Moto moto){
            if(lista.containsKey(codigo)){
                lista.replace(codigo, moto);
            }            
    }
    /**
     * Este metodo nos elimina un objeto con el codigo dado
     * 
     * @param codigo 
     */
    public void delete(int codigo){
       lista.remove(codigo);
    }
    /**
     * Este metodo nos lista todos los objetos del Map
     * 
     */
    public void printAll(){
        Iterator it=lista.keySet().iterator();
        while(it.hasNext()){
            Integer key=(Integer) it.next();
            System.out.println("---------------------");
            System.out.println(lista.get(key));
        }
    }
}