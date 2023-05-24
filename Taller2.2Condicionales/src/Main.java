
import java.util.Scanner;
/**
 *
 * @author elber
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
        int EdadPersona;
        System.out.println("Por favor ingrese su edad");
        EdadPersona=leer.nextInt();
            var Mensaje=edad(EdadPersona);
            System.out.println(Mensaje);        
    }
    
    static String edad(int edad)
    {
         String Mensaje;
        if (edad>=18)
        {
            Mensaje=" ";
        }
        else
            Mensaje="Usted aún es un niño";         
             
    return(Mensaje);    
    }    
}
