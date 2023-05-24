
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Leer=new Scanner(System.in);
         int Esp=10;
         int Rep_Esp=Esp;
         int contador=0;
         int Finalizar_Programa=2*Esp;
         int AsteriscosB;
         int AsteriscosBase=Esp+1;
         int espacios_Imprimir=Esp;
         int asteriscos_imprimir=1;
         int ReducirEspacios=0;
         int numAsteriscos=0;
         int asteriscos_Imprimir=asteriscos_imprimir;
         
         boolean RehabilitarDibujarAsteriscos=false;
         boolean Vandera_Deshabilitar_Espacios=false;
         boolean Vandera_RepetirEspacios=false;
         boolean DibunjarAsteriscos=true;
         boolean DibujarEspacios=true;
         boolean Figura=true;
        //-- 
       
        //--------
        
         System.out.println("Taller Ciclos ejercicio 3");
	do
        {
            
            //--------------------
            do 
            {  
                System.out.print(" ");
		espacios_Imprimir=espacios_Imprimir-1;
			
			if (espacios_Imprimir==0)
                        {
                            DibujarEspacios=false;
                            ReducirEspacios=ReducirEspacios+1;
                            espacios_Imprimir=Esp-ReducirEspacios;
                            //numAsteriscos<-numAsteriscos+1;
                            DibunjarAsteriscos=true;
                            if (Esp==ReducirEspacios)//esto para iniciar la base nuevamente con espacios
                            {
                                Esp=Esp-1;
                                ReducirEspacios=0;
                                espacios_Imprimir=Esp-ReducirEspacios;
                                Vandera_Deshabilitar_Espacios=true;
                                RehabilitarDibujarAsteriscos=true;
                            }
                            if (Vandera_RepetirEspacios==true)
                            {
                                Esp=Rep_Esp-1;
                                ReducirEspacios=0;
                                espacios_Imprimir=Esp-ReducirEspacios;
                            }
                        }
             
            }
            while(DibujarEspacios==true); 
            
            //----------------------
            do
            {
			if (Vandera_Deshabilitar_Espacios==false)
                        {
				DibujarEspacios=true;	
                        }
			//Vandera_Asteriscos<-Esp -1;
                        System.out.printf("*");
			numAsteriscos=numAsteriscos+1;
			if (asteriscos_Imprimir==numAsteriscos)
                        {
                                System.out.println(" ");
				DibunjarAsteriscos=false;	
				numAsteriscos=0;
				asteriscos_Imprimir=asteriscos_Imprimir+2;
				AsteriscosB=1;
				AsteriscosBase=AsteriscosBase-1;
				Finalizar_Programa=Finalizar_Programa-1;
                                
				if(RehabilitarDibujarAsteriscos==true)
                                {
                                    DibunjarAsteriscos=true;//con esta linea dejo activada los asteriscos y deshabilito espacios
                                    Vandera_Deshabilitar_Espacios=false;
                                    RehabilitarDibujarAsteriscos=false;
                                }
				if(AsteriscosB==1 && AsteriscosBase==0)
                                {
                                    asteriscos_Imprimir=3;
                                    AsteriscosBase=1;
                                    contador=contador+1;
                                    if(contador==1)
                                    {
                                        Vandera_RepetirEspacios=true;
                                    }
                                    if(contador==2)//aqui garantizo que unicamente se repita 2 veces la
                                            //los dos filas de la base que tiene 3 asteriscos.
                                    {
                                        Vandera_RepetirEspacios=false;
                                        AsteriscosBase=20;
                                    }
                                }
                        }
			AsteriscosB=0;
			if(Finalizar_Programa==0)
				Figura=false;
			
                }                
		while(DibunjarAsteriscos==true);
            
            
            //--------------------------
        }
        while(Figura==true);
        System.out.println(" ");
        System.out.println("La parte del tronco es dinamico de acuerdo al valor que se de en la variable ESP");
       
    }
    
}
