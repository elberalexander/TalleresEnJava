
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Scanner Leer=new Scanner(System.in);
      boolean repetir=true; 
      int opcion=0;
      
     double ahorros=500000;
     String Titular="";
     String   Titular1= "elber";
     double Cantidad=0;
     while(repetir)
     {    
        MenuPrincipal();
        opcion=Leer.nextInt();
        switch(opcion)
        {
            case 1:
                System.out.println("Por favor ingrese nombre del titular de la cuenta");
                Titular=Leer.nextLine();
                    if (Titular1==Titular)
                    {
                        System.out.println("Por favor digite el valor a ingresar");
                        Cantidad=Leer.nextDouble();
                        if (Cantidad<0)
                            System.out.println("******No se aceptan valores negativos******");

                        if (Cantidad==0)
                            System.out.println("******El valor ingresado es cero por ende no se sumara nada a su cuenta******");

                        if	(Cantidad>0)
                        {
                            ahorros=ahorros + Cantidad;
                            System.out.printf("usted ha abonado a su cuenta un valor de: %s pesos \n",Cantidad);
                            System.out.printf("Su nuevo saldo es de: %s pesos \n",ahorros);
                        } 
                    }
                    else
                        System.out.println("******Titular ingresado no pudo ser encontrado******");
                    
            case 2:
                System.out.println("Por favor ingrese los datos solicitados");
                System.out.println("Por favor ingrese nombre del titular de la cuenta");
                Titular=Leer.nextLine();

                if (Titular1==Titular)
                {
                    System.out.println("Por favor digite el valor a retirar de su cuenta");
                        Cantidad=Leer.nextDouble();
                        if (Cantidad<0 || Cantidad>ahorros)
                        {
                            System.out.println("******No es posible realizar la transaccion******");
                            if (Cantidad>ahorros) 
                                System.out.println("No es posible llevar a cabo la transaccion devido a saldo insuficiente");

                            if (Cantidad<0)
                                System.out.println("No es posible llevar a cabo la transaccion devido a que haz ingresado un valor no valido");
                        }	
                        else
                        {
                         ahorros=ahorros-Cantidad;
                         System.out.printf("usted ha retirado la suma de: %s pesos \n", Cantidad);
                         System.out.printf("Su nuevo saldo es de: %s pesos\n", ahorros);
                        }
                }
                else
                    System.out.println("******Titular ingresado no pudo ser encontrado******");

               break;
            case 3:
                System.out.println("Por favor ingrese los datos solicitados");
                System.out.println("Por favor ingrese nombre del titular de la cuenta");
                Titular=Leer.nextLine();
                if (Titular1==Titular)
                    System.out.printf("Su saldo disponible es: %s pesos\n",ahorros);

                else
                    System.out.println("Titular ingresado no pudo ser encontrado");
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
    //-------Definiendo funciones--------
  public static void MenuPrincipal()
    {        
        System.out.println("Taller condicionales ejercicio 10 Su Banco Fiel");
        System.out.println("  ");
        System.out.println("Por favor elige una opcion digitando su valor correspondiente");
        System.out.println("'1' Realizar abonos de cuenta(Ingresos)");
        System.out.println("'2' Realizar retiros"); 
        System.out.println("'3' Consultar saldo"); 
        System.out.println("'4' Salir"); 
    }     
}
