package Recursividade;

public class Potencia {
    
    public int Potencia( int x, int n) {
        
        if ( n == 0 )//caso base
            return 1;
        else
            return x * Potencia(x, n - 1);//passo recursivo
        
    }
    
}
