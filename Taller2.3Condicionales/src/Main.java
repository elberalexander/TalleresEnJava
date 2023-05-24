
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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
        String nombrePersona,apellido;
        System.out.println("Por favor digite su nombre");
        nombrePersona=leer.nextLine();
        System.out.println("Por favor digite su apellido");
        apellido=leer.nextLine();
        System.out.println("Por favor ingrese su edad");
        EdadPersona=leer.nextInt();
            var Mensaje=edad(EdadPersona);
            System.out.printf("%s %s %s   ",nombrePersona,apellido,Mensaje);           
    }
    //-----------Funciones--------
    static String edad(int edad)
    {
         String Mensaje;
        if (edad>=18)
        {
            Mensaje="Usted es mayor de edad, por lo tanto puede entrar a la fiesta";
        }
        else
            Mensaje="Usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuelvase a su casa";         
             
    return(Mensaje);    
    } 
}
