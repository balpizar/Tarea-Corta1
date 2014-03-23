



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Braulio
 */
public class Mate {// Clase en donde se realiza la llamada de la libreria externa
   protected static void ruta(String ruta){
       //System.out.println(System.getProperty("os.arch"));
        System.load(ruta);// Carga la ruta en donde se encuentra la libreria dinamica
        
   }
   //Metodos nativos en donde se realiza la ejecucion de las operaciones basicas
    public native double suma( double dig1, double dig2);
    
    public native double resta( double dig1, double dig2);
    
    public native double multip( double dig1, double dig2);
    
    public native double divs( double dig1, double dig2);
    
    
}
