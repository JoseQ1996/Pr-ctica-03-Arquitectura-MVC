/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.controladores;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import est.ups.edu.ec.clases.Moto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Quinde
 */
public class ControladorMoto {
   private List<Moto> lista;
   private int resultado=0;
   
    public ControladorMoto() {
        lista = new ArrayList<>();
    }
   
    public int buscarUltimoCodigo() {
        if(resultado>=0){
            resultado++;
        }

        return resultado;
    }
    
    
    public void create(Moto objeto){
        lista.add(objeto);
    }
    
    public Moto read(int codigo){
        for (Moto moto : lista) {
            if(moto.getCodigo() == codigo){
                return moto;
            }
        }
        return null;
    }
    
    public void update(Moto objeto){
        for (int i = 0; i < lista.size(); i++) {
            Moto  elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Moto elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    } 
}
