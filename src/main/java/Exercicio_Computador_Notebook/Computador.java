package Exercicio_Computador_Notebook;

public class Computador {

    private String Marca;
    private String Processador;
    private float capacidadeMemoria;
    private float capacidadeHD;
    private boolean bomParaJogo;

    public Computador() {
    }

    public Computador(String Marca, String Processador, float capacidadeMemoria, float capacidadeHD) {
        this.Marca = Marca;
        this.Processador = Processador;
        this.capacidadeMemoria = capacidadeMemoria;
        this.capacidadeHD = capacidadeHD;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getProcessador() {
        return Processador;
    }

    public void setProcessador(String Processador) {
        this.Processador = Processador;
    }

    public float getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(float capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public float getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(float capacidadeHD) {
        this.capacidadeHD = capacidadeHD;
    }

    public boolean getBomParaJogo() {
        return bomParaJogo;
    }

    public void setBomParaJogo(boolean bomParaJogo) {
        if ( capacidadeMemoria > 8 && capacidadeHD > 498)
            this.bomParaJogo = true;                 
        
        else 
            this.bomParaJogo = false;             
    } 
   
     public boolean isBomParaJogo() {
        if ( capacidadeMemoria > 8 && capacidadeHD > 500)
            return true;                 
        
        else 
            return false;             
    } 

}
