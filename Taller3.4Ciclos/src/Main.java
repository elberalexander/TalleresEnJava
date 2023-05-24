
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner Leer= new Scanner(System.in);
      int valor_inicio; 
        int Tabla_Ejecutar; 
	int Resultado;//opciones del menú
	       System.out.println("Taller Ciclos ejercicio 4 Tabla de multiplicar");	
	
	//-------------------Inicia Proceso------------------------
	//Repetir	
        System.out.println("Por Favor ingrese el valor de la tabla de multiplicar que desea ejecutar");
		Tabla_Ejecutar=Leer.nextInt();
		      System.out.println(" ");
                      System.out.printf("Usted esta ejecutando la tabla del %s\n",Tabla_Ejecutar);
		
		for (valor_inicio=0; valor_inicio<=10;valor_inicio ++)
                {
                    Resultado=Tabla_Ejecutar*valor_inicio;
                    System.out.printf("%s X %s = %s\n",Tabla_Ejecutar,valor_inicio,Resultado);
			
                    
                }	
	//Hasta Que	Figura=Falso
		
    }
    
}
