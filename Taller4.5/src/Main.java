
import java.util.Scanner;


public class Main {

    public static void main(String[] args) 
    {
        Scanner Leer=new Scanner(System.in);  
        double apuntador;
        int columnadigitada;
        double columnas;
        int filadigitada;
        double filas;
        int i;
        int limite;
        String matrizresultados[][];
       
        boolean ver;
        // Inicializando variables
         String vectorimagen[]= new String[16];
        matrizresultados = new String[10][10];
        filadigitada = 0;
        columnadigitada = 0;
        filas = 10;
        columnas = 10;
        ver = true;
        limite = 14;
        // -------------------------------------------------------------------------------------------------------
        matrizresultados[0][0] = "1";
        matrizresultados[0][1] = "2";
        matrizresultados[0][2] = "3";
        matrizresultados[0][3] = "4";
        matrizresultados[0][4] = "5";
        matrizresultados[0][5] = "6";
        matrizresultados[0][6] = "7";
        matrizresultados[0][7] = "8";
        matrizresultados[0][8] = "9";
        matrizresultados[0][9] = "10";
        // ---
        matrizresultados[1][0] = "2";
        matrizresultados[1][1] = "4";
        matrizresultados[1][2] = "6";
        matrizresultados[1][3] = "8";
        matrizresultados[1][4] = "10";
        matrizresultados[1][5] = "12";
        matrizresultados[1][6] = "14";
        matrizresultados[1][7] = "16";
        matrizresultados[1][8] = "18";
        matrizresultados[1][9] = "20";
        // ---
        matrizresultados[2][0] = "3";
        matrizresultados[2][1] = "6";
        matrizresultados[2][2] = "9";
        matrizresultados[2][3] = "12";
        matrizresultados[2][4] = "15";
        matrizresultados[2][5] = "18";
        matrizresultados[2][6] = "21";
        matrizresultados[2][7] = "24";
        matrizresultados[2][8] = "27";
        matrizresultados[2][9] = "30";
        // ---
        matrizresultados[3][0] = "4";
        matrizresultados[3][1] = "8";
        matrizresultados[3][2] = "12";
        matrizresultados[3][3] = "16";
        matrizresultados[3][4] = "20";
        matrizresultados[3][5] = "24";
        matrizresultados[3][6] = "28";
        matrizresultados[3][7] = "32";
        matrizresultados[3][8] = "36";
        matrizresultados[3][9] = "40";
        // ----
        matrizresultados[4][0] = "5";
        matrizresultados[4][1] = "10";
        matrizresultados[4][2] = "15";
        matrizresultados[4][3] = "20";
        matrizresultados[4][4] = "25";
        matrizresultados[4][5] = "30";
        matrizresultados[4][6] = "35";
        matrizresultados[4][7] = "40";
        matrizresultados[4][8] = "45";
        matrizresultados[4][9] = "50";
        // ----
        matrizresultados[5][0] = "6";
        matrizresultados[5][1] = "12";
        matrizresultados[5][2] = "18";
        matrizresultados[5][3] = "24";
        matrizresultados[5][4] = "30";
        matrizresultados[5][5] = "36";
        matrizresultados[5][6] = "42";
        matrizresultados[5][7] = "48";
        matrizresultados[5][8] = "54";
        matrizresultados[5][9] = "60";
        // ---
        matrizresultados[6][0] = "7";
        matrizresultados[6][1] = "14";
        matrizresultados[6][2] = "21";
        matrizresultados[6][3] = "28";
        matrizresultados[6][4] = "35";
        matrizresultados[6][5] = "42";
        matrizresultados[6][6] = "49";
        matrizresultados[6][7] = "56";
        matrizresultados[6][8] = "63";
        matrizresultados[6][9] = "70";
        // -----
        matrizresultados[7][0] = "8";
        matrizresultados[7][1] = "16";
        matrizresultados[7][2] = "24";
        matrizresultados[7][3] = "32";
        matrizresultados[7][4] = "40";
        matrizresultados[7][5] = "48";
        matrizresultados[7][6] = "56";
        matrizresultados[7][7] = "64";
        matrizresultados[7][8] = "72";
        matrizresultados[7][9] = "80";
        // -----
        matrizresultados[8][0] = "9";
        matrizresultados[8][1] = "18";
        matrizresultados[8][2] = "27";
        matrizresultados[8][3] = "36";
        matrizresultados[8][4] = "45";
        matrizresultados[8][5] = "54";
        matrizresultados[8][6] = "63";
        matrizresultados[8][7] = "72";
        matrizresultados[8][8] = "81";
        matrizresultados[8][9] = "90";
        // --------
        matrizresultados[9][0] = "10";
        matrizresultados[9][1] = "20";
        matrizresultados[9][2] = "30";
        matrizresultados[9][3] = "40";
        matrizresultados[9][4] = "50";
        matrizresultados[9][5] = "60";
        matrizresultados[9][6] = "70";
        matrizresultados[9][7] = "80";
        matrizresultados[9][8] = "90";
        matrizresultados[9][9] = "100";
        vectorimagen[0] = "                             C O L U M N A S";
        vectorimagen[1] = "  I____________________________________________________________________________I";
        vectorimagen[2] = "  I     I  0   I  1   I  2   I  3   I  4   I  5   I  6   I  7   I  8   I  9     I";
        vectorimagen[3] = "   I____I_____ I_____ I_____ I_____ I______I______I______I______I______I________I";
        vectorimagen[4] = "   I  O I 1x1  I 2x1  I 3x1  I 4x1  I 5x1  I 6x1  I 7x1  I 8x1  I 9x1  I 10x1   I";
        vectorimagen[5] = "   I  1 I 1x2  I 2x2  I 3x2  I 4x2  I 5x2  I 6x2  I 7x2  I 8x2  I 9x2  I 10x2   I";
        vectorimagen[6] = " F I  2 I 1x3  I 2x3  I 3x3  I 4x3  I 5x3  I 6x3  I 7x3  I 8x3  I 9x3  I 10x3   I";
        vectorimagen[7] = " I I  3 I 1x4  I 2x4  I 3x4  I 4x4  I 5x4  I 6x4  I 7x4  I 8x4  I 9x4  I 10x4   I";
        vectorimagen[8] = " L I  4 I 1x5  I 2x5  I 3x5  I 4x5  I 5x5  I 6x5  I 7x5  I 8x5  I 9x5  I 10x5   I";
        vectorimagen[9] = " A I  5 I 1x6  I 2x6  I 3x6  I 4x6  I 5x6  I 6x6  I 7x6  I 8x6  I 9x6  I 10x6   I";
        vectorimagen[10] = " S I  6 I 1x7  I 2x7  I 3x7  I 4x7  I 5x7  I 6x7  I 7x7  I 8x7  I 9x7  I 10x7   I";
        vectorimagen[11] = "   I  7 I 1x8  I 2x8  I 3x8  I 4x8  I 5x8  I 6x8  I 7x8  I 8x8  I 9x8  I 10x8   I";
        vectorimagen[12] = "   I  8 I 1X9  I 2X9  I 3X9  I 4X9  I 5X9  I 6X9  I 7X9  I 8X9  I 9X9  I 10X9   I";
        vectorimagen[13] = "   I  9 I 1x10 I 2x10 I 3x10 I 4x10 I 5x10 I 6x10 I 7x10 I 8x10 I 9x10 I 10x10  I";
        vectorimagen[14] = "  I____________________________________________________________________________I";
        vectorimagen[15] = " ";
        do {
                VisualizaImagen(vectorimagen);
                IngresarDatos(matrizresultados);
//                
        } while (ver!=false);
 
    } 
    //------
    public static void VisualizaImagen(String x[])
    {
        for (int i = 0; i <x.length; i++) {
            System.out.println(x[i]);  
        }
                                                                                                                            
    }
    public static void IngresarDatos(String x[][])
    {
        int filadigitada,columnadigitada ;
        Scanner Leer=new Scanner(System.in);  
        System.out.println("por favor digite la fila de la cual espera obtener el resultado:\n");
                filadigitada =Leer.nextInt();
                System.out.println("por favor digite la columna de la cual espera obtener el resultado");
                columnadigitada =Leer.nextInt();
                System.out.printf("El resultado de: %s X %s=%s ",columnadigitada+1,filadigitada+1,x[filadigitada][columnadigitada]);
        
    }
}
