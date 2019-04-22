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
 *
 * @author Jose Quinde
 */
public class ControladorMoto {
       private int codigo=0;
   private Map<Integer,Moto> lista;

   
    public ControladorMoto() {
        lista = new HashMap<Integer,Moto>();
    }
   
 public void create(Moto objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo,objeto);
    }
    
    public Moto read(int codigo){
        
        return (Moto)lista.get(codigo);
    }
    
    public void update(Moto objeto){

            if(lista.containsKey(codigo)){
                lista.replace(codigo, objeto);
            }            
        
    }
    
    public void delete(int codigo){
       lista.remove(codigo);
    }
    
    public void printAll(){
        Iterator it=lista.keySet().iterator();
        while(it.hasNext()){
            Integer key=(Integer) it.next();
            System.out.println("Codigo "+key+" Objeto "+lista.get(key));
        }
    }
}