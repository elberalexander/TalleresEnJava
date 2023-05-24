/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1.variables_e_impresion;

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
          String  nombreDeLaCiudadCapital,nombreDelPaisAlQuePerteneceLaCiudadCapital;
        
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre de una ciudad capital");   
        nombreDeLaCiudadCapital=leer.nextLine();
        System.out.println("Por favor ingrese el nombre del país al que pertenece la ciudad capital");
        nombreDelPaisAlQuePerteneceLaCiudadCapital=leer.nextLine();
        
        
        System.out.printf("La ciudad %s es la capital del pais %s ",nombreDeLaCiudadCapital,nombreDelPaisAlQuePerteneceLaCiudadCapital);
    }
    
}
