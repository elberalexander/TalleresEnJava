
public class main {

    public static void main(String[] args) 
    {
        int contadorPrimo=0;
	int VectorNumeros[]=new int[1000];
	int Apuntador=0;
	int Limite=1000;
        for (int i =1; i <=Limite; i++)
        {
            for (int j = 1; j <=i; j++)
            {
                if(i%j==0)
                    contadorPrimo=contadorPrimo+1;                
            }
            if(contadorPrimo==2)
            {
                VectorNumeros[Apuntador]=i;
		Apuntador=Apuntador+1;            
            } 
            contadorPrimo=0;      
        }
        System.out.printf("Números primos desde 1 hasta %s \n",Limite);
        for (int i = 0; i <=Apuntador-1; i++) 
        {
            System.out.printf(VectorNumeros[i]+" ");   
        }    
    }
    
}
