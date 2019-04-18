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
 *
 * @author Usuario
 */
public class ControladorAvion {
    private  Set<Avion> lista;
    int codigo;
    

    public ControladorAvion() {
        lista = new HashSet<>();
        codigo=0;
    }

    
    public void create(Avion objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public Avion read(int codigo){
        for (Avion auto : lista) {
            if(auto.getCodigo() == codigo){
                return auto;
            }
        }
        return null;
    }
    
    public void update(Avion objeto){

            if(lista.contains(objeto)){
                lista.remove(objeto);
                lista.add(objeto);
            }            
        
    }
    
    public void delete(int codigo){
        for (Avion auto:lista) {
            if(auto.getCodigo()==codigo){
                lista.remove(auto);
                break;
            }            
        }
    }
}
            