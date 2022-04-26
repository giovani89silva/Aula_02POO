package Exercicio_250422;

public class Notebook extends computador {
    
    private float DurBateria;

    public Notebook() {
    }
        
    public Notebook(float DurBateria, String Marca, String Processador,
            float capacidadeMemoria, float capacidadeHD)
    
    {
        super(Marca, Processador, capacidadeMemoria, capacidadeHD);
        this.DurBateria = DurBateria;        
    }

    public float getDurBateria() {
        return DurBateria;
    }

    public void setDurBateria(float DurBateria) {
        this.DurBateria = DurBateria;
    }
    
   
    
    
    
}
