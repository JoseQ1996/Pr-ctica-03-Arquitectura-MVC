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
 *
 * @author Usuario
 */
public class ControladorHelicoptero {
    private SortedSet<Helicoptero>listaOrdenada;
    private int codigo;
    
    public ControladorHelicoptero() {
        listaOrdenada= new TreeSet<>();
        codigo=1;
    }
            
    public void create(Helicoptero objeto){
        codigo++;
        objeto.setCodigo(codigo);
        listaOrdenada.add(objeto);
    }
    
    public Helicoptero read(int codigo){
        for (Helicoptero helicoptero : listaOrdenada) {
            if(helicoptero.getCodigo() == codigo){
                return helicoptero;
            }
        }
        return null;
    }
    
    public void update(Helicoptero objeto){

            if(listaOrdenada.contains(objeto)){
                listaOrdenada.remove(objeto);
                listaOrdenada.add(objeto);
            }            
        
    }
    
    public void delete(int codigo){
        for (Helicoptero helicoptero:listaOrdenada) {
            if(helicoptero.getCodigo()==codigo){
                listaOrdenada.remove(helicoptero);
                break;
            }            
        }
    }
    
    public void printAll(){
        System.out.println("LIsta ordenada por Modelo");
        for (Helicoptero helicoptero : listaOrdenada) {
            System.out.println(helicoptero);           
        }
    }
}
