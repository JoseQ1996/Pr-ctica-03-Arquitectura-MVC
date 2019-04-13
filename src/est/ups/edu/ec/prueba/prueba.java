/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.prueba;

import est.ups.edu.ec.clases.Auto;
import est.ups.edu.ec.clases.Avion;
import est.ups.edu.ec.clases.Helicoptero;
import est.ups.edu.ec.clases.Moto;
import est.ups.edu.ec.clases.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Esta es la clase prueba aqui se ingresa y se imprime los datos de todas las clases hijas
 * 
 * @author José Quinde
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se crea la lista Vehiculo para guardar los vehiculos
        */
        List<Vehiculo> lista = new ArrayList<>();
        /*
        Se ingresa los datos de cada clase hija en este caso 2 por cada clase
        */
        Auto auto1=new Auto("Doble", 5,8, true, 4, "Manual", "Tranporte tipo Jeep", 240.20, 1, "Patrol","AVCH-9560", "Nissan");
        Auto auto2=new Auto("Trasera", 3,8, true, 4, "Automatica", "Automovil ", 320.20, 2, "Mustang GT","ARTG-5860", "Ford");
        Moto moto1=new Moto(true, 1.30, 1, true, 2, "Manual", "De pista", 320.30, 3, "S-1000 Rr", "AVH-698", "BMW");
        Moto moto2=new Moto(false, 1.70, 1, false, 2, "Manual", "De Cross", 320.30, 4, "CRF150-RB", "ATU-698", "Honda");
        Avion avion1=new Avion("Qatar Airways", 60, 10.5, 20, 4, 200, 300.4, 230, 5, "747", "JKI-985", "Boeing");
        Avion avion2=new Avion("Fly Emirates", 80, 12.5, 29, 4, 250, 350.4, 250, 6, "A320", "SLO-565", "Airbus");
        Helicoptero heli1=new Helicoptero(320.3, 6, 2, 10.2, 2, 4, 300.2, 50, 7, "AH-64 Apache", "DLIF-965", "Boeing");
        Helicoptero heli2=new Helicoptero(327.3, 8, 2, 20.2, 2, 6, 350.2, 70.3, 8, "Ka-52 'Alligator' ", "SLOK-256", "Kamov");
        /*
        Se los guarda en la lista
        */
        lista.add(auto1);
        lista.add(auto2);
        lista.add(moto1);
        lista.add(moto2);
        lista.add(avion1);
        lista.add(avion2);
        lista.add(heli1);
        lista.add(heli2);
       
        /*
        Se recorre la lista tambien se hace el casting y el instance Of para saber a que clase hija pertenece y se imprime
        */
        for (Vehiculo vehiculo : lista) {
            if (vehiculo instanceof Auto){
                Auto temp=(Auto) vehiculo;
                System.out.println(temp);
                 System.out.println("-----------------------------------------------------------------------------------------------------------------");
            }
            else if (vehiculo instanceof Moto){
                Moto temp=(Moto) vehiculo;
                System.out.println(temp);
                 System.out.println("-----------------------------------------------------------------------------------------------------------------");
            }
            else if (vehiculo instanceof Avion){
                Avion temp=(Avion) vehiculo;
                System.out.println(temp);
                 System.out.println("-----------------------------------------------------------------------------------------------------------------");
            }
            else if (vehiculo instanceof Helicoptero){
                Helicoptero temp=(Helicoptero) vehiculo;
                System.out.println(temp);
                 System.out.println("-----------------------------------------------------------------------------------------------------------------");
            }
        }
        /*
        *Aqui imprime las acciones de cada vehiculo ingresado para ver el funcionamiento perfecto de cada metodo implementado en cada clase,
        *tambien de los metodos abstractos y de los metodos abstractos de la clase interface.
        */
        System.out.println("-----------------------------------------------------------------------------------------------------------------");   
        auto1.apagar();
        auto1.desminuirVelocidad();
        auto1.deReversa();
        auto1.girarDerecha();
        System.out.println("El vehiculo consume "+auto1.nivelConsumo()+" litros");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");    
        auto2.encender();
        auto2.arrancar();
        auto2.reproduceMusica();
        auto2.girarIzquierda();
        System.out.println("El vehiculo consume "+auto2.nivelConsumo()+" litros");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        moto1.encender();
        moto1.arrancar();
        moto1.enPista();
        moto1.girarDerecha();
        System.out.println("La moto consume "+moto1.nivelConsumo()+" litros");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        moto2.apagar();
        moto2.desminuirVelocidad();
        moto2.enCarretera();
        moto2.girarIzquierda();
        System.out.println("La moto consume "+moto2.nivelConsumo()+" litros");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");   
        avion1.encender();
        avion1.disminuirAltura();
        avion1.disponibilidad();
        avion1.girarDerecha();
        System.out.println("El avion tiene un tiempo de vuelo de "+avion1.tiempoDeVuelo()+" horas");
        System.out.println("-----------------------------------------------------------------------------------------------------------------"); 
        avion2.apagar();
        avion2.aterrizar();
        avion2.vueloConEscala();
        avion2.girarIzquierda();
        System.out.println("El avion tiene un tiempo de vuelo de "+avion2.tiempoDeVuelo()+" horas");
        System.out.println("-----------------------------------------------------------------------------------------------------------------"); 
        heli1.estado();
        heli1.disminuirAltura();
        heli1.enMovimiento();
        heli1.girarIzquierda();
        System.out.println("El Helicoptero tiene un tiempo de vuelo de "+heli1.tiempoDeVuelo()+" horas");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        heli2.encender();
        heli2.despegar();
        heli2.enReposo();
        heli2.girarDerecha();
        System.out.println("El Helicoptero tiene un tiempo de vuelo de "+heli2.tiempoDeVuelo()+" horas");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
         /*
        Se crea un vehiculo anonimo y se lo imprime
        */
        Vehiculo anonimo=new Vehiculo(9, "Corvette", "DFF-96", "Chevroleth");
        System.out.println(anonimo);
    }
    
}
