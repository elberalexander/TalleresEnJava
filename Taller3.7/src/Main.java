
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        boolean repetir=true; 
        //boolean salirDeContactos=true;
        String PlacaDelVehiculo="";
	String MarcaDelVehiculo="";
	String NombreCliente="";
	String TelefonoDelCliente="";
	String DatosCliente_Automovil;
        String MaximoVehiculos[]=new String[5];
	int j;
	boolean Salir=true;
	boolean AutosParqueados=false;
	int CarrosIngresados=0;
	boolean continuar=true;
	int Numero_Repeticiones=0;
	int i;
	int N=10;
	String DatosCliente="";
	String Esp="-";
	String DatosAutomovil="";
	int NumeroContactosGuardar=0;
		
	int PosicionAutoSaliente=0;
	boolean RegistrarSalida=false;
	int opcion;
        //--
        do
        {
            continuar=true;
            AutosParqueados=false;
            MenuPrincipal();
            opcion=Leer.nextInt();
            switch(opcion)
            {
                case 1:
                    while(continuar==true && CarrosIngresados<5)
    {
                        for (int k = 0; k <=Numero_Repeticiones ; k++) 
                        {   
                            System.out.println(" ");
                            System.out.printf("---Usted esta ingresando Datos del vehiculo número %s ----\n",CarrosIngresados+1);
                            Leer.nextLine();
                            while(PlacaDelVehiculo=="")
                            {
                                System.out.println("Por favor ingrese la placa del vehiculo"); 
                                PlacaDelVehiculo=Leer.nextLine()+"-";
                            }
                            while(MarcaDelVehiculo=="")
                            {
                                System.out.println("Por favor ingrese Marca del vehiculo"); 
                                MarcaDelVehiculo=Leer.nextLine()+"-";
                            }
                            System.out.printf("--- Usted esta ingresando Datos del propietario,del vehiculo de placa: %s---\n",PlacaDelVehiculo);
                            System.out.println("  ");
                             while(NombreCliente=="")
                            {
                                System.out.println("Por favor ingrese el nombre del cliente"); 
                                NombreCliente=Leer.nextLine()+"-";
                            }
                              while(TelefonoDelCliente=="")
                            {
                                System.out.println("Por favor ingrese número telefonico del cliente"); 
                                TelefonoDelCliente=Leer.nextLine();
                            }
                            
                            DatosAutomovil=PlacaDelVehiculo+MarcaDelVehiculo;
                            DatosCliente=NombreCliente+TelefonoDelCliente;
                            DatosCliente_Automovil=DatosAutomovil+DatosCliente;
                            MaximoVehiculos[CarrosIngresados]=DatosCliente_Automovil; 
                            PlacaDelVehiculo="";
                            MarcaDelVehiculo="";
                            NombreCliente="";
                            TelefonoDelCliente="";
                            System.out.println(MaximoVehiculos[CarrosIngresados]);
                            System.out.println("Digite true o false para agregar otro contacto");
                            continuar=Leer.nextBoolean();
                            if (continuar==true) 
                                    CarrosIngresados=CarrosIngresados+1;
                            else
                            {
                                continuar=false;
                                  CarrosIngresados=CarrosIngresados+1;    
                            }
                        }
                        if(CarrosIngresados>=5)
                            System.out.println("haz completado el cupo maximo de parqueo el cual corresponde a 5 automoviles, a continuación te redirigiremos al Menú Principal");                     
                    }
                break;
                case 2:
                    if(CarrosIngresados==0)
                        Salir=false;				
                    
                    if(Salir==false)
                    {
                        Salir=SinRegistrarCarros(Salir);
//                        while(Salir==false)
//                        {
//                        System.out.println("--- El paqueadero aún no registra automoviles dentro de nuestras instalaciones ----");
//                        System.out.println("digite true para volver al menú principal, segun sea el caso");
//                        System.out.println(" ");
//                        Salir=Leer.nextBoolean();                        
//                        }
                    }                
                    else
                    {
                        while(AutosParqueados==false)
                        {
                            System.out.println("---lista de vehiculos----");
                            for (int k = 0; k <=CarrosIngresados-1; k++) 
                            {
                                System.out.printf("Automovil %s %s\n",k+1,MaximoVehiculos[k]);
                            }
                            System.out.println("Digite true para volver al menú principal");
                            AutosParqueados=Leer.nextBoolean();
                        }     
                    }
                          
                                             		
                break;
                case 3:	
                    if(CarrosIngresados==0)
                        Salir=false;				
                    if(Salir==false)
                    {
                       Salir=SinRegistrarCarros(Salir);
                    }
                    else
                    {
                        while(AutosParqueados==false)
                        {
                            System.out.println("---listado de vehiculos parqueados----");
                            for (int k = 0; k <=CarrosIngresados-1; k++) 
                            {
                                System.out.printf("Vehiculo: %s, %s \n",k+1,MaximoVehiculos[k]);
                                
                            }
                            System.out.println("¿Desea registrar la salida de un vehiculo?, responda true o false segun sea el caso");
                            RegistrarSalida=Leer.nextBoolean();

                            if(RegistrarSalida==true)
                            {
                                System.out.println("Por favor ingrese el número que representa al vehiculo que sale de nuestras instalaciones");
                                PosicionAutoSaliente=Leer.nextInt();
                                for (int k =PosicionAutoSaliente-1; k <=CarrosIngresados-2 ; k++) 
                                {
                                    MaximoVehiculos[k]=MaximoVehiculos[k+1];
                                    
                                }
                                System.out.println("El carro ha salido por ende ha sido eliminado de nuestro registro");
                                CarrosIngresados=CarrosIngresados-1;
                            }
                            else
                            {
                                System.out.println("Usted esta siendo redirigido al menu principal");
                                AutosParqueados=true;
                                
                            }  
                        }
                       }
                   
                  
                break;
                case 4:
                     repetir=false;
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("*******Opcion no valida*******");
            }
			
        }                
	while (repetir);
    }
    // funcion
    public static void MenuPrincipal()
    {        
        System.out.println("  ");
        System.out.println("------------Por favor elige una opcion---------------");
        System.out.println("1 Registrar Ingreso de vehiculos");
        System.out.println("2 Consultar vehiculos en el Parqueadero");
        System.out.println("3 Registrar Salida de un vehiculo");
        System.out.println("4 Salir del sistema");
    }
    public static boolean SinRegistrarCarros(boolean Salir)
    {Scanner Leer=new Scanner(System.in);
        
        while(Salir==false)
        {
        System.out.println("--- El paqueadero aún no registra automoviles dentro de nuestras instalaciones ----");
        System.out.println("digite true para volver al menú principal, segun sea el caso");
        System.out.println(" ");
        Salir=Leer.nextBoolean();                        
        }
        return(Salir);
    }
    
}
