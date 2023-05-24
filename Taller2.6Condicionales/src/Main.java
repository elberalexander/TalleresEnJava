
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Leer=new Scanner(System.in);
     int opcion=0;
     boolean repetir=true;
     boolean vanderaDeIngreso=false;
     boolean vanderaArreglos=false;
     String FechaDeIngreso="";
     String novedadesEncontradasPorElMecanico="";
     String arreglosRealizados="";
     String repuestosQueFueronCambiados="";
     String fechaDeSalida="";

String ObservacionesDelCliente="";
     while(repetir)
     {
 //         MenuPrincipal();
        System.out.println("");
        System.out.println("Por favor elige una opcion digitando su valor correspondiente");
        System.out.println("'1' Registrar ingreso de la motocicleta");
        System.out.println("'2' Arreglos realizados por el mecanico");
        System.out.println("'3' Registro de salida del taller");
        System.out.println("'4' Salir del sistema");
     opcion=Leer.nextInt();
        switch(opcion)
           {
            case 1:
                System.out.println("  ");
                Leer.nextLine();
               
                System.out.println("Por favor realize el ingreso de su motocicleta");
                System.out.println("Ingrese fecha de entrada del vehiculo");
                FechaDeIngreso=Leer.nextLine();
                System.out.println("Ingrese observaciones reealizadas por parte del cliente");
                ObservacionesDelCliente=Leer.nextLine();
                if (FechaDeIngreso!="" && ObservacionesDelCliente!="")
                    {
                        vanderaDeIngreso=true;
                    }
                else
                    System.out.println("Por favor complete los datos de ingreso");
            break;  
            case 2:
                if(vanderaDeIngreso==true)
                  {
                      System.out.println("Por favor registre las novedades encontradas y arreglos realizados a la motocicleta");
                      Leer.nextLine();
                      System.out.println("Por favor ingrese las novedades encontradas por el mecanico");
                      novedadesEncontradasPorElMecanico=Leer.nextLine();
                      System.out.println("Por favor ingrese los arreglos que fueron realizados");
                      arreglosRealizados=Leer.nextLine();
                      System.out.println("Por favor ingrese el listado de repuestos que fueron cambiados");
                      repuestosQueFueronCambiados=Leer.nextLine();
                      if(novedadesEncontradasPorElMecanico!=""&& arreglosRealizados!="" && repuestosQueFueronCambiados!="" )
                      {vanderaArreglos=true;
                      }
                  }
                else
                    System.out.println("RECUERDA QUE PRIMERO DEBES REEGISTRAR LA MOTOCICLETA");
            break; 
            case 3:
                if(vanderaArreglos==true)
                {
		    System.out.println("REGISTRO DE SALIDA DE LA MOTOCICLETA");
                    Leer.nextLine();
                    System.out.println("Por favor ingrese la fecha de salida de la motocicleta");
                    fechaDeSalida=Leer.nextLine();
                    System.out.println("RESUMEN DEL SERVICIO PRESTADO");
                    System.out.printf("FechaDeIngreso =%s\n",FechaDeIngreso);
                     System.out.printf("observacionesDelCliente =%s\n",ObservacionesDelCliente);
                     System.out.printf("novedadesEncontradasPorElMecanico =%s\n",novedadesEncontradasPorElMecanico);
                     System.out.printf("respuestosQueFueronCambiados = %s\n",repuestosQueFueronCambiados);
                     System.out.printf("arreglosRealizados = %s\n",arreglosRealizados);
                     System.out.printf("fechaDeSalida = %s",fechaDeSalida);
                }			// Resumen del servicio
		else
                    System.out.println("AÙN NO HAZ REGISTRADO LAS NOVEDADES ENCONTRADAS Y ARREGLOS REALIZADOS A LA MOTOCICLETA");
                    
            break; 
            case 4:
                repetir=false;
                System.out.println("Saliendo del sistema    ");
            break; 
            default:
            System.out.println("Opcion no valida");

           }
     }
     }    
     
    //--------------Definiendo funciones----------------------
   public static void MenuPrincipal()
    {        
    System.out.println("");
    System.out.println("Por favor elige una opcion digitando su valor correspondiente");
    System.out.println("'1' Registrar ingreso de la motocicleta");
    System.out.println("'2' Arreglos realizados ppor el mecanico");
    System.out.println("'3' Registro de salida del taller");
    System.out.println("'4' Salir del sistema");
    }
    
    }
   
     
      
    

