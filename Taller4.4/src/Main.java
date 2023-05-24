
public class Main {

    public static void main(String[] args) {
        
	
	int  filas=0;
        
       
	String matriz[][]=new String[4][5];
        matriz[0][0]="01";
	matriz[0][1]="02";
	matriz[0][2]="03";
	matriz[0][3]="04";
	matriz[0][4]="05";
	matriz[1][0]="06";
	matriz[1][1]="07";
	matriz[1][2]="08";
	matriz[1][3]="09";
	matriz[1][4]="10";
	matriz[2][0]="11";
	matriz[2][1]="12";
	matriz[2][2]="13";
	matriz[2][3]="14";
	matriz[2][4]="15";
	matriz[3][0]="16";
	matriz[3][1]="17";
	matriz[3][2]="18";
	matriz[3][3]="19";
	matriz[3][4]="20";
        
        while(filas<=3)
        {
            filas=generaMatriz(matriz,filas);//		  	
        }
        
        
    }
    public static int generaMatriz(String x[][],int filas)
    {
        int limite=4;
	//int  filas=0;
        int Columnas;
       for(Columnas=0;Columnas<=limite;Columnas++)
                {
                    System.out.printf( x[filas][Columnas]+" ");
                }
                System.out.println(" ");
                filas=filas+1;
                for(Columnas=4;Columnas>=0;Columnas--)
                    
                    {
                        System.out.printf( x[filas][Columnas]+" ");
                    }
                filas=filas+1;
                System.out.println(" ");  
     return filas ;   
    }
    
}
