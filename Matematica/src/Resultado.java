
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Braulio
 */
public class Resultado extends Mate {// clase que actua como controlador entre interfaz y logica
    
    protected double resultado(double var1, double var2, String tipo){// Realiza la llamada de los metodos nativos
    double result=0;
        switch (tipo) {
            case "Suma":
                result=suma(var1,var2);
                break;
            case "Resta":
                result=resta(var1,var2);
                break;
            case "División":
                result=divs(var1,var2);
                break;
            case "Multiplicación":
                result=multip(var1,var2);
                break;
     }
    
    return result;
    }
    protected int libreria(String lib){// Realiza la conexion con la libreria externa
       try{
            ruta(lib);
            return 1;
        }
      
       catch(UnsatisfiedLinkError e){
               return 0;
            }
    }
}
