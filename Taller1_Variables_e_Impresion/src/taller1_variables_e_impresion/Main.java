/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1_variables_e_impresion;
import java.util.Scanner;
public class Main {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {//sout+tabulador
        String  nombre,apellido;
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");   
        nombre=leer.nextLine();
        System.out.println("Por favor ingrese su apellido");
        apellido=leer.nextLine();
        System.out.println("su nombre es : "+ nombre+ " "+ " "+ apellido);
    }
    
}
