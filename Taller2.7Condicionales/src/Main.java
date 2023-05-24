
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner Leer=new Scanner(System.in);
        int opcion=0;
        boolean repetir=true;   
        String nombre ="";  
        double pesoEnKilogramos=0;
        double estaturaEnMetros=0;
        double IMC=0;
        System.out.println("");
        while(repetir)
        {
        MenuPrincipal();
        opcion=Leer.nextInt();
        switch(opcion)
        {
            case 1:
                System.out.println("Taller condicionales ejercicio 7");
                Leer.nextLine();
                System.out.println("Por favor ingrese su nombre");
                nombre=Leer.nextLine();
                System.out.println("Por favor digite su peso en kilogramos");
                pesoEnKilogramos=Leer.nextDouble();
                System.out.println("Por favor ingrese su estatura en metros");
                estaturaEnMetros=Leer.nextDouble();
                if (pesoEnKilogramos!=0 && estaturaEnMetros!=0)
                   {
			IMC=(pesoEnKilogramos/(estaturaEnMetros*estaturaEnMetros));
                            if (IMC<18.5)
                                    System.out.printf("Señor(a) %s Su indice de masa corporal (IMC) es de :%s Por lo tanto esta bajo de peso\n",nombre,IMC);
                            
                            if ((IMC>=18.5)&& (IMC<=24.9))
                                   System.out.printf("Señor(a) %s, Su indice de masa corporal IMC es de :%s, por lo tanto su rango de peso es saludable\n", nombre, IMC);
                            
                            if ((IMC>=25.0) && (IMC<=29.9))
                                    System.out.printf("Señor(a) %s, Su indice de masa corporal IMC es de :%s, por lo tanto usted se encuentra en sobrepeso\n", nombre, IMC);
                            
                            if (IMC>=30.0)
                                  System.out.printf("Señor(a), %s, Su indice de masa corporal (IMC) es de :%s, Por lo tanto, usted se encuentra en sobrepeso", nombre, IMC);
                            
                    }            
                     else
                    System.out.println("No podemos calcular el indice de peso corporal debido a que no completaste los datos solicitados");
		
                break;
            case 2:
                repetir=false;
                System.out.println("Saliendo del sistema    ");
                break;
            default:
                    System.out.println("Opcion no  valida");            
          
            
        }
     
    
    }
    
    }
    //--------------Definiendo funciones----------------------
    public static void datosPersona()
   { 
        String nombre ="";  
        double pesoEnKilogramos=0;
        double estaturaEnMetros=0;
        Scanner Leer=new Scanner(System.in);
       System.out.println("Taller condicionales ejercicio 7");
       System.out.println("Por favor ingrese su nombre");
       nombre=Leer.nextLine();
       System.out.println("Por favor digite su peso en kilogramos");
       pesoEnKilogramos=Leer.nextDouble();
       System.out.println("Por favor ingrese su estatura en metros");
       estaturaEnMetros=Leer.nextDouble();
   }
    public static void MenuPrincipal()
    {        
    System.out.println("");
    System.out.println("Por favor elige una opcion digitando su valor correspondiente");
    System.out.println("'1' Calcular indice de masa corporal IMC");
    System.out.println("'2' Salir del sistema");   
    }
    
    
}