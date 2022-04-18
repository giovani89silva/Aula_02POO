package POO;

public class Carro {

    // Atributos
    private String Marca;
    private String Modelo;
    private int Ano;
    private boolean temAirBag;
    private String Cor;
    String setCor;
    
    //String setCor;
   
    // Metodos
    // Construtores
    // A regra bÃ¡sica Ã© de que o metodo construtor deve possuir o mesmo nome da classe
    //--------------
    public Carro(String Marca, String Modelo, int Ano, boolean temAirBag, String Cor) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.temAirBag = temAirBag;
        this.Cor = Cor;
    }

    public Carro(String Marca, String Modelo, int Ano, boolean temAirBag) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.temAirBag = temAirBag;
    }

    public Carro() {
    }

    // Metodos
    public void Parar(){
        System.out.println("O " + this.Modelo + " parou!");
    }

    @Override
    public String toString() {
        return "Carro { Marca = " + this.Marca
                + ", Modelo = " + this.Modelo
                + ", Ano = " + this.Ano
                + ", temAirBag = " + this.temAirBag
                + ", Cor = " + this.Cor + "}";
    }

    public String VoltouAndar() {
        return this.Modelo + " voltou a andar!";
        
        //GETTER AND SETTERS ATALHO ALT+INSERT
          
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public boolean getTemAirBag() {
        return temAirBag;
    }

    public void setTemAirBag(boolean temAirBag) {
        this.temAirBag = temAirBag;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
}
