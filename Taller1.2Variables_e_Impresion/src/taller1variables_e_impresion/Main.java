/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1variables_e_impresion;

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
        String  nombre,apellido;
        int edad;
        float estatura;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");   
        nombre=leer.nextLine();
        System.out.println("Por favor ingrese su apellido");
        apellido=leer.nextLine();
        System.out.println("Por favor ingrese su edad");
        edad=leer.nextInt();
        System.out.println("Por favor ingrese su estatura");
        estatura=leer.nextFloat();
        System.out.println("su nombre es : "+ nombre+ " "+ " "+ apellido+" su edad es: "+edad+ " y estatura es: "+estatura );
    }
    
}
