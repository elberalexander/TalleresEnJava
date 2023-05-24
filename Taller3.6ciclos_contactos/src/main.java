
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        int j;
	boolean Salir=true;
	boolean salirDeContactos=false;
	int ContactosIngresados=0;
	boolean continuar=true;
	int Numero_Repeticiones=0;
        boolean repetir=true; 
	//String Contactos;
	int i ;
	int N =10;
	String contactoCom="";
	String Esp="-";
	String FullContacto="";
	int NumeroContactosGuardar=0;
	String ContactoOrganizacion="";
	String ContactoTelefono="";
	String NombreCompleto="";
	int PosicionContactoEliminar=0;
	boolean DeseaEliminarContacto=false;
	int opcion;
        String Contactos[]=new String[3];
        
        //opciones del menú
	do
        {
            continuar=true;
            salirDeContactos=false;
            System.out.println("  ");
            System.out.println("------------Por favor elige una opcion---------------");
            System.out.println("1 Añadir Contactos");
            System.out.println("2 Buscar Contactos");
            System.out.println("3 Eliminar Contactos");
            System.out.println("4 Salir del sistema");
            opcion=Leer.nextInt();
            switch(opcion)
            {
                case 1:
                    while (continuar==true && ContactosIngresados<3)
                    {
                        for(i=0;i<= Numero_Repeticiones;i++)
                        {
                            System.out.println(" ");
                            System.out.printf("---Usted esta ingresando Datos del contacto numero %s --- \n",ContactosIngresados+1);
                            Leer.nextLine();
                            while(NombreCompleto=="")
                            {
                                System.out.println("Por favor ingrese nombre completo del contacto agregar"); 
                                NombreCompleto=Leer.nextLine();                                                    
                            }
                             while(ContactoTelefono=="")
                            {
                                System.out.println("Por favor ingrese número telefonico"); 
                                ContactoTelefono=Leer.nextLine();                                                    
                            }
                              while(ContactoOrganizacion=="")
                            {
                                System.out.println("Por favor ingresa la organizacion"); 
                                ContactoOrganizacion=Leer.nextLine();                                                    
                            }
                            FullContacto=NombreCompleto+" "+ContactoTelefono;
                            contactoCom=FullContacto+" "+ContactoOrganizacion;

                            Contactos[ContactosIngresados]=contactoCom; 
                            NombreCompleto="";
                            ContactoTelefono="";
                            ContactoOrganizacion="";
                            System.out.println(Contactos[ContactosIngresados]);
                            System.out.println("Responda true(verdadero) o false(falso) para agregar otro contacto");
                            continuar=Leer.nextBoolean();
                            if(continuar==true)
                                ContactosIngresados=ContactosIngresados+1;
                            else
                            {
                                continuar=false;
                                ContactosIngresados=ContactosIngresados+1; 
                            }	
                        }   
                    }
                        
					
                    if(ContactosIngresados>=3)
                        System.out.println("haz completado el numero maximo de contactos que podemos guardar ahora te redirigiremos al Menú Principal");
			
                break;
                case 2:
                    if (ContactosIngresados==0)
			Salir=false;
                    if (Salir==false)
                    {
                        while (Salir==false)
                        {
                            System.out.println("---Aun no tienes contactos registrados----");
                            System.out.println("digite `true` para salir");
                            Salir=Leer.nextBoolean();
                        }
                                     
                    }
                    else
                    {
                        while(salirDeContactos==false)
                        {
                            System.out.println("---lista de contacto----");
                            for (int k = 0; k <=ContactosIngresados-1; k++) 
                            {
                                System.out.printf("contacto %s = %s \n",k+1,Contactos[k]);
                             }
                            System.out.println("digite true para salir");
                            salirDeContactos=Leer.nextBoolean();
                            
                        }
                    }
                          		
                break;
                case 3:	
                    if(ContactosIngresados==0)
			Salir=false;
                    

                    if(Salir==false)
                    {
                        while(Salir==false)
                        {
                            System.out.println("---Aun no tienes contactos registrados----");
                            System.out.println("digite `true` para salir");
                            Salir=Leer.nextBoolean();
                        }   
                    }
                    else
                    {
                        while(salirDeContactos==false)
                        {
                            System.out.println("---lista de contactos----");
                            for (int k = 0; k <=ContactosIngresados-1; k++) 
                            {
                                System.out.printf("contacto %s = %s \n",k+1,Contactos[k]);   
                            }
                            System.out.println("¿Desea eliminar un contacto?, responda true(1) o false(0) segun su eleccion");
                            DeseaEliminarContacto=Leer.nextBoolean();
                            
                               if (DeseaEliminarContacto==true)
                               {
                                   System.out.println("Por favor ingrese el numero que representa el contacto a eliminar");
                                   PosicionContactoEliminar=Leer.nextInt();
                                   for (int k = PosicionContactoEliminar-1; k <ContactosIngresados-2; k++) 
                                   {
                                       Contactos[k]=Contactos[k+1];
                                   }
                                   System.out.println("El contacto ha sido eliminado");
                                   ContactosIngresados=ContactosIngresados-1;
                                   
                               }
                               else
                               {
                                   System.out.println("Usted esta siendo rederigido al menu principal");
                                   salirDeContactos=true;
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
    
}
