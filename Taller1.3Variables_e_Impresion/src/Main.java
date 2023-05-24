
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
        // TODO code application logic here
          String  nombre,apellido,nombreMama,apellidoMama,nombreDelPapa,apellidoDelPapa;
        
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");   
        nombre=leer.nextLine();
        System.out.println("Por favor ingrese su apellido");
        apellido=leer.nextLine();
        System.out.println("Por favor ingrese el nombre de su madre");
        nombreMama=leer.nextLine();
        System.out.println("Por favor ingrese el apellido de su madre");
        apellidoMama=leer.nextLine();
        System.out.println("Por favor ingrese nombre de su padre");
        nombreDelPapa=leer.nextLine();
        System.out.println("Por favor ingrese el apellido de su padre");
        apellidoDelPapa=leer.nextLine();
        
        System.out.printf("Yo %s %s, soy hijo de %s %s y de %S %s ",nombre,apellido, nombreMama,apellidoMama,nombreDelPapa, apellidoDelPapa);//con printf puedo concatenar y mostrar en una linea de código varias variables
    }
    
}
