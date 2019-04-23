/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.controladores;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import est.ups.edu.ec.clases.Auto;
import java.util.ArrayList;
import java.util.List;

/**
 *Controlar de la clase hija Auto que implementa el List y ArrayList en el Crud
 * 
 * @author Jose Quinde
 */
public class ControladorAuto {
    //Declara las variable
    private List<Auto> lista;
    int resultado = 0;
    
    /**
     * Constructor de la clase ControladorAuto que declara la variable lista como Arraylist
     * 
     */
    public ControladorAuto() {
        lista = new ArrayList<>();
    }
    /**
     * Este metodo da el codigo al objeto que se ingresa 
     * 
     * @return 
     */
    public int buscarUltimoCodigo() {
        if(resultado>=0){
            resultado++;
        }

        return resultado;
    }
    
    /**
     * Este metodo crea un objeto auto y lo agrega al list
     * 
     * @param auto 
     */
    public void create(Auto auto){
        lista.add(auto);
    }
    
    /**
     * Este metodo pide el codigo para despues mostrar el objeto con el codigo dado
     * 
     * @param codigo
     * @return  
     */
    
    public Auto read(int codigo){
        for (Auto auto : lista) {
            if(auto.getCodigo() == codigo){
                return auto;
            }
        }
        return null;
    }
    
    /**
     * Este metodo actualiza un objeto ya definido modificando sus datos a traves del codigo
     * 
     * @param auto 
     */
    
    public void update(Auto auto){
        for (int i = 0; i < lista.size(); i++) {
            Auto elemento = lista.get(i);
            if(elemento.getCodigo() == auto.getCodigo()){
                lista.set(i, auto);
                break;
            }            
        }
    }
    
    /**
     * Este metodo elimina un objeto con el codigo dado
     * 
     * @param codigo 
     */
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Auto elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }
    
    /**
     * Metodo que lista todos los objetos
     * 
     */
    public void printAll(){
        for (Auto auto : lista) {
            System.out.println("---------------------------");
            System.out.println(auto) ;
        }     
    }
    
}
