
import java.util.Scanner;


public class main {

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
       boolean repetir=true; 
        boolean VanderaNombre=false;
	String Nombre=" " ;
	int opcion;
        //-----------------------------------
        System.out.println("Taller ciclos ejercicio 5 Menú infinito");
	do
        {
            System.out.println("  ");
            System.out.println("------------Por favor elige una opcion---------------");
            System.out.println("1 Capturar nombre");
            System.out.println("2 Saludar persona");
            System.out.println("3 Salir del sistema");
            opcion=Leer.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Por favor ingrese su nombre");
                    Leer.nextLine();
                    Nombre=Leer.nextLine();
                    if(Nombre=="")
                        System.out.println("Disculpa pero no haz ingresado ningun nombre");
                    else
                    {
                        System.out.printf("Tu nombre es :%s\n",Nombre);
                        VanderaNombre=true;
                    }
			
                break;
                case 2:
                    if (VanderaNombre==true)
                        System.out.printf("Hola, %s\n", Nombre);
                    else
                        System.out.println("Aún no haz registrado tu nombre, para ello ingresa a la opcion 1");		
                break;
                case 3:
                     repetir=false;
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("*******Opcion no valida*******");
            }
			
        }                
	while (repetir);
    }
    
}
