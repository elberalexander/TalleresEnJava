
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        boolean vertical=true;
        boolean Horizontal=true;
        boolean Figura=true;
	int Vandera_Asteriscos;
        int asteriscos_imprimir=0;
        int Esp=10;
        int espacios_Imprimir=Esp;
        int asteriscos_Imprimir=asteriscos_imprimir;
        int menosEspacios=0;
        int numAsteriscos=0;
        int vanderaNoEscrbirAsteriscos=0;
	String x ="*";
        
        //--------
        System.out.println("Taller Ciclos ejercicio 2");
	while(Figura==true)
        {
            System.out.println(" ");
            while(Horizontal==true)
            {
                System.out.printf(" ");
                espacios_Imprimir=espacios_Imprimir-1;
                if(espacios_Imprimir==0)
                {
                    Horizontal=false;
                    menosEspacios=menosEspacios+1;
                    espacios_Imprimir=Esp-menosEspacios;
                    numAsteriscos=numAsteriscos+1;
                    vertical=true;    
                }
            }
             while(vertical==true)
            {
              Horizontal=true;
              asteriscos_Imprimir=asteriscos_Imprimir+1;
              System.out.printf("*");
              if(asteriscos_Imprimir==numAsteriscos)
              {
               vertical=false;	
               asteriscos_Imprimir=0;   
              }
              if(numAsteriscos>=Esp && asteriscos_Imprimir==0 )
              {
                numAsteriscos=numAsteriscos+1;
                vanderaNoEscrbirAsteriscos=vanderaNoEscrbirAsteriscos+1;
                Horizontal=false;
                vertical=true;
                System.out.println(" ");
                if(vanderaNoEscrbirAsteriscos>1) 
                {
                  vertical=false;	
                  Figura=false;  
                }
              }
		 
            }
        }
    }
    
}
