
import java.util.Scanner;


public class Main {

    public static void main(String[] args) 
    {
         Scanner Leer=new Scanner(System.in);
         boolean repetir=true;   
        boolean VanderaAgregarResultados=false;
        String ResultadoObtenido;
        String TotalDatosConResultado;	
        String TipoDeLicenciaSolicitada="";
        String NumeroDeCedula="";
        String NombreAlumno="";
        String TelefonoDelAlumno="";
        String DatosTotalesAlumno;
        int j;
        boolean Salir=true;
        boolean AlumnosRegistrados=false;
        int AlumnosIngresados=0;
        boolean continuar=true;
        int Numero_Repeticiones=0;
        String DatosUnicosDelAlumno="";
        String DatosVariablesDelAlumno="";
        int NumeroContactosGuardar=0;
        int PosicionAnexoResultado=0;
        int N=10;
        boolean RegistrarResultadoExamen=false;
        int opcion;
        //------------------------
        String MaximoAlumnos[]=new String[8];
        String Calificaciones[]=new String[8];
        String GuardaDatosIniciales[]=new String[8];
    
        do
        {
                continuar=true;
                AlumnosRegistrados=false;
                 MenuPrincipal();
                opcion=Leer.nextInt();
              switch(opcion)
                {
                    case 1:
                        while(continuar==true && AlumnosIngresados<8)
                        {
                            for (int i = 0; i <=Numero_Repeticiones; i++)
                            {
                                System.out.println(" ");
                                System.out.printf("---Usted esta ingresando Datos del alumno número %s --- \n",AlumnosIngresados+1);
                                System.out.println(" ");
                                while(NombreAlumno=="")
                                {
                                    Leer.nextLine();
                                    System.out.println("Por favor ingrese el nombre del alumno");
                                    NombreAlumno=Leer.nextLine()+" ";	
                                }
                                while(NumeroDeCedula=="")
                                {
                                    System.out.println("Por favor ingrese número de cedula del alumno");
                                    NumeroDeCedula=Leer.nextLine()+" ";		
                                }
                                 while(TelefonoDelAlumno=="")
                                {
                                    System.out.println("Por favor ingrese número telefonico del alumno");
                                    TelefonoDelAlumno=Leer.nextLine()+" ";		
                                }
                                //----------------------
                                while(TipoDeLicenciaSolicitada=="")
                                {
                                    System.out.println("Por favor ingrese la licencia solicitada");
                                    TipoDeLicenciaSolicitada=Leer.nextLine()+" ";		
                                }
                                //--------------------
                                DatosVariablesDelAlumno=TelefonoDelAlumno+TipoDeLicenciaSolicitada;
                                DatosUnicosDelAlumno=NombreAlumno+NumeroDeCedula;
                                System.out.println("DatosUnicosDelAlumno");
                                DatosTotalesAlumno=DatosUnicosDelAlumno+DatosVariablesDelAlumno;
                                MaximoAlumnos[AlumnosIngresados]=DatosTotalesAlumno; 
                                GuardaDatosIniciales[AlumnosIngresados]=DatosTotalesAlumno;
                                NombreAlumno="";
                                NumeroDeCedula="";
                                TelefonoDelAlumno="";
                                TipoDeLicenciaSolicitada="";
                                System.out.println(MaximoAlumnos[AlumnosIngresados]);
                                AlumnosIngresados=AlumnosIngresados+1;
                                System.out.println("Responda true o false para agregar otro Alumno");
                                continuar=Leer.nextBoolean();
                                
                                if(continuar==false)
                                    continuar=false;
                            }
                            if(AlumnosIngresados>=8)
                                System.out.println("haz completado el cupo maximo de alumnos en el curso, a continuación te redirigiremos al Menú Principal");
                        }	
                    break;
                    case 2:
                        if(AlumnosIngresados==0)
                            Salir=false;				

                        if(Salir==false)
                        {
                             Salir=SinRegistrarCarros(Salir);
                        }
                        else
                        {
                             while(AlumnosRegistrados==false)
                             {
                                 System.out.println("---listado de alumnos ----");
                                 for (int i = 0; i <=AlumnosIngresados-1; i++)
                                 {
                                     System.out.printf("Alumno %s:,%s \n",i+1,MaximoAlumnos[i]);   
                                 }
                                 System.out.println("digite true para volver al menú principal");
                                 //Salir=Leer.nextBoolean();
                                 AlumnosRegistrados=Leer.nextBoolean();
                             }
                        }
                    break;
                    case 3:
                        if(AlumnosIngresados==0)
                            Salir=false;				
					
                        if(Salir==false)
                        {
                            Salir=SinRegistrarCarros(Salir);
                        }
                        else
                        {
                            while(AlumnosRegistrados==false)
                            {
                                System.out.println("---listado de alumnos registrados----");
                                Leer.nextLine();
                                for (int i = 0; i <=AlumnosIngresados-1; i++) 
                                {
                                    System.out.printf("Alumno %s: %s\n",i+1,MaximoAlumnos[i]);   
                                }
                                
                                System.out.println("Desea agregar el resultado de la prueba a un alumno?, responda true o false segun sea el caso");
                                RegistrarResultadoExamen=Leer.nextBoolean();

                                if(RegistrarResultadoExamen==true)
                                {
                                    while(VanderaAgregarResultados==false)
                                    {
                                        System.out.println("Por favor ingrese el número que representa al alumno al que agregara el resultado");
                                        PosicionAnexoResultado=Leer.nextInt();
                                        if(PosicionAnexoResultado>AlumnosIngresados)
                                            System.out.println("Error el alumno no existe, por favor ingrese un valor valido");
                                        else
                                         VanderaAgregarResultados=true;
                                    }
                                    VanderaAgregarResultados=false;
                                    Leer.nextLine();
                                    System.out.println("por favor ingresa el resultado obtenido por el alumno");
                                    ResultadoObtenido=Leer.nextLine();
                                    ResultadoObtenido="Estado: "+ResultadoObtenido;
                                    Calificaciones[PosicionAnexoResultado-1]=ResultadoObtenido;
                                    System.out.println(Calificaciones[PosicionAnexoResultado-1]);
                                    TotalDatosConResultado=GuardaDatosIniciales[PosicionAnexoResultado-1]+Calificaciones[PosicionAnexoResultado-1];
                                    MaximoAlumnos[PosicionAnexoResultado-1]=TotalDatosConResultado;
                                    TotalDatosConResultado="";									

                                }
                                else
                                {
                                    System.out.println("Usted esta siendo redirigido al menu principal");
                                    AlumnosRegistrados=true;
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
    public static void MenuPrincipal()
    {        
        System.out.println("  ");
        System.out.println("------------Por favor elige una opcion---------------");
        System.out.println("1 Registrar alumno");
        System.out.println("2 Resumen de resultados");
        System.out.println("3 Asignar resultados de la prueva");
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
