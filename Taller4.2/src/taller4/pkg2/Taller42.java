/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4.pkg2;

import java.util.Scanner;
import java.util.Random;
public class Taller42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner Leer=new Scanner(System.in);  
        Random Aleatorio=new Random();
        boolean repetir=false;
        String resultadoImpar;
        String AuxiliarImp=" ";
	String resultadoImpar1;
	int opcion;
	int i;
	int VectorInformacion[]=new int[20];
	int DatosIngresados=0;
	int Numero_Repeticiones=7;
	int Numero_Repeticiones1=0;
	int DatoIngresadoPorElUsuario;
	String ClasificandoNumeros[]=new String[2];
	int NumerosImpares[]=new int[19];
	int ContadorPar=0;
	int ContadorImpar=1;
        int numeroAleatorio;
	String resultadoPar;
        String Auxiliar="";
	String resultadoPar1="";
     
     do
        {
            MenuPrincipal();
            opcion=Leer.nextInt();
            System.out.println("   ");
            switch(opcion)
            {
                case 1:
                    while(Numero_Repeticiones1 <=Numero_Repeticiones)
                    {   numeroAleatorio=(int)Aleatorio.nextInt(1,100);
                        System.out.println(numeroAleatorio);
                        VectorInformacion[Numero_Repeticiones1]=numeroAleatorio;
                        Numero_Repeticiones1=Numero_Repeticiones1+1;
                    }
                        	
                        for(i=0; i<=Numero_Repeticiones;i++)
                        {
                            if(VectorInformacion[i]%2==0)
                            {
                                resultadoPar=VectorInformacion[i]+" ";	
                                Auxiliar=Auxiliar+resultadoPar;
                                ClasificandoNumeros[ContadorPar]=Auxiliar;                                
                            }
                            else
                            {
                                resultadoImpar=VectorInformacion[i]+" ";	
                                AuxiliarImp=AuxiliarImp+resultadoImpar;
                                ClasificandoNumeros[ContadorImpar]=AuxiliarImp;
                               
                            }
                        }
                        System.out.printf("Números impares: %s \n",ClasificandoNumeros[ContadorImpar]);
                        System.out.printf("Números pares: %s\n",ClasificandoNumeros[ContadorPar]);
														
                break;
               
                case 2:
                     repetir=false;
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("*******Opcion no valida*******");
            }
			
        }                
	while (repetir);
    }
    public static void MenuPrincipal()
    {        
        System.out.println("  ");
        System.out.println("------------Por favor elige una opcion---------------");
        System.out.println("1 Llenar Vector");
        System.out.println("2 Salir del sistema");
    }
}
