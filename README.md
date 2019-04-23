# Practica 03-Arquitectura-MVC
Tercera Practica de la Materia de Programación Aplicada

**NOMBRE:** José Quinde

**CARRERA:** Computacion

## OBJETIVO ALCANZADO:

El objetivo que se alcanzo fue implementar las diferentes interfaces aprendidas en los controladores de nuestras clases hijas para un manejo más óptimo de los objetos.
También se aprendió a realizar el crud de los objetos que nos sirve para manejar cada objeto ingresado dependiendo lo que el usuario pida.

## ACTIVIDADES DESARROLLADAS

**1.Crear un repositorio en GitHub con el nombre “Práctica 03 – Arquitectura MVC”**

Se procedió a crear el repositorio para la 3ra practica con el nombre dado.

**NOMBRE USUARIO:** JoseQ1996

**URL:** https://github.com/JoseQ1996/Pr-ctica-03-Arquitectura-MVC.git
 

**2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar varios commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).**

El repositorio se sincronizo con la practica anterior ya que sobre esa práctica seguimos trabajando los nuevos puntos dados, se realizó varios commits para los controladores
 

**3. Crear un paquete para los controladores y un paquete para la vista.**

Se creó el paquete para los controladores y un paquete para la vista
 
**4. Crear un controlador por cada clase hija. En total, cuatro controladores.**

Se creó un controlador para cada clase hija las cuales son Auto, Avión, Helicóptero y Moto.
 
**5. Al menos una clase Controlador debe ser implementada usando la interface List y la clase ArrayList.**

Se implementó el List y ArrayList para el controlador de la clase hija Auto.

<pre><code>
package est.ups.edu.ec.controladores;
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
</code></pre>

**6.Al menos una clase Controlador debe ser implementada usando la interface Set y la clase HashSet.**

Se implementó el Set y HashSet para la clase hija Avion.
<pre><code>
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
     * Constructor de la clase ControladorAvion que declara el Set como HashSet y inicializa el codigo en 0
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
</code></pre>
            
**7. Al menos una clase Controlador debe ser implementada usando la interface SortedSet y la clase TreeSet.**

Se implementó el SortedSet y el TreeSet a la clase Hija Helicoptero.
<pre><code>
package est.ups.edu.ec.controladores;
import est.ups.edu.ec.clases.Helicoptero;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *El controlador de la clase hija Helicoptero que implementa el SortedSet y el TreeSet en el Crud
 * 
 * @author José Quinde
 */
public class ControladorHelicoptero {
    //Declaracion de variables
    private SortedSet<Helicoptero>listaOrdenada;
    private int codigo;
    /**
     * Constructor de la clase ControladorHelicoptero que declara el SortedSet como TreeSet y inicializa el codigo en 0
     * 
     */
    public ControladorHelicoptero() {
        listaOrdenada= new TreeSet<>();
        codigo=0;
    }
    /**
     * Este metodo crea un objeto de la clase hija Helicoptero y lo añade al SortedSet
     * 
     * @param helicoptero 
     */            
    public void create(Helicoptero helicoptero){
        codigo++;
        helicoptero.setCodigo(codigo);
        listaOrdenada.add(helicoptero);
        System.out.println("Se a creado un Vehiculo con el codigo "+codigo);
    }
    /**
     * Este metodo pide el codigo de un objeto ya ingresado para despues mostrarlo
     * 
     * @param codigo
     * @return 
     */
    public Helicoptero read(int codigo){
        for (Helicoptero helicoptero : listaOrdenada) {
            if(helicoptero.getCodigo() == codigo){
                return helicoptero;
            }
        }
        return null;
    }
    /**
     * Este metodo actualiza un objeto ya ingresado a traves del codigo
     * 
     * @param helicoptero 
     */
    public void update(Helicoptero helicoptero){

            if(listaOrdenada.contains(helicoptero)){
                listaOrdenada.remove(helicoptero);
                listaOrdenada.add(helicoptero);
            }            
    }
    /**
     * Este metodo elimina un objeto ya creado con el codigo dado
     * 
     * @param codigo 
     */
    public void delete(int codigo){
        for (Helicoptero helicoptero:listaOrdenada) {
            if(helicoptero.getCodigo()==codigo){
                listaOrdenada.remove(helicoptero);
                break;
            }            
        }
    }
    /**
     * Este metodo lista todos los objetos dados de manera ordenada segun su Modelo
     * 
     */
    public void printAll(){
        System.out.println("LIsta ordenada por Modelo");
        for (Helicoptero : listaOrdenada) {
            System.out.println("---------------------");
            System.out.println(helicoptero);           
        }
    }
}
</code></pre>

**8. Al menos una clase Controlador debe ser implementada usando la interface Map y la clase HashMap o la interface Map y la clase TreeMap.**

Se implementó el Map y el HashMap a la clase hija Moto.
<pre><code>
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
</code></pre>
**9. Crear una clase “Principal”, en donde se demostrará el funcionamiento del sistema completo a través de la consola de java, usando menús y submenús para acceder a las opciones.**

Se creó en el paquete vista una clase principal en donde se implementa todos los controladores con el crud de cada uno, se creó un menú principal
<pre><code>
System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Auto");
            System.out.println("2. CRUD Moto");
            System.out.println("3. CRUD Avion");
            System.out.println("4. CRUD Helicoptero");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcionMenuPrincipal = entrada.nextInt();

</code></pre>
Como ejemplo mostrare el crud de Auto y el menú.
<pre><code>
//opcion para el crud auto
                    do{
                        System.out.println("MENU AUTO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Listar");
                        System.out.println("6. Regresar al menu principal");
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
                                if (controladorAuto.read(codigo2) != null) {
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
                                }else{
                                    System.out.println("El vehiculo no existe");
                                } 
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
                                //Listar los objetos ingresados
                                controladorAuto.printAll();
                                break;    
                            case 6:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuAuto !=6);
                    break;
</code></pre>
 

## RESULTADO(S) OBTENIDO(S):

•	Se mostrará a continuación el Menú principal y el ingreso al Crud del Auto
 
•	A continuación, se procederá a Crear un objeto.
 
•	Se creará otro objeto.
 
•	Se realizará un Read de un objeto con codigo 1.
 
•	Se procederá a realizar un Update del objeto con codigo 2.
 
•	Se procederá a listar todos los objetos y se notara que el objeto con codigo 2 fue modificado.
 
•	Se procederá a eliminar el objeto con codigo 1.
 
•	Nuevamente se lista para ver que el objeto con codigo 1 ha sido eliminado.
 
Este fue un ejemplo del crud de la clase Auto, todos los otros crud tienen el mismo funcionamiento, pero se implementaron diferentes interfaces en su controlador.




## CONCLUSIONES:

Como conclusión puedo decir que el aprender a utilizar las interfaces de List, Set, SortedSet y Map fueron de mucha utilidad para poder realizar el crud en nuestros controladores, aunque en mi opinión personal se me hace mucho más fácil el uso del Map.
También aprender a realizar un Crud para poder realizar el control de un objeto sin amontonar todo el codigo en una clase principal me parece mucho más factible.
## RECOMENDACIONES:

Como recomendación diría que siempre que se maneje clases con objetos se implemente obligatoriamente el uso de un controlador.

**Nombre de estudiante:** José Quinde
