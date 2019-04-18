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
 *
 * @author Jose Quinde
 */
public class ControladorAuto {
    private List<Auto> lista;
    int resultado = 0;
    

    public ControladorAuto() {
        lista = new ArrayList<>();
    }
    public int buscarUltimoCodigo() {
        if(resultado>=0){
            resultado++;
        }

        return resultado;
    }
    
    public void create(Auto objeto){
        lista.add(objeto);
    }
    
    public Auto read(int codigo){
        for (Auto auto : lista) {
            if(auto.getCodigo() == codigo){
                return auto;
            }
        }
        return null;
    }
    
    public void update(Auto objeto){
        for (int i = 0; i < lista.size(); i++) {
            Auto elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Auto elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }
}
