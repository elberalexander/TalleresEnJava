
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
        String  nombreDeLaMascota,TipoDeMascota,nombreDelPropietario;
        int edadDeLaMascota;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre de su mascota");   
        nombreDeLaMascota=leer.nextLine();
        System.out.println("Por favor ingrese el tipo de mascota");
        TipoDeMascota=leer.nextLine();
        System.out.println("Por favor ingrese la edad de su mascota");
        edadDeLaMascota=leer.nextInt();
        leer.nextLine();//Esta linea la ingrese devido a que el compilador me saltaba la linea de còdigo siguiente, es decir no solicitaba el dato.
        System.out.printf("Por favor ingrese nombre completo del propietario");
        nombreDelPropietario=leer.nextLine();
//        
//        System.out.println("Por favor ingrese cual es su tipo de mascota");
//        TipoDeMascota=leer.nextLine();
        
        
               
        System.out.printf("%s es un %s, el cual, tiene %d años de edad y %s es actualmente su propietario",nombreDeLaMascota, TipoDeMascota,edadDeLaMascota,nombreDelPropietario);
    }
    
}
