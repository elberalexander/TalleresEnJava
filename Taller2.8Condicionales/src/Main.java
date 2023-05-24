
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Scanner Leer=new Scanner(System.in);
        int opcion=0;
        int PorcionesDelPastel=0;
        int NumeroDePedido=0;
        int TortasDisponibles=10;
        String SaborDelPastel="";
        String Decoracion="";
        boolean VanderaDePedido;
        boolean repetir=true;  
        while(repetir)
     {    
        MenuPrincipal();
        opcion=Leer.nextInt();
        switch(opcion)
        {
            case 1:
                System.out.println("'Hola buen dia', Por favor registre su pedido");
                Leer.nextLine();
                System.out.println("Por favor digite las caracteristicas de su pastel de acuerdo a lo siguiente");
                System.out.println("Digite el sabor de su pastel");
                SaborDelPastel=Leer.nextLine();
                System.out.println("Numero de porciones del pastel");
                PorcionesDelPastel=Leer.nextInt();
                Leer.nextLine();
                System.out.println("Por favor escriba la decoracion deseada");
                Decoracion=Leer.nextLine();

                    if (SaborDelPastel!="" && PorcionesDelPastel!=0 && Decoracion!="")
                    {
                            VanderaDePedido=true;
                            NumeroDePedido=NumeroDePedido+1;
                            System.out.printf("Su pedido es el número %s,y sus caracteristicas son, sabor: %s, Porciones del pastel: %s porciones, Decoracion: %s",NumeroDePedido,SaborDelPastel,PorcionesDelPastel,Decoracion);
                    }	
                    else
                         System.out.println("Por favor complete los datos de ingreso de lo contrario no sera posible tomar su pedido");

                break;
            case 2:
                    if(TortasDisponibles!=0)
                    {
                        TortasDisponibles=TortasDisponibles-NumeroDePedido;
                        System.out.printf("Se han vendido: %s tortas durante el transcurso dia\n", NumeroDePedido);
                        System.out.printf("Tortas disponibles: %s \n",TortasDisponibles);
                    }                        
                    else
                        System.out.println("De momento se han agotado el numero de tortas disponibles\n");				             
                break;
            case 3:
                if (NumeroDePedido!=0)
                    System.out.printf("Se han realizado %s Ventas durante el transcurso del dia\n", NumeroDePedido);
                else
                    System.out.println("AÙN NO SE HAN REGISTRADO PEDIDOS");
                    System.out.printf("Tenemos un total de : %s Tortas disponibles, para que tu puedas realizar tu pedido\n",TortasDisponibles);
		
                break;    
            case 4:
                repetir=false;
                System.out.println("Saliendo del sistema    ");
                break;
            default:
                    System.out.println("Opcion no  valida");            
          
            
        }
      }    
    }
    //--------------definiendo funciones---------------------
    public static void MenuPrincipal()
    {        
        System.out.println("");
        System.out.println("Por favor elige una opcion digitando su valor correspondiente");
        System.out.println("'1' Registro de pedido");
        System.out.println("'2' Tortas disponibles"); 
        System.out.println("'3' Ventas realizadas durante el dia"); 
        System.out.println("'4' Salir"); 
    }
  
    
}
