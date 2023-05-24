
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args)
  {
      Scanner Leer=new Scanner(System.in);
      boolean repetir=true; 
      int opcion=0;
     double Area=0;
      double base1= 0;
      double base2=0;
      double altura=0;
        while(repetir)
     {    
        MenuPrincipal();
        opcion=Leer.nextInt();
        switch(opcion)
        {
            case 1:
                System.out.println("Por favor ingrese los datos solicitados");
                System.out.println("Por favor ingrese la medida de la base  del rectangulo en cm");
		base1=Leer.nextDouble();
                 System.out.println("Ingrese la altura del rectangulo en cm"); 
                 altura=Leer.nextDouble();
                  if (base1!=0 && altura!=0)
                  {
                    Area=base1*altura;
                    System.out.printf("El area del rectangulo es= %s cm^2\n",Area);
                  }
                    else
                    System.out.println("Por favor complete los datos solicitados de lo contrario no sera posible realizar el calculo");
		break;
            case 2:
                System.out.println("Por favor ingrese los datos solicitados");
                System.out.println("Por favor ingrese la medida de la base  del triángulo en cm");    
		base1=Leer.nextDouble();
                System.out.println("Ingrese la altura del triangulo en cm");
		altura=Leer.nextDouble();
		if (base1!=0 && altura!=0)
                {
                    Area=(base1*altura)/2;
                    System.out.printf("El area del triángulo es= %s cm^2\n", Area);
                }
                else
                    System.out.println("Por favor complete los datos solicitados de lo contrario no sera posible realizar el calculo");
                break;
            case 3:
                System.out.println("Por favor ingrese los datos solicitados");
                System.out.println("Por favor ingrese la medida de la base1  del trapecio en cm");
                base1=Leer.nextDouble();
                System.out.println("Por favor ingrese la medida de la base2  del trapecio en cm");
		base2=Leer.nextDouble();
                System.out.println("Ingrese la altura del trapecio en cm");
		altura=Leer.nextDouble();
                if (base1!=0 && base2!=0 && altura!=0)
                {
                        Area=((base1+base2)*altura)/2;
                        System.out.printf("El area del trapecio es= %s cm^2\n",Area);

                }
                else
                    System.out.println("Por favor complete los datos solicitados de lo contrario no sera posible realizar el calculo");
					
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
  public static void MenuPrincipal()
    {        
        System.out.println("Taller condicionales ejercicio 9 Profesor de geometria");
        System.out.println("  ");
        System.out.println("Por favor elige una opcion digitando su valor correspondiente");
        System.out.println("'1' Calcular el area de un rectangulo");
        System.out.println("'2' Calcular área de un triángulo"); 
        System.out.println("'3' Calcular área de un trapecio"); 
        System.out.println("'4' Salir"); 
    }   
}
