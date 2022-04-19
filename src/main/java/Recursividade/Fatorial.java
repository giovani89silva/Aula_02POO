package Recursividade;

public class Fatorial {
    
    public long Fatorial(int n)
    {
        //  CASO BASE
        if(n == 0)
           return 1;
        else // PASSO FATORIAL
            return n * Fatorial(n-1);
        
    } 
    
}
