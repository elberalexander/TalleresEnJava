
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
    public static void main(String[] args) 
 {
     Scanner Leer=new Scanner(System.in);
     int opcion=0;
     boolean compra, devolver;
     int opcionCompra;
     String devolucion;
     
     MenuPrincipal();
     opcion=Leer.nextInt();     
     switch(opcion)
     {
         case 1:
             System.out.println("Por favor seleccione el producto a comprar");
             compra=true;
                if (compra==true)
                    {
                        System.out.println("Por favor seleccione una opcion de nuestro listado de productos, digitando el valor de la opcion");   
                        System.out.println("1 Analgesicos");
                        System.out.println("2 Antihistaminico");
                        System.out.println("3 Antibioticos");
                        
                        opcionCompra=Leer.nextInt();
                         
                        switch(opcionCompra)
                        {
                            case 1:
                                   System.out.println("Haz comprado un analgesico, gracias por tu compra");
                                   break;
                            case 2:
                                   System.out.println("Haz comprado un Antihistaminico, gracias por tu compra");
                                   break;
                            case 3:
                                   System.out.println("Haz comprado un Antibioticos, gracias por tu compra");
                                   break;
                            default:
                                System.out.println("Opcion no valida");                                
                        }    
                    }
             break;
         case 2:
             System.out.println("Bienvenido aqui podras consultar precios por producto");
             break;
         case 3:
             System.out.println("Bienvenido aqui podras realizar devoluciones de tus productos adquiridos");
            
             System.out.println("Por favor indiquenos el motivo de su devolucion para luego hacerla efectiva");
              Leer.nextLine();
             devolucion=Leer.nextLine();
				devolver=true;
				if (devolver == true)
                                {System.out.printf("El medicamento presenta: %s",devolucion);
                                }
              break;                  
         default:
             Leer.nextLine();
             System.out.println("Opcion no valida");
     
     }
     
  }
    //Definiendo funciones
    static void MenuPrincipal()
    {int opcion;
    
        System.out.println("Taller condicionales ejercicio 5 Drogueria mi salud");
        System.out.println("");
        System.out.println("Por favor elige una opcion digitando su valor correspondiente");
        System.out.println("'1' Comprar un producto");
        System.out.println("'2' Consultar precios por producto");
        System.out.println("'3' Devoluciones");
      }
    
}
