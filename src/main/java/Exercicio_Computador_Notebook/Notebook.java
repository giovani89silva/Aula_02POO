package Exercicio_Computador_Notebook;

public class Notebook extends Computador {

    private float DurBateria;

    public Notebook() {
    }

    public Notebook(float DurBateria, String Marca, String Processador,
            float capacidadeMemoria, float capacidadeHD) {
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
