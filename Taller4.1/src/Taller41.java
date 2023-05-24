
import java.util.Scanner;

public class Taller41 {

    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        boolean repetir=false;
        int opcion;	
	int VectorInformacion[]=new int[5];
	int DatosIngresados=0;
	int Numero_Repeticiones=4;
	int DatoIngresadoPorElUsuario;
	//------------------------
	
     do
        {
            MenuPrincipal();
            opcion=Leer.nextInt();
            switch(opcion)
            {
                case 1:
                    for (int i = 0; i<=Numero_Repeticiones; i++) 
                    {
                        System.out.printf("Por favor ingresa un valor para la posicion [%s] del vector \n",i);
                        DatoIngresadoPorElUsuario=Leer.nextInt();
                        VectorInformacion[i]=DatoIngresadoPorElUsuario;
                        if(i>=4)
                        System.out.println("haz llenado el valor maximo permitido para el vector, estos son los datos ingresados");
                    } 
                    for (int i = 0; i <=Numero_Repeticiones; i++)
                    {
                        System.out.printf("[%s] = %s\n",i ,VectorInformacion[i]);
                        
                    }										
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
