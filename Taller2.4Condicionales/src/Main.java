
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
        Scanner Leer=new Scanner(System.in); 
         int opcion =0;String novedad ="";
boolean anotacion;
         MenuPrincipal();
         opcion=Leer.nextInt();
     switch (opcion){
     
         case 1:
             System.out.println("Bienvenido a la opcion alquilar pelicula");
             
             break;
         case 2:
             System.out.println("Bienvenido al listado de peliculas disponibles");
             break;
         case 3:
             System.out.println("En breve recibiremos tu pelicula");
             System.out.println("Si desea reportar alguna novedad por favor digite TRUE de lo contrario digite FALSE");
             anotacion=Leer.nextBoolean();
                if (anotacion==true)
                    {
                     System.out.println("Por favor ingrese el daño o novedad que presenta la pelicula al momento de recepcionarla");
                       Leer.nextLine();
                       novedad=Leer.nextLine();                
                    }  
             System.out.printf("La pelicula ha sido recepcionada con las siguientes novedades: %s",novedad);
             break;
         default:
             System.out.println("Opcion no valida");
     }
        
    }
    public static void MenuPrincipal()
    {System.out.println("Taller condicionales ejercicio 4");
        System.out.println("Por favor elige una opcion digitando su valor correspondiente");
        System.out.println("'1' para alquilar pelicula");
        System.out.println("'2' para consultar peliculas disponibles");
        System.out.println("'3' Para recibir pelicula"); 
    }
}
