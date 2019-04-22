/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.vista;

import est.ups.edu.ec.clases.Auto;
import est.ups.edu.ec.clases.Avion;
import est.ups.edu.ec.clases.Helicoptero;
import est.ups.edu.ec.clases.Moto;
import est.ups.edu.ec.controladores.ControladorAuto;
import est.ups.edu.ec.controladores.ControladorAvion;
import est.ups.edu.ec.controladores.ControladorHelicoptero;
import est.ups.edu.ec.controladores.ControladorMoto;
import java.util.Scanner;

/**
 *
 * @author José Quinde
 */
public class Principal {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 
         * Se manda a llamar a la clase Scanner y tambien a los controladores
         */
        Scanner entrada = new Scanner(System.in);
        int opcionMenuPrincipal = 0;
        int opcionMenuAuto = 0;
        int opcionMenuMoto = 0;
        int opcionMenuAvion = 0;
        int opcionMenuHelicoptero = 0;
        
        ControladorAuto controladorAuto = new ControladorAuto();
        ControladorMoto controladorMoto= new ControladorMoto();
        ControladorAvion controladorAvion = new ControladorAvion();
        ControladorHelicoptero controladorHelicoptero= new ControladorHelicoptero();
                
        do{
            //Menu principal para el ingreso de los objetos
            
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Auto");
            System.out.println("2. CRUD Moto");
            System.out.println("3. CRUD Avion");
            System.out.println("4. CRUD Helicoptero");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcionMenuPrincipal = entrada.nextInt();
            
            switch(opcionMenuPrincipal){
                case 1: 
                    //opcion para el crud auto
                    do{
                        System.out.println("MENU AUTO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuAuto = entrada.nextInt();
                        
                        switch(opcionMenuAuto){
                            case 1:
                                //create                                
                                //pide todos los datos por teclado
                                int codigo=controladorAuto.buscarUltimoCodigo();                               
                                System.out.println("Ingrese el modelo del Vehiculo: ");
                                String modelo=entrada.next();
                                System.out.println("Ingrese la matricula del Vehiculo:");
                                String matricula=entrada.next();
                                System.out.println("Ingrese la marca del Vehiculo");
                                String marca=entrada.next();
                                System.out.println("Ingrese numero de Llantas:");
                                int llantas=entrada.nextInt();
                                System.out.println("Ingrese el tipo de Transmision:");
                                String transmision=entrada.next();
                                System.out.println("Ingrese Tipo de Transporte:");
                                String tipo= entrada.next();
                                System.out.println("Ingrese Velocidad Maxima:");
                                double velocidad=entrada.nextDouble();
                                System.out.println("Ingrese Tipo de Traccion:");
                                String traccion=entrada.next();
                                System.out.println("Ingrese el numero de Puertas:");
                                int puertas=entrada.nextInt();
                                System.out.println("Ingrese el cilindraje:");
                                int cilindraje= entrada.nextInt();
                                System.out.println("true o false si el auto es descapotable:");
                                boolean descapotable=entrada.nextBoolean();
                                 //instancia un objeto
                                Auto auto=new Auto(traccion,puertas,cilindraje, descapotable, llantas, transmision, tipo, velocidad, codigo, modelo,matricula, marca);
                               
                                //llama al metodo create del controlador
                                controladorAuto.create(auto);
                                System.out.println("Se ha creado un Vehiculo con codigo "+codigo);
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a Leer:");
                                int codigo1=entrada.nextInt();
                                //llama al metodo read del controlador
                                Auto auto2=controladorAuto.read(codigo1);
                                //visualizo los datos del objeto
                                System.out.println(auto2);
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a Actualizar:");
                                int codigo2=entrada.nextInt();
                                System.out.println("Ingrese el modelo del Vehiculo: ");
                                String modelo1=entrada.next();
                                System.out.println("Ingrese la matricula del Vehiculo:");
                                String matricula1=entrada.next();
                                System.out.println("Ingrese la marca del Vehiculo");
                                String marca1=entrada.next();
                                System.out.println("Ingrese numero de Llantas:");
                                int llantas1=entrada.nextInt();
                                System.out.println("Ingrese el tipo de Transmision:");
                                String transmision1=entrada.next();
                                System.out.println("Ingrese Tipo de Transporte:");
                                String tipo1= entrada.next();
                                System.out.println("Ingrese Velocidad Maxima:");
                                double velocidad1=entrada.nextDouble();
                                System.out.println("Ingrese Tipo de Traccion:");
                                String traccion1=entrada.next();
                                System.out.println("Ingrese el numero de Puertas:");
                                int puertas1=entrada.nextInt();
                                System.out.println("Ingrese el cilindraje:");
                                int cilindraje1= entrada.nextInt();
                                System.out.println("true o false si el auto es descapotable:");
                                boolean descapotable1=entrada.nextBoolean();
                                 //instancia un objeto
                                Auto auto1=new Auto(traccion1,puertas1,cilindraje1, descapotable1, llantas1, transmision1, tipo1, velocidad1, codigo2, modelo1,matricula1, marca1);
                                //llama al metodo update del controlador
                                controladorAuto.update(auto1);
                                System.out.println("El vehiculo con codigo "+codigo2+ " a sido actualizado");
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a eliminar:");
                                int codigo3=entrada.nextInt();
                                //llama al metodo delete del controlador
                                controladorAuto.delete(codigo3);
                                System.out.println("El vehiculo con codigo "+codigo3+ " a sido eliminado");
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuAuto !=5);
                    break;
                case 2:
                    //opcion para el crud de la moto
                   do{
                        System.out.println("MENU MOTO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuMoto = entrada.nextInt();
                        
                        switch(opcionMenuMoto){
                            case 1:
                                //create                                
                                //pide todos los datos por teclado

                                System.out.println("Ingrese el modelo del Vehiculo: ");
                                String modelo=entrada.next();
                                System.out.println("Ingrese la matricula del Vehiculo:");
                                String matricula=entrada.next();
                                System.out.println("Ingrese la marca del Vehiculo");
                                String marca=entrada.next();
                                System.out.println("Ingrese numero de Llantas:");
                                int llantas=entrada.nextInt();
                                System.out.println("Ingrese el tipo de Transmision:");
                                String transmision=entrada.next();
                                System.out.println("Ingrese Tipo de Transporte:");
                                String tipo= entrada.next();
                                System.out.println("Ingrese Velocidad Maxima:");
                                double velocidad=entrada.nextDouble();
                                System.out.println("true o false si la moto posee limitador:");
                                boolean limitador=entrada.nextBoolean();
                                System.out.println("Ingrese la Altura de la Moto:");
                                double altura=entrada.nextDouble();
                                System.out.println("Ingrese la capacidad del Sillin:");
                                int sillin= entrada.nextInt();
                                System.out.println("true o false si la moto tiene luces:");
                                boolean luces=entrada.nextBoolean();
                                 //instancia un objeto
                                Moto moto=new Moto(limitador,altura,sillin, luces, llantas, transmision, tipo, velocidad, 0, modelo,matricula, marca);
                               
                                //llama al metodo create del controlador
                                controladorMoto.create(moto);
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a Leer:");
                                int codigo1=entrada.nextInt();
                                //llama al metodo read del controlador
                                Moto moto2=controladorMoto.read(codigo1);
                                //visualizo los datos del objeto
                                System.out.println(moto2);
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a Actualizar:");
                                int codigo2=entrada.nextInt();
                                System.out.println("Ingrese el modelo del Vehiculo: ");
                                String modelo1=entrada.next();
                                System.out.println("Ingrese la matricula del Vehiculo:");
                                String matricula1=entrada.next();
                                System.out.println("Ingrese la marca del Vehiculo");
                                String marca1=entrada.next();
                                System.out.println("Ingrese numero de Llantas:");
                                int llantas1=entrada.nextInt();
                                System.out.println("Ingrese el tipo de Transmision:");
                                String transmision1=entrada.next();
                                System.out.println("Ingrese Tipo de Transporte:");
                                String tipo1= entrada.next();
                                System.out.println("Ingrese Velocidad Maxima:");
                                double velocidad1=entrada.nextDouble();
                                  System.out.println("true o false si la moto posee limitador:");
                                boolean limitador1=entrada.nextBoolean();
                                System.out.println("Ingrese la Altura de la Moto:");
                                double altura1=entrada.nextDouble();
                                System.out.println("Ingrese la capacidad del Sillin:");
                                int sillin1= entrada.nextInt();
                                System.out.println("true o false si la moto tiene luces:");
                                boolean luces1=entrada.nextBoolean();
                                 //instancia un objeto
                                Moto moto1=new Moto(limitador1,altura1,sillin1, luces1, llantas1, transmision1, tipo1, velocidad1, codigo2, modelo1,matricula1, marca1);
                                //llama al metodo update del controlador
                                controladorMoto.update(moto1);
                                System.out.println("El vehiculo con codigo "+codigo2+ " a sido actualizado");
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a eliminar:");
                                int codigo3=entrada.nextInt();
                                //llama al metodo delete del controlador
                                controladorMoto.delete(codigo3);
                                System.out.println("El vehiculo con codigo "+codigo3+ " a sido eliminado");
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                    }while(opcionMenuMoto !=5);
                    break;
                case 3:
                    //opcion para el crud de Avion
                    do{
                        System.out.println("MENU AVION");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuAvion = entrada.nextInt();
                        
                        switch(opcionMenuAvion){
                            case 1:
                                //create                                
                                //pide todos los datos por teclado

                                System.out.println("Ingrese el modelo del Vehiculo: ");
                                String modelo=entrada.next();
                                System.out.println("Ingrese la matricula del Vehiculo:");
                                String matricula=entrada.next();
                                System.out.println("Ingrese la marca del Vehiculo");
                                String marca=entrada.next();
                                System.out.println("Ingrese numero de Motores:");
                                int motores=entrada.nextInt();
                                System.out.println("Ingrese numero de asientos:");
                                int asientos=entrada.nextInt();
                                System.out.println("Ingrese la elevacion maxima:");
                                double elevacion= entrada.nextDouble();
                                System.out.println("Ingrese la carga maxima:");
                                double carga=entrada.nextDouble();
                                System.out.println("Ingrese la aerolinea a la que pertenece el avion:");
                                String aerolinea=entrada.next();
                                System.out.println("Ingrese numero de filas:");
                                int filas=entrada.nextInt();
                                System.out.println("Ingrese el tiempo de Despegue:");
                                double despegue= entrada.nextDouble();
                                System.out.println("Ingrese Espacio de aterrizaje:");
                                double aterrizaje=entrada.nextDouble();
                                 //instancia un objeto
                                Avion avion=new Avion(aerolinea,filas,despegue, aterrizaje, motores, asientos, elevacion, carga, 0, modelo,matricula, marca);
                               
                                //llama al metodo create del controlador
                                controladorAvion.create(avion);

                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a Leer:");
                                int codigo1=entrada.nextInt();
                                //llama al metodo read del controlador
                                Avion avion2=controladorAvion.read(codigo1);
                                //visualizo los datos del objeto
                                System.out.println(avion2);
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a Actualizar:");
                                int codigo2=entrada.nextInt();
                                System.out.println("Ingrese el modelo del Vehiculo: ");
                                String modelo1=entrada.next();
                                System.out.println("Ingrese la matricula del Vehiculo:");
                                String matricula1=entrada.next();
                                System.out.println("Ingrese la marca del Vehiculo");
                                String marca1=entrada.next();
                                System.out.println("Ingrese numero de Motores:");
                                int motores1=entrada.nextInt();
                                System.out.println("Ingrese numero de asientos:");
                                int asientos1=entrada.nextInt();
                                System.out.println("Ingrese la elevacion maxima:");
                                double elevacion1= entrada.nextDouble();
                                System.out.println("Ingrese la carga maxima:");
                                double carga1=entrada.nextDouble();
                                System.out.println("Ingrese la aerolinea a la que pertenece el avion:");
                                String aerolinea1=entrada.next();
                                System.out.println("Ingrese numero de filas:");
                                int filas1=entrada.nextInt();
                                System.out.println("Ingrese el tiempo de Despegue:");
                                double despegue1= entrada.nextDouble();
                                System.out.println("Ingrese Espacio de aterrizaje:");
                                double aterrizaje1=entrada.nextDouble();
                                 //instancia un objeto
                                Avion avion1=new Avion(aerolinea1,filas1,despegue1, aterrizaje1, motores1, asientos1, elevacion1, carga1, codigo2, modelo1,matricula1, marca1);
                               
                                //llama al metodo update del controlador
                                controladorAvion.update(avion1);
                                System.out.println("El vehiculo con codigo "+codigo2+ " a sido actualizado");
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a eliminar:");
                                int codigo3=entrada.nextInt();
                                //llama al metodo delete del controlador
                                controladorAvion.delete(codigo3);
                                System.out.println("El vehiculo con codigo "+codigo3+ " a sido eliminado");
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuAvion !=5);
                    break;
                case 4:
                    //opcion para el crud del Helicoptero
                    do{
                        System.out.println("MENU HELICOPTERO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuHelicoptero = entrada.nextInt();
                        
                        switch(opcionMenuHelicoptero){
                            case 1:
                                //create                                
                                //pide todos los datos por teclado

                                System.out.println("Ingrese el modelo del Vehiculo: ");
                                String modelo=entrada.next();
                                System.out.println("Ingrese la matricula del Vehiculo:");
                                String matricula=entrada.next();
                                System.out.println("Ingrese la marca del Vehiculo");
                                String marca=entrada.next();
                                System.out.println("Ingrese numero de Motores:");
                                int motores=entrada.nextInt();
                                System.out.println("Ingrese numero de asientos:");
                                int asientos=entrada.nextInt();
                                System.out.println("Ingrese la elevacion maxima:");
                                double elevacion= entrada.nextDouble();
                                System.out.println("Ingrese la carga maxima:");
                                double carga=entrada.nextDouble();
                                System.out.println("Ingrese la velocidad de la Helice:");
                                double velocidad=entrada.nextDouble();
                                System.out.println("Ingrese numero de rotores:");
                                int rotores=entrada.nextInt();
                                System.out.println("Ingrese el numero de helices:");
                                int helice= entrada.nextInt();
                                System.out.println("Ingrese el ancho de la cabina:");
                                double cabina=entrada.nextDouble();
                                 //instancia un objeto
                                Helicoptero helicop=new Helicoptero(velocidad,rotores,helice, cabina, motores, asientos, elevacion, carga, 0, modelo,matricula, marca);
                               
                                //llama al metodo create del controlador
                                controladorHelicoptero.create(helicop);

                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a Leer:");
                                int codigo1=entrada.nextInt();
                                //llama al metodo read del controlador
                                Helicoptero helicop2=controladorHelicoptero.read(codigo1);
                                //visualizo los datos del objeto
                                System.out.println(helicop2);
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a Actualizar:");
                                int codigo2=entrada.nextInt();
                                System.out.println("Ingrese el modelo del Vehiculo: ");
                                String modelo1=entrada.next();
                                System.out.println("Ingrese la matricula del Vehiculo:");
                                String matricula1=entrada.next();
                                System.out.println("Ingrese la marca del Vehiculo");
                                String marca1=entrada.next();
                                System.out.println("Ingrese numero de Motores:");
                                int motores1=entrada.nextInt();
                                System.out.println("Ingrese numero de asientos:");
                                int asientos1=entrada.nextInt();
                                System.out.println("Ingrese la elevacion maxima:");
                                double elevacion1= entrada.nextDouble();
                                System.out.println("Ingrese la carga maxima:");
                                double carga1=entrada.nextDouble();
                                System.out.println("Ingrese la velocidad de la Helice:");
                                double velocidad1=entrada.nextDouble();
                                System.out.println("Ingrese numero de rotores:");
                                int rotores1=entrada.nextInt();
                                System.out.println("Ingrese el numero de helices:");
                                int helice1= entrada.nextInt();
                                System.out.println("Ingrese el ancho de la cabina:");
                                double cabina1=entrada.nextDouble();
                                 //instancia un objeto
                                Helicoptero helicop1=new Helicoptero(velocidad1,rotores1,helice1, cabina1, motores1, asientos1, elevacion1, carga1, codigo2, modelo1,matricula1, marca1);
                               
                                //llama al metodo update del controlador
                                controladorHelicoptero.update(helicop1);
                                System.out.println("El vehiculo con codigo "+codigo2+ " a sido actualizado");
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Vehiculo a eliminar:");
                                int codigo3=entrada.nextInt();
                                //llama al metodo delete del controlador
                                controladorHelicoptero.delete(codigo3);
                                System.out.println("El vehiculo con codigo "+codigo3+ " a sido eliminado");
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuHelicoptero !=5);
                    break;
                case 5:
                    //opcion para salir
                    System.out.println("Gracias ****");
                    break;
            }
        }while(opcionMenuPrincipal != 5);
    }
}
